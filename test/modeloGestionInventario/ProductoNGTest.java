/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionInventario;

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
public class ProductoNGTest {
    
    public ProductoNGTest() {
    }

    /**
     * Test of setCodigo method, of class Producto.
     */
    @Test
    public void testSetCodigo() {

        String codigo = "LAT-001";
        Producto instance = new Producto();
        instance.setCodigo(codigo);
        String expResult = codigo;
        String result = instance.getCodigo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setDescripcion method, of class Producto.
     */
    @Test
    public void testSetDescripcion() {
        String descripcion= "¡Empaque dañado!";
        Producto instance = new Producto();
        instance.setDescripcion(descripcion);
        String expResult = descripcion;
        String result = instance.getDescripcion();
        assertEquals(result,expResult);
    }

    /**
     * Test of setProveedor method, of class Producto.
     */
    @Test
    public void testSetProveedor() {
        String proveedor= "Postobon";
        Producto instance = new Producto();
        instance.setProveedor(proveedor);
        String expResult = proveedor;
        String result = instance.getProveedor();
        assertEquals(result,expResult);
    }

    /**
     * Test of setTipo method, of class Producto.
     */
    @Test
    public void testSetTipo() {
        String tipo= "Enlatado";
        Producto instance = new Producto();
        instance.setTipo(tipo);
        String expResult = tipo;
        String result = instance.getTipo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setPrecioCompra method, of class Producto.
     */
    @Test
    public void testSetPrecioCompra() {
        String precioC= "82000";
        Producto instance = new Producto();
        instance.setPrecioCompra(precioC);
        String expResult = precioC;
        String result = instance.getPrecioCompra();
        assertEquals(result,expResult);
    }

    /**
     * Test of setPrecioVenta method, of class Producto.
     */
    @Test
    public void testSetPrecioVenta() {
        String precioV= "5000";
        Producto instance = new Producto();
        instance.setPrecioVenta(precioV);
        String expResult = precioV;
        String result = instance.getPrecioVenta();
        assertEquals(result,expResult);
    }

    /**
     * Test of setFechaV method, of class Producto.
     */
    @Test
    public void testSetFechaV() {
        String fecha= "2020-03-10";
        Producto instance = new Producto();
        instance.setFechaV(fecha);
        String expResult = fecha;
        String result = instance.getFechaV();
        assertEquals(result,expResult);
    }

    /**
     * Test of setCantidad method, of class Producto.
     */
    @Test
    public void testSetCantidad() {
        String cantidad= "25";
        Producto instance = new Producto();
        instance.setCantidad(cantidad);
        String expResult = cantidad;
        String result = instance.getCantidad();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodigo method, of class Producto.
     */
    @Test
    public void testGetCodigo() {
        Producto instance = new Producto();
        String codigo= "DSC-001";
        instance.setCodigo(codigo);
        String result = instance.getCodigo();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getDescripcion method, of class Producto.
     */
    @Test
    public void testGetDescripcion() {
        Producto instance = new Producto();
        String descripcion= "Atún en Lomitos";
        instance.setDescripcion(descripcion);
        String result = instance.getDescripcion();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getProveedor method, of class Producto.
     */
    @Test
    public void testGetProveedor() {
        Producto instance = new Producto();
        String proveedor= "Bebida";
        instance.setProveedor(proveedor);
        String result = instance.getProveedor();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getTipo method, of class Producto.
     */
    @Test
    public void testGetTipo() {
        Producto instance = new Producto();
        String tipo= "Desechable";
        instance.setTipo(tipo);
        String result = instance.getTipo();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getPrecioCompra method, of class Producto.
     */
    @Test
    public void testGetPrecioCompra() {
        Producto instance = new Producto();
        String precioC= "23479";
        instance.setPrecioCompra(precioC);
        String result = instance.getPrecioCompra();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getPrecioVenta method, of class Producto.
     */
    @Test
    public void testGetPrecioVenta() {
                
        Producto instance = new Producto();
        String precioV= "98754";
        instance.setPrecioVenta(precioV);
        String result = instance.getPrecioVenta();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getFechaV method, of class Producto.
     */
    @Test
    public void testGetFechaV() {
        Producto instance = new Producto();
        String fechaV= "1998-06-08";
        instance.setFechaV(fechaV);
        String result = instance.getFechaV();
        assertTrue(result.equals(result));
    }

    /**
     * Test of getCantidad method, of class Producto.
     */
    @Test
    public void testGetCantidad() {
        Producto instance = new Producto();
        String cantidad= "65300";
        instance.setCantidad(cantidad);
        String result = instance.getCantidad();
        assertTrue(result.equals(result));
    }
    
}
