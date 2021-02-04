package edu.ping.bicipalma.domain.bicicleta;

public class Patinete implements Movil {

    //Inicializamos
    private final int id;

    //Constructor
    public Patinete(int id) {
        this.id = id;
    }

    //Getter id
    public int getId() {
        return id;
    }

    //Override de metodo toString()
    @Override
    public String toString() {
        return Integer.toString(getId());
    }
}
