/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionReporte;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Aidis
 */
public class ReporteNGTest {
    
    public ReporteNGTest() {
    }

    /**
     * Test of setCodigo method, of class Reporte.
     */
    @Test
    public void testSetCodigo() {
        
        String codigo = "R-001";
        Reporte reporte = new Reporte();
        reporte.setCodigo(codigo);
        String expResult = codigo;
        String result = reporte.getCodigo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setFecha method, of class Reporte.
     */
    @Test
    public void testSetFecha() {
        
        String fecha = "2020-01-01";
        Reporte reporte = new Reporte();
        reporte.setFecha(fecha);
        String expResult = fecha;
        String result = reporte.getFecha();
        assertEquals(result,expResult);
    }

    /**
     * Test of setTipo method, of class Reporte.
     */
    @Test
    public void testSetTipo() {
        
        String tipo = "Averia";
        Reporte reporte = new Reporte();
        reporte.setTipo(tipo);
        String expResult = tipo;
        String result = reporte.getTipo();
        assertEquals(result,expResult);
    }

    /**
     * Test of setEstado method, of class Reporte.
     */
    @Test
    public void testSetEstado() {
        
        String estado = "NoRevisado";
        Reporte reporte = new Reporte();
        reporte.setEstado(estado);
        String expResult = estado;
        String result = reporte.getEstado();
        assertEquals(result,expResult);
    }

    /**
     * Test of setCodUsuario method, of class Reporte.
     */
    @Test
    public void testSetCodUsuario() {
        
        String codUsuario = "A-002";
        Reporte instance = new Reporte();
        instance.setCodUsuario(codUsuario);
        String expResult = codUsuario;
        String result = instance.getCodUsuario();
        assertEquals(result,expResult);
    }

    /**
     * Test of setCodProducto method, of class Reporte.
     */
    @Test
    public void testSetCodProducto() {
        
        String codProducto = "LAT-001";
        Reporte instance = new Reporte();
        instance.setCodProducto(codProducto);
        String expResult = codProducto;
        String result = instance.getCodProducto();
        assertEquals(result,expResult);
    }

    /**
     * Test of setNomInteresado method, of class Reporte.
     */
    @Test
    public void testSetNomInteresado() {
        
        String nomInteresado = "Alejandro Paz";
        Reporte instance = new Reporte();
        instance.setNomInteresado(nomInteresado);
        String expResult = nomInteresado;
        String result = instance.getNomInteresado();
        assertEquals(result,expResult);
    }

    /**
     * Test of setComentario method, of class Reporte.
     */
    @Test
    public void testSetComentario() {
        
        String comentario = "El empaque esta muy deteriorado";
        Reporte instance = new Reporte();
        instance.setComentario(comentario);
        String expResult = comentario;
        String result = instance.getComentario();
        assertEquals(result,expResult);
    }

    /**
     * Test of getCodigo method, of class Reporte.
     */
    @Test
    public void testGetCodigo() {
        
        Reporte instance = new Reporte();
        String codigo = "R-002";
        instance.setCodigo(codigo);
        String result = instance.getCodigo();
        assertTrue(result.equals(codigo));
    }

    /**
     * Test of getFecha method, of class Reporte.
     */
    @Test
    public void testGetFecha() {
        
        Reporte instance = new Reporte();
        String fecha = "1995-06-10";
        instance.setFecha(fecha);
        String result = instance.getFecha();
        assertTrue(result.equals(fecha));
    }

    /**
     * Test of getTipo method, of class Reporte.
     */
    @Test
    public void testGetTipo() {
        
        Reporte instance = new Reporte();
        String tipo = "Cambio";
        instance.setTipo(tipo);
        String result = instance.getTipo();
        assertTrue(result.equals(tipo));
    }

    /**
     * Test of getEstado method, of class Reporte.
     */
    @Test
    public void testGetEstado() {
        
        Reporte instance = new Reporte();
        String estado = "Denegado";
        instance.setEstado(estado);
        String result = instance.getEstado();
        assertTrue(result.equals(estado));
    }

    /**
     * Test of getCodUsuario method, of class Reporte.
     */
    @Test
    public void testGetCodUsuario() {
        
        Reporte instance = new Reporte();
        String codUsuario = "C-001";
        instance.setCodUsuario(codUsuario);
        String result = instance.getCodUsuario();
        assertTrue(result.equals(codUsuario));
    }

    /**
     * Test of getCodProducto method, of class Reporte.
     */
    @Test
    public void testGetCodProducto() {
        
        Reporte instance = new Reporte();
        String codProducto = "LAT-001";
        instance.setCodProducto(codProducto);
        String result = instance.getCodProducto();
        assertTrue(result.equals(codProducto));
    }

    /**
     * Test of getNomInteresado method, of class Reporte.
     */
    @Test
    public void testGetNomInteresado() {
        
        Reporte instance = new Reporte();
        String nomInteresado = "Fernando Torres";
        instance.setNomInteresado(nomInteresado);
        String result = instance.getNomInteresado();
        assertTrue(result.equals(nomInteresado));
    }

    /**
     * Test of getComentario method, of class Reporte.
     */
    @Test
    public void testGetComentario() {
        
        Reporte instance = new Reporte();
        String comentario = "El producto esta vencido";
        instance.setComentario(comentario);
        String result = instance.getComentario();
        assertTrue(result.equals(comentario));
    }
    
}
