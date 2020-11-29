/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionInventario;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class ItemPedidoNGTest {
 
    
    /**
     * Test of getNroItem method, of class ItemPedido.
     */
    @Test
    public void testGetNroItem() {
        
        ItemPedido instance = new ItemPedido();
        String nroItem= "2";
        instance.setNroItem(nroItem);
        String result = instance.getNroItem();
        assertTrue(result.equals(result));
    }

    
    /**
     * Test of setNroItem method, of class ItemPedido.
     */
    @Test
    public void testSetNroItem() {
        
        String nroItem = "1";
        ItemPedido instance = new ItemPedido();
        instance.setNroItem(nroItem);
        String expResult = nroItem;
        String result = instance.getNroItem();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodPedido method, of class ItemPedido.
     */
    @Test
    public void testGetCodPedido() {
                
        ItemPedido instance = new ItemPedido();
        String codPedido= "P-002";
        instance.setCodPedido(codPedido);
        String result = instance.getCodPedido();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodPedido method, of class ItemPedido.
     */
    @Test
    public void testSetCodPedido() {
        
        String codPedido = "P-001";
        ItemPedido instance = new ItemPedido();
        instance.setCodPedido(codPedido);
        String expResult = codPedido;
        String result = instance.getCodPedido();
        assertEquals(result,expResult);
        
    }

    /**
     * Test of getCodProducto method, of class ItemPedido.
     */
    @Test
    public void testGetCodProducto() {
        ItemPedido instance = new ItemPedido();
        String codProducto= "LAT-001";
        instance.setCodProducto(codProducto);
        String result = instance.getCodProducto();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodProducto method, of class ItemPedido.
     */
    @Test
    public void testSetCodProducto() {
        String codProducto = "USO-001";
        ItemPedido instance = new ItemPedido();
        instance.setCodProducto(codProducto);
        String expResult = codProducto;
        String result = instance.getCodProducto();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCantidad method, of class ItemPedido.
     */
    @Test
    public void testGetCantidad() {

        ItemPedido instance = new ItemPedido();
        double cantidad= 19;
        instance.setCantidad(cantidad);
        double result = instance.getCantidad();
        assertTrue(result==cantidad);

    }

    /**
     * Test of setCantidad method, of class ItemPedido.
     */
    @Test
    public void testSetCantidad() {
        double cantidad =  15;
        ItemPedido instance = new ItemPedido();
        instance.setCantidad(cantidad);
        double expResult = cantidad;
        double result = instance.getCantidad();
        assertEquals(result,expResult);
    }
    
}
