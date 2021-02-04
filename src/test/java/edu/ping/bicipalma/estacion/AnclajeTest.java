package edu.ping.bicipalma.estacion;

import edu.ping.bicipalma.domain.estacion.Anclaje;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnclajeTest {

    private Anclaje anclaje = null;

    @Before
    public void setupAnclaje() {
        this.anclaje = new Anclaje();
        assertNotNull(anclaje);
    }

    @Test
    public void constructorTest() {
        assertNotNull(anclaje);
    }

    @Test
    public void isOcupado() {}
}

