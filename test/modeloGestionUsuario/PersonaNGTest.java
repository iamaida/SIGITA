/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

import modeloGestionUsuario.Persona;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class PersonaNGTest {
    
    public PersonaNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        
        String nombre = "Paco Delgado";
        Persona persona = new Persona();
        persona.setNombre(nombre);
        String expResult = nombre;
        String result = persona.getNombre();
        assertEquals(result,expResult);
    }

    /**
     * Test of setDocId method, of class Persona.
     */
    @Test
    public void testSetDocId() {
        
        String docId = "1.143.860.120";
        Persona persona = new Persona();
        persona.setDocId(docId);
        String expResult = docId;
        String result = persona.getDocId();
        assertEquals(result,expResult);
    }

    /**
     * Test of setFechaRegistro method, of class Persona.
     */
    @Test
    public void testSetFechaRegistro() {
        
        String fechaRegistro = "2020-11-10";
        Persona persona = new Persona();
        persona.setFechaRegistro(fechaRegistro);
        
        String expResult = fechaRegistro;
        String result = persona.getFechaRegistro();
        assertEquals(result,expResult);
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        
        String direccion = "Av. 65 # 34-10";
        Persona persona = new Persona();
        persona.setDireccion(direccion);
        
        String expResult = direccion;
        String result = persona.getDireccion();
        assertEquals(result,expResult);
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        
        String telefono = "3354731";
        Persona persona = new Persona();
        persona.setTelefono(telefono);
        
        String expResult = telefono;
        String result = persona.getTelefono();
        assertEquals(result,expResult);
    }

    /**
     * Test of setEmail method, of class Persona.
     */
    @Test
    public void testSetEmail() {
        
        String email = "camiloA@uncorreo.com";
        Persona persona = new Persona();
        persona.setEmail(email);
        
        String expResult = email;
        String result = persona.getEmail();
        assertEquals(result,expResult);
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        
        Persona persona = new Persona();
        String  nombre = "Felipe Andrade";
        persona.setNombre(nombre);        
        String result = persona.getNombre();
        assertTrue(result.equals(nombre));

    }

    /**
     * Test of getDocId method, of class Persona.
     */
    @Test
    public void testGetDocId() {
        
        Persona persona = new Persona();
        String docId = "31.929.890";
        persona.setDocId(docId);
        String result = persona.getDocId();
        assertTrue(result.equals(docId));

    }

    /**
     * Test of getFechaRegistro method, of class Persona.
     */
    @Test
    public void testGetFechaRegistro() {
        
        Persona persona = new Persona();
        String fechaRegistro = "1995-10-15";
        persona.setFechaRegistro(fechaRegistro);
        String result = persona.getFechaRegistro();
        assertTrue(result.equals(fechaRegistro));
 
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        
        Persona persona = new Persona();
        String direccion = "Cra 11 # 24-11";
        persona.setDireccion(direccion);
        String result = persona.getDireccion();
        assertTrue(result.equals(direccion));

    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        
        Persona persona = new Persona();
        String telefono = "5556789";
        persona.setTelefono(telefono);
        String result = persona.getTelefono();
        assertTrue(result.equals(telefono));
    }

    /**
     * Test of getEmail method, of class Persona.
     */
    @Test
    public void testGetEmail() {
        
        Persona persona = new Persona();
        String email = "pablitoM@uncorreo.com";
        persona.setEmail(email);
        String result = persona.getEmail();
        assertTrue(result.equals(email));
 
    }
    
}
