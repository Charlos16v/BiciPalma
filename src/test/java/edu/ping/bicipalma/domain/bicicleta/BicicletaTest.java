package edu.ping.bicipalma.domain.bicicleta;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BicicletaTest {

    private Bicicleta bicicleta = null;

    @Before
    public void setupBicicleta() {
        this.bicicleta = new Bicicleta(1);
        assertNotNull(bicicleta);
    }

    @Test
    public void constructorTest() {
        assertNotNull(bicicleta);
    }

    @Test
    public void getIdTest() {
        assertEquals(1,this.bicicleta.getId());
    }
}
