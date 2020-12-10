/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionVenta;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class ItemFacturaNGTest {
    
    public ItemFacturaNGTest() {
    }
    /**
     * Test of getNroItem method, of class ItemFactura.
     */
    @Test
    public void testGetNroItem() {
        
        ItemFactura instance = new ItemFactura();
        String nroItem= "2";
        instance.setNroItem(nroItem);
        String result = instance.getNroItem();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setNroItem method, of class ItemFactura.
     */
    @Test
    public void testSetNroItem() {
        
        String nroItem = "1";
        ItemFactura instance = new ItemFactura();
        instance.setNroItem(nroItem);
        String expResult = nroItem;
        String result = instance.getNroItem();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodFactura method, of class ItemFactura.
     */
    @Test
    public void testGetCodFactura() {
        ItemFactura instance = new ItemFactura();
        String codFactura= "F-001";
        instance.setCodFactura(codFactura);
        String result = instance.getCodFactura();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodFactura method, of class ItemFactura.
     */
    @Test
    public void testSetCodFactura() {
        String codFactura = "F-002";
        ItemFactura instance = new ItemFactura();
        instance.setCodFactura(codFactura);
        String expResult = codFactura;
        String result = instance.getCodFactura();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodProducto method, of class ItemFactura.
     */
    @Test
    public void testGetCodProducto() {
        ItemFactura instance = new ItemFactura();
        String codProducto= "LAT-001";
        instance.setCodProducto(codProducto);
        String result = instance.getCodProducto();
        assertTrue(result.equals(result));
    }

    /**
     * Test of setCodProducto method, of class ItemFactura.
     */
    @Test
    public void testSetCodProducto() {
        String codProducto = "USO-001";
        ItemFactura instance = new ItemFactura();
        instance.setCodProducto(codProducto);
        String expResult = codProducto;
        String result = instance.getCodProducto();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCantidad method, of class ItemFactura.
     */
    @Test
    public void testGetCantidad() {
        ItemFactura instance = new ItemFactura();
        double cantidad= 19;
        instance.setCantidad(cantidad);
        double result = instance.getCantidad();
        assertTrue(result==cantidad);
    }

    /**
     * Test of setCantidad method, of class ItemFactura.
     */
    @Test
    public void testSetCantidad() {
        double cantidad =  15;
        ItemFactura instance = new ItemFactura();
        instance.setCantidad(cantidad);
        double expResult = cantidad;
        double result = instance.getCantidad();
        assertEquals(result,expResult);
    }
    
}
