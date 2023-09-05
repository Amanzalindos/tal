package com.example.oper;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class operacionesTest extends TestCase {

    private operaciones mOperacion;

    @Before
    public void setUp(){
        mOperacion = new operaciones();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    @Test
    public void suma() throws Exception {
        assertEquals("7",mOperacion.suma("3","4"));
    }

    @Test
    public void resta() throws Exception {
        assertEquals("1", mOperacion.resta("3","4"));
    }

    @Test
    public void multiplicar() throws Exception {
        assertEquals("9", mOperacion.multiplicar("3","3"));
    }


    public void testDividir() throws Exception {
        assertEquals("9", mOperacion.multiplicar("3","3"));
    }

    public void testAlcuadrado()throws Exception {
        assertEquals("18", mOperacion.multiplicar("6","3"));
    }
}