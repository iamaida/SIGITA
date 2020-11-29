/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionCliente;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class ClienteNGTest {
    
    public ClienteNGTest() {
    }

/**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        
        String nombre = "Paco Delgado";
        Cliente client = new Cliente();
        client.setNombre(nombre);
        String expResult = nombre;
        String result = client.getNombre();
        assertEquals(result,expResult);
    }

    /**
     * Test of setDocId method, of class Persona.
     */
    @Test
    public void testSetDocId() {
        
        String docId = "1.143.860.120";
        Cliente cliente = new Cliente();
        cliente.setDocId(docId);
        String expResult = docId;
        String result = cliente.getDocId();
        assertEquals(result,expResult);
    }

    /**
     * Test of setFechaRegistro method, of class Persona.
     */
    @Test
    public void testSetFechaRegistro() {
        
        String fechaRegistro = "2020-11-10";
        Cliente client = new Cliente();
        client.setFechaRegistro(fechaRegistro);
        
        String expResult = fechaRegistro;
        String result = client.getFechaRegistro();
        assertEquals(result,expResult);
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        
        String direccion = "Av. 65 # 34-10";
        Cliente persona = new Cliente();
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
        Cliente client = new Cliente();
        client.setTelefono(telefono);
        
        String expResult = telefono;
        String result = client.getTelefono();
        assertEquals(result,expResult);
    }

    /**
     * Test of setEmail method, of class Persona.
     */
    @Test
    public void testSetEmail() {
        
        String email = "camiloA@uncorreo.com";
        Cliente client = new Cliente();
        client.setEmail(email);
        
        String expResult = email;
        String result = client.getEmail();
        assertEquals(result,expResult);
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        
        Cliente client = new Cliente();
        String  nombre = "Felipe Andrade";
        client.setNombre(nombre);        
        String result = client.getNombre();
        assertTrue(result.equals(nombre));

    }

    /**
     * Test of getDocId method, of class Persona.
     */
    @Test
    public void testGetDocId() {
        
        Cliente client = new Cliente();
        String docId = "31.929.890";
        client.setDocId(docId);
        String result = client.getDocId();
        assertTrue(result.equals(docId));

    }

    /**
     * Test of getFechaRegistro method, of class Persona.
     */
    @Test
    public void testGetFechaRegistro() {
        
        Cliente cliente = new Cliente();
        String fechaRegistro = "1995-10-15";
        cliente.setFechaRegistro(fechaRegistro);
        String result = cliente.getFechaRegistro();
        assertTrue(result.equals(fechaRegistro));
 
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        
        Cliente client = new Cliente();
        String direccion = "Cra 11 # 24-11";
        client.setDireccion(direccion);
        String result = client.getDireccion();
        assertTrue(result.equals(direccion));

    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        
        Cliente client = new Cliente();
        String telefono = "5556789";
        client.setTelefono(telefono);
        String result = client.getTelefono();
        assertTrue(result.equals(telefono));
    }

    /**
     * Test of getEmail method, of class Persona.
     */
    @Test
    public void testGetEmail() {
        
        Cliente client = new Cliente();
        String email = "pablitoM@uncorreo.com";
        client.setEmail(email);
        String result = client.getEmail();
        assertTrue(result.equals(email));
 
    }
    
}
