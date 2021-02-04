package edu.ping.bicipalma.domain.estacion;

import edu.ping.bicipalma.domain.bicicleta.Movil;

public class Anclaje {

    //Inicializadores, bici implementa la interfaz Movil
    private  boolean ocupado = false;
    private Movil bici;

    //Constructor
    public Anclaje() {}


    //Getter del parametro booleano "ocupado"
    boolean isOcupado() {
        return this.ocupado;
    }

    //Getter de bici que implementa la interfaz Movil
    Movil getBici() {
        return this.bici;
    }

    //Metodo para anclar bici, al implementar la interfaz movil se la pasamos al metodo, ocupado queda en true
    void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    //Metodo para anclar bici, al implementar la interfaz movil se la pasamos al metodo, ocupado queda en false
    void liberarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = false;
    }

    //Overrride del metodo toString() adaptado para devolver el estado del anclaje (ocupado = true or ocupado = false )
    @Override
    public String toString() {
        return "ocupada: " + Boolean.toString(isOcupado());
    }
}
