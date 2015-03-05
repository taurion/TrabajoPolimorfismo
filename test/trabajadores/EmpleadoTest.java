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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testNombre(){
        Empleado empleado = new Empleado();
        empleado.setNombre("Jose");
        assertEquals("Jose", empleado.getNombre());
    }
    
    @Test
    public void testApellido(){
        Empleado empleado = new Empleado();
        empleado.setApellido("Cara");
        assertEquals("Cara", empleado.getApellido());
    }
    @Test
    public void testSueldo(){
        Empleado empleado = new Empleado();
       empleado.setSueldo(new BigDecimal("1000"));
        assertEquals(0, empleado.getSueldo().compareTo(new BigDecimal("1000")));
    }
      @Test
    public void testRetencionIRPF(){
        Empleado empleado = new Empleado();
        empleado.setIRPF(new BigDecimal("0.25"));
        assertEquals(0, empleado.getIRPF().compareTo(new BigDecimal("0.25")));
    }
    
         @Test
    public void testId(){
        Empleado empleado = new Empleado();
        empleado.setId(1);
        assertEquals(1, empleado.getId());
    }
         @Test
    public void testCalcularCantidadAPagarle(){
        Empleado empleado = new Empleado();
         empleado.setSueldo(new BigDecimal("1000"));
         empleado.setIRPF(new BigDecimal("0.25"));
        assertEquals(0, empleado.calcularCantidadAPagarle().compareTo(new BigDecimal("750")));
    }
}
