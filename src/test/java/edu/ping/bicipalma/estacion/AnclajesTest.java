package edu.ping.bicipalma.estacion;

import edu.ping.bicipalma.domain.estacion.Anclajes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnclajesTest {

    private Anclajes[] anclajes = null;

    @Before
    public void setupAnclajes() {
        this.anclajes = new Anclajes[10];
        assertNotNull(anclajes);
    }

    @Test
    public void constructorTest(){
        assertNotNull(anclajes);
    }

    @Test
    public void crearAnclajesTest() {
        assertEquals(10, anclajes.length);
    }
}

