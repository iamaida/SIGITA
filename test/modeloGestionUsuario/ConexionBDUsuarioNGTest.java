/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

import modeloGestionUsuario.Usuario;
import modeloGestionUsuario.ConexionBDUsuario;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class ConexionBDUsuarioNGTest {
    
    public ConexionBDUsuarioNGTest() {
    }

    /**
     * Test of consultarUsuario method, of class ConexionBDUsuario.
     */
    @Test
    public void testConsultarUsuario() {
        System.out.println("consultarUsuario");
        String codigo = "";
        ConexionBDUsuario instance = new ConexionBDUsuario();
        Usuario expResult = null;
        Usuario result = instance.consultarUsuario(codigo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarUsuarioLogin method, of class ConexionBDUsuario.
     */
    @Test
    public void testConsultarUsuarioLogin() {
        System.out.println("consultarUsuarioLogin");
        String password = "";
        String nUser = "";
        ConexionBDUsuario instance = new ConexionBDUsuario();
        Usuario expResult = null;
        Usuario result = instance.consultarUsuarioLogin(password, nUser);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarUsuario method, of class ConexionBDUsuario.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        String campoCambio = "";
        String valorCambio = "";
        String codigo = "";
        ConexionBDUsuario instance = new ConexionBDUsuario();
        instance.actualizarUsuario(campoCambio, valorCambio, codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarUsuario method, of class ConexionBDUsuario.
     */
    @Test
    public void testInsertarUsuario() {
        System.out.println("insertarUsuario");
        Usuario miUsuario = null;
        ConexionBDUsuario instance = new ConexionBDUsuario();
        instance.insertarUsuario(miUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatoEncontrado method, of class ConexionBDUsuario.
     */
    @Test
    public void testGetDatoEncontrado() {
        System.out.println("getDatoEncontrado");
        ConexionBDUsuario instance = new ConexionBDUsuario();
        boolean expResult = false;
        boolean result = instance.getDatoEncontrado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
