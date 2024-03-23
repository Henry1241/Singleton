/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author enri0
 */
public class frmProyectTest {
    
    public frmProyectTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculo method, of class frmProyect.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        String dato1 = "Hola";
        String dato2 = "";
        String signo = "";
        String expResult = "";
        String result = frmProyect.calculo(dato1, dato2, signo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existepunto method, of class frmProyect.
     */
    @Test
    public void testExistepunto() {
        System.out.println("existepunto");
        String cadena = "";
        boolean expResult = false;
        boolean result = frmProyect.existepunto(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class frmProyect.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        frmProyect.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
