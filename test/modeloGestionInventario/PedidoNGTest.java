/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionInventario;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class PedidoNGTest {
    
    public PedidoNGTest() {
    }

    /**
     * Test of agregarProducto method, of class Pedido.
     */
    @Test
    public void testAgregarProducto() {
        
        Producto producto = null;
        Pedido instance = new Pedido();
        instance.agregarProducto(producto);
        Producto result = producto;
        Producto expResult = null;
        assertEquals(result, expResult);
    }

    /**
     * Test of getProductos method, of class Pedido.
     */
    @Test
    public void testGetProductos() {
        
        Pedido instance = new Pedido();
        instance.agregarProducto(null);
        ArrayList result = instance.getProductos(); 
        ArrayList expResult = new ArrayList<Producto>();
        expResult.add(null);
        assertEquals(result, expResult);
 
    }

    /**
     * Test of getCodigo method, of class Pedido.
     */
    @Test
    public void testGetCodigo() {
        Pedido instance = new Pedido();
        String codigo= "P-002";
        instance.setCodigo(codigo);
        String result = instance.getCodigo();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodigo method, of class Pedido.
     */
    @Test
    public void testSetCodigo() {
        String codigo= "P-003";
        Pedido instance = new Pedido();
        instance.setCodigo(codigo);
        String expResult = codigo;
        String result = instance.getCodigo();
        assertEquals(result,expResult);
    }

    /**
     * Test of getFecha method, of class Pedido.
     */
    @Test
    public void testGetFecha() {
        Pedido instance = new Pedido();
        String fecha= "2019-03-08";
        instance.setFecha(fecha);
        String result = instance.getFecha();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setFecha method, of class Pedido.
     */
    @Test
    public void testSetFecha() {
        String fecha= "2020-12-05";
        Pedido instance = new Pedido();
        instance.setFecha(fecha);
        String expResult = fecha;
        String result = instance.getFecha();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodAlmacenista method, of class Pedido.
     */
    @Test
    public void testGetCodAlmacenista() {
        Pedido instance = new Pedido();
        String codAlmacenista= "A-002";
        instance.setCodAlmacenista(codAlmacenista);
        String result = instance.getCodAlmacenista();
        assertTrue(result.equals(codAlmacenista));
    }

    /**
     * Test of setCodAlmacenista method, of class Pedido.
     */
    @Test
    public void testSetCodAlmacenista() {
        String codAlmacenista= "A-001";
        Pedido instance = new Pedido();
        instance.setCodAlmacenista(codAlmacenista);
        String expResult = codAlmacenista;
        String result = instance.getCodAlmacenista();
        assertEquals(result,expResult);
    }

    /**
     * Test of getEstado method, of class Pedido.
     */
    @Test
    public void testGetEstado() {
        Pedido instance = new Pedido();
        String estado= "Enviado";
        instance.setEstado(estado);
        String result = instance.getEstado();
        assertTrue(result.equals(estado));
    }

    /**
     * Test of setEstado method, of class Pedido.
     */
    @Test
    public void testSetEstado() {
        String estado= "Enviado";
        Pedido instance = new Pedido();
        instance.setEstado(estado);
        String expResult = estado;
        String result = instance.getEstado();
        assertEquals(result,expResult);
    }

    /**
     * Test of getTotal method, of class Pedido.
     */
    @Test
    public void testGetTotal() {
        Pedido instance = new Pedido();
        double cant = 10;
        double precio = 24000;
        instance.sumarATotal(cant, precio);
        double result = instance.getTotal();
        double expResult = 240000;
        assertEquals(result, expResult);
    }

    /**
     * Test of sumarATotal method, of class Pedido.
     */
    @Test
    public void testSumarATotal() {
        
        double cant = 3.0;
        double precio = 25300;
        Pedido instance = new Pedido();
        instance.sumarATotal(cant, precio);
        double result = instance.getTotal();
        double expResult = 75900;
        assertEquals(result, expResult);
    }
    
}
