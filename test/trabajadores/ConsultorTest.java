/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ConsultorTest {
    
    public ConsultorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularCantidadAPagarle method, of class Consultor.
     */
    @Test
    public void testCalcularCantidadAPagarle() {
        
        Consultor instance = new Consultor();
       instance.setTarifa(new BigDecimal("1000"));
       instance.setNumeroDeHoras(new BigDecimal("20"));
       BigDecimal expResult = new BigDecimal("20000");
       BigDecimal result = instance.calcularCantidadAPagarle();
        assertEquals(0, expResult.compareTo(result));
    }

   
    
}
