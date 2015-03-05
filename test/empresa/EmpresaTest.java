/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import trabajadores.Consultor;
import trabajadores.Empleado;
import trabajadores.Trabajador;

/**
 *
 * @author Usuario
 */
public class EmpresaTest {

    static ArrayList<Trabajador> trabajadores = new ArrayList<>();

    public EmpresaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        Empleado em1 = new Empleado();
        em1.setId(1);
        em1.setNombre("Juan");
        em1.setApellido("Garcia");
        em1.setApellido2("Lo");
        em1.setIRPF(new BigDecimal("0.25"));
        em1.setSueldo(new BigDecimal("1000"));

        Consultor con1 = new Consultor();
        con1.setNombre("Maria");
        con1.setApellido("Lopez");
        con1.setApellido2("Maya");
        con1.setNumeroDeHoras(new BigDecimal("10"));
        con1.setTarifa(new BigDecimal("100"));
        
        trabajadores.add(em1);
        trabajadores.add(con1);

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

    @Test
    public void testCalcularCantidadTotalAPagarTrabajadores() {

    }

}
