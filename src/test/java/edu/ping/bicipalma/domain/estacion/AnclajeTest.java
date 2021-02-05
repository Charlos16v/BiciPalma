package edu.ping.bicipalma.domain.estacion;

import edu.ping.bicipalma.domain.bicicleta.Bicicleta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnclajeTest {

    private Anclaje anclaje = null;
    private Bicicleta bici = null;

    @Before
    public void setupAnclaje() {
        this.bici = new Bicicleta(180);
        this.anclaje = new Anclaje(true, this.bici);
        assertNotNull(anclaje);
        assertNotNull(bici);
    }

    @Test
    public void constructorTest() {
        assertNotNull(anclaje);
    }

    @Test
    public void isOcupado() {
        assertTrue(this.anclaje.isOcupado());
    }

    @Test
    public void getBici() {
        assertEquals(180, this.anclaje.getBici().getId());
    }

    @Test
    public void anclarBici() {
        Bicicleta bicicleta = new Bicicleta(1);
        this.anclaje.anclarBici(bicicleta);
        assertTrue(this.anclaje.isOcupado());
    }

    @Test
    public void liberarBici() {
        Bicicleta bicicleta = new Bicicleta(2);
        this.anclaje.liberarBici(bicicleta);
        assertFalse(this.anclaje.isOcupado());
    }
}

