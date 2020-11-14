/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

import modeloGestionUsuario.Usuario;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class UsuarioNGTest {
    
    public UsuarioNGTest() {
    }

    /**
     * Test of setCargo method, of class Usuario.
     */
    @Test
    public void testSetCargo() {
        
        String cargo = "Administrador";
        Usuario user = new Usuario();
        user.setCargo(cargo);
        String expResult = cargo;
        String result = user.getCargo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setCodigo method, of class Usuario.
     */
    @Test
    public void testSetCodigo() {
 
        String codigo = "A-001";
        Usuario user = new Usuario();
        user.setCodigo(codigo);
        String expResult = codigo;
        String result = user.getCodigo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setNombreUsuario method, of class Usuario.
     */
    @Test
    public void testSetNombreUsuario() {
        
        String nombreUsuario = "Mario Casado";
        Usuario user = new Usuario();
        user.setNombreUsuario(nombreUsuario);
        String expResult = nombreUsuario;
        String result = user.getNombreUsuario();
        assertEquals(result,expResult);
    }

    /**
     * Test of setContrasenha method, of class Usuario.
     */
    @Test
    public void testSetContrasenha() {
        
        String contrasenha = "bM001";
        Usuario user = new Usuario();
        user.setContrasenha(contrasenha);
        String expResult = contrasenha;
        String result = user.getContrasenha();
        assertEquals(result,expResult);

    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        
        String estado = "Activo";
        Usuario user = new Usuario();
        user.setEstado(estado);
        String expResult = estado;
        String result = user.getEstado();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCargo method, of class Usuario.
     */
    @Test
    public void testGetCargo() {
        
        Usuario user = new Usuario();
        String cargo = "Cajero";
        user.setCargo(cargo);
        String result = user.getCargo();
        assertTrue(result.equals(cargo));

    }

    /**
     * Test of getCodigo method, of class Usuario.
     */
    @Test
    public void testGetCodigo() {
        
        Usuario user = new Usuario();
        String codigo = "C-001";
        user.setCodigo(codigo);
        String result = user.getCodigo();
        assertTrue(result.equals(codigo));
    }

    /**
     * Test of getNombreUsuario method, of class Usuario.
     */
    @Test
    public void testGetNombreUsuario() {
        
        Usuario user = new Usuario();
        String nombreU = "cLaura";
        user.setNombreUsuario(nombreU);
        String result = user.getNombreUsuario();
        assertTrue(result.equals(nombreU));
    }

    /**
     * Test of getContrasenha method, of class Usuario.
     */
    @Test
    public void testGetContrasenha() {
       
        Usuario user = new Usuario();
        String cont = "cL001";
        user.setContrasenha(cont);
        String result = user.getContrasenha();
        assertTrue(result.equals(cont));

    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
       
        Usuario user = new Usuario();
        String estado = "Activo";
        user.setEstado(estado);
        String result = user.getEstado();
        assertTrue(result.equals(estado));

    }
    
}
