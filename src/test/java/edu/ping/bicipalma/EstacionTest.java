package edu.ping.bicipalma;

import edu.ping.bicipalma.domain.estacion.Estacion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EstacionTest {

    private Estacion estacion = null;

    @Before
    public void setup_estacion() {
        this.estacion = new Estacion(69,"Aragón",10);
        assertNotNull(estacion);
    }

    @Test
    public void constructorTest() {
        assertNotNull(estacion);
    }

    @Test
    public void getIdTest() {
        assertEquals(69,this.estacion.getId());
    }

    @Test
    public void getDireccionTest() {
        assertEquals("Aragón", this.estacion.getDireccion());
    }

    @Test
    public void getNumAnclajesTest() {
        assertEquals(10, this.estacion.getAnclajes());
    }

}
