package edu.ping.bicipalma.domain.estacion;

public class Estacion {

    /*Inicializamos parametros id= int es el identificador de la estacion, direccion= String y indica la direccion de la estacion,
    anclajes= Objeto "Anclajes", un array estatico que contiene objetos "Anclaje" que indican el numero de anclajes para moviles de la estacion.
     */

    private final int id;
    private final String direccion;
    private final int anclajes;

    //Constructor de clase "Estacion"
    public Estacion(int id, String direccion, int numAnclajes){
        this.id  = id;
        this.direccion = direccion;
        this.anclajes = numAnclajes;
    }

    //Getter de "id"
    public int getId() {
        return id;
    }

    //Getter de "direccion"
    public String getDireccion() {
        return direccion;
    }

    //Getter de "anclajes"
    public int getAnclajes() {
        return anclajes;
    }

    //Override del metodo toString() para adaptarlo a nuestras necesidades, en este caso obtener los parametros de Estacion
    @Override
    public String toString() {
        return 	"id: " + getId() + '\n' +
                "direccion: " + getDireccion() + '\n' +
                "numeroAnclajes: " + getAnclajes();
    }

    //Metodo encargado de printear todos los parametros del objeto "Estacion"
    public void consultarEstacion(){
        System.out.println(this);
    }

}
