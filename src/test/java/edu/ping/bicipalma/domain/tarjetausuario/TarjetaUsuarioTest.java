package edu.ping.bicipalma.domain.tarjetausuario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TarjetaUsuarioTest {

    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void setupTarjetaUsuario() {
        this.tarjetaUsuario = new TarjetaUsuario("1213454", true);
        assertNotNull(tarjetaUsuario);
    }

    @Test
    public void constructorTest() {
        assertNotNull(tarjetaUsuario);
    }

    @Test
    public void isActivadaTest() {
        assertTrue(tarjetaUsuario.isActivada());
    }
}
