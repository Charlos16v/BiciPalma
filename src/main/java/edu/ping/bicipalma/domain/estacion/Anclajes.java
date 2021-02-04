package edu.ping.bicipalma.domain.estacion;

public class Anclajes {

    //Inicializamos un array que contiene objeto "Anclaje"
    private final Anclaje[]  anclajes;

    //Constructor al cual le pasamos el numero de anclajes, y crea el array de objetos "Anclaje"
    public Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    //Metodo encargado de crear objetos "Anclaje" a partir de la longitud de anclajes
    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    // anclajes() => getAnclajes()
    Anclaje[] getAnclajes() {
        return this.anclajes;
    }

    //Metodo encargado de devolver la cantidad de anclajes a partir de su longitud
    int numAnclajes() {
        return anclajes.length;
    }
}
