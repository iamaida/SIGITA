/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionVenta;

import java.util.ArrayList;
import modeloGestionInventario.Producto;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class FacturaNGTest {
    
    public FacturaNGTest() {
    }

    /**
     * Test of agregarProducto method, of class Factura.
     */
    @Test
    public void testAgregarProducto() {
        Producto producto = null;
        Factura instance = new Factura();
        instance.agregarProducto(producto);
        Producto result = producto;
        Producto expResult = null;
        assertEquals(result, expResult);
    }

    /**
     * Test of getProductos method, of class Factura.
     */
    @Test
    public void testGetProductos() {
        
        Factura instance = new Factura();
        instance.agregarProducto(null);
        ArrayList result = instance.getProductos(); 
        ArrayList expResult = new ArrayList<Producto>();
        expResult.add(null);
        assertEquals(result, expResult);
    }

    /**
     * Test of getCodigo method, of class Factura.
     */
    @Test
    public void testGetCodigo() {
        Factura instance = new Factura();
        String codigo= "F-001";
        instance.setCodigo(codigo);
        String result = instance.getCodigo();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodigo method, of class Factura.
     */
    @Test
    public void testSetCodigo() {
        String codigo= "F-003";
        Factura instance = new Factura();
        instance.setCodigo(codigo);
        String expResult = codigo;
        String result = instance.getCodigo();
        assertEquals(result,expResult);
    }

    /**
     * Test of getFecha method, of class Factura.
     */
    @Test
    public void testGetFecha() {
        
        Factura instance = new Factura();
        String fecha= "2019-03-08";
        instance.setFecha(fecha);
        String result = instance.getFecha();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setFecha method, of class Factura.
     */
    @Test
    public void testSetFecha() {
        String fecha= "2020-12-05";
        Factura instance = new Factura();
        instance.setFecha(fecha);
        String expResult = fecha;
        String result = instance.getFecha();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodCajero method, of class Factura.
     */
    @Test
    public void testGetCodCajero() {
        Factura instance = new Factura();
        String codCajero= "C-002";
        instance.setCodCajero(codCajero);
        String result = instance.getCodCajero();
        assertTrue(result.equals(codCajero));
    }

    /**
     * Test of setCodCajero method, of class Factura.
     */
    @Test
    public void testSetCodCajero() {
        String codCajero= "C-001";
        Factura instance = new Factura();
        instance.setCodCajero(codCajero);
        String expResult = codCajero;
        String result = instance.getCodCajero();
        assertEquals(result,expResult);
    }

    /**
     * Test of getIdCliente method, of class Factura.
     */
    @Test
    public void testGetIdCliente() {
        Factura instance = new Factura();
        String idCliente = "95.034.234";
        instance.setIdCliente(idCliente);
        String result = instance.getIdCliente();
        assertTrue(result.equals(idCliente));
    }

    /**
     * Test of setIdCliente method, of class Factura.
     */
    @Test
    public void testSetIdCliente() {
        String idCliente= "1.135.637.780";
        Factura instance = new Factura();
        instance.setIdCliente(idCliente);
        String expResult = idCliente;
        String result = instance.getIdCliente();
        assertEquals(result,expResult);
    }

    
}
