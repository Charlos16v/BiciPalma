package edu.ping.bicipalma.domain.estacion;

import edu.ping.bicipalma.domain.bicicleta.Movil;
import edu.ping.bicipalma.domain.tarjetausuario.Autenticacion;

import java.util.Arrays;
import java.util.Optional;

public class Estacion {

    /*
     * Inicializamos parametros id= int es el identificador de la estacion,
     * direccion= String y indica la direccion de la estacion, anclajes= Objeto
     * "Anclajes", un array estatico que contiene objetos "Anclaje" que indican el
     * numero de anclajes para moviles de la estacion.
     */

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    // Constructor de clase "Estacion"
    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    // Getter de "id"
    public int getId() {
        return id;
    }

    // Getter de "direccion"
    public String getDireccion() {
        return direccion;
    }

    // Override del metodo toString() para adaptarlo a nuestras necesidades, en este
    // caso obtener los parametros de Estacion
    @Override
    public String toString() {
        return "id: " + getId() + '\n' + "direccion: " + getDireccion() + '\n' + "numeroAnclajes: " + numAnclajes();
    }

    // Acceso a Anclajes

    private Anclaje[] anclajes() {
        return this.anclajes.anclajes();
    }

    public int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    // Metodo encargado de printear todos los parametros del objeto "Estacion"
    public void consultarEstacion() {
        System.out.println(this);
    }

    // Metodo encargado de recorrer el array de objetos Anclaje, indicando los que
    // se encuentran "libres"
    public int anclajesLibres() {

        int anclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            if (!anclaje.isOcupado()) {
                anclajesLibres += 1;
            }
        }
        return anclajesLibres;
    }

    // Metodo encargado de recorrer el array de objetos Anclaje, comprobando y
    // indicando si estos estan libres o no, indicando la bici y su estado
    public void consultarAnclajes() {

        Arrays.stream(anclajes())
                .map(a -> Optional.ofNullable(a.getBici()))
                .forEach(bici -> System.out.print("Anclaje " +
                        (bici.isPresent()? bici.get(): "libre")
                        + '\n'));
    }

    //Metodo encargado de devolver la información del id de la bicicleta y el anclaje donde se encuentra anclada, en el momento de anclar
    private void mostrarAnclaje(Movil bicicleta, int numeroAnclaje) {
        System.out.println("bicicleta: " + bicicleta.getId() +
                " anclada en el anclaje: " + numeroAnclaje);
    }

    //Metodo encargado de devolver la informacion del id de la bicicleta y el anclaje donde se encuentra anclada, en el momento de retirar
    private void mostrarBicicleta(Movil bicicleta/*, int numeroAnclaje*/) {
        System.out.println("bicicleta: " + bicicleta.getId() + " retirada!" /*+ " del anclaje: " + numeroAnclaje*/);
    }

    //Metodo encargado de buscar anclajes libres, si es asi, anclar la bicicleta al anclaje libre
    public void anclarBicicleta(Movil bici) {

        Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes())
                .filter(a -> !a.isOcupado())
                .findAny();

        if (anclajeLibre.isPresent()) {
            anclajeLibre.get()
                    .anclarBici(bici);
        } else {
            System.out.println("No disponemos de anclajes libres para la bici: " + bici);
        }
    }


    //Metodo encargado de localizar una posicion de anclaje ocupada para retirar una bicicleta
    public void retirarBicicleta(Autenticacion tarjetaUsuario) {

        if (leerTarjetaUsuario(tarjetaUsuario)) {

            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes()).filter(Anclaje::isOcupado).findAny();

            if (anclajeOcupado.isPresent()) {

                mostrarBicicleta(anclajeOcupado.get().getBici());
                anclajeOcupado.get().liberarBici();

            } else {
                System.out.println("No hay bicis disponibles");
            }

        } else {
            System.out.println("Lo sentimos la tarjeta de usuario no esta activada");
        }
    }

    //
    public boolean leerTarjetaUsuario(Autenticacion tarjetaUsuario) {
        return tarjetaUsuario.isActivada();
    }

}
