/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionVenta;

import conexionBDGestionVenta.ConexionBDVenta;
import controladorGestionUsuario.ControladorMenu;
import modeloGestionUsuario.Usuario;
import modeloGestionVenta.Factura;
import modeloGestionVenta.ItemFactura;
import vistaGestionDomicilio.VentanaPrincipalDomicilio;
import vistaGestionReporte.VentanaReporteCambioProducto;
import vistaGestionVenta.VentanaGenerarFactura;

/**
 *
 * @author Aidis
 */
public class ControladorVenta {
    
    public ControladorVenta()
    {
        encontrado = false;
        controlMenu = new ControladorMenu();
    
    }
    
    public void procesarRegistroItemFactura(ItemFactura item)
    {
       conexionVenta = new ConexionBDVenta();
       conexionVenta.insertarItemFactura (item);
       
       if(conexionVenta.getDatoEncontrado())
       { 
            System.out.println("Registro Exitoso");
            encontrado= true;
          
       }else
       {
            System.out.println("Registro No Exitoso");
            encontrado = false;
           
       }
    } 
    
    public void procesarRegistroFactura(Factura factura)
    {
       conexionVenta = new ConexionBDVenta();
       conexionVenta.insertarFactura (factura);
       
       if(conexionVenta.getDatoEncontrado())
       { 
          
            controlMenu.desplegarMRegistroExitoso();
            encontrado= true;
          
       }else
       {
            controlMenu.desplegarMRegistroNoExitoso();
            encontrado = false;
           
       }
    } 
    
    public boolean getDatoEncontrado()
    {
        return encontrado;
    }
    
    public void irRegistroFactura(Usuario usuario)
    {
        VentanaGenerarFactura ventanaGF= new VentanaGenerarFactura(usuario);
        ventanaGF.setVisible(true);//mostrar ventana usuarios

    }
    
    public void irEnvioDomicilio(Usuario usuario)
    {
        VentanaPrincipalDomicilio ventanaD= new VentanaPrincipalDomicilio(usuario);
        ventanaD.setVisible(true);//mostrar ventana usuarios
    }
    
    public void irCambioProducto(Usuario usuario)
    {
        VentanaReporteCambioProducto ventSCP= new VentanaReporteCambioProducto(usuario);
        ventSCP.setVisible(true);
    }
    
    private boolean encontrado;
    private ConexionBDVenta conexionVenta;
    private final  ControladorMenu controlMenu;
    
}
