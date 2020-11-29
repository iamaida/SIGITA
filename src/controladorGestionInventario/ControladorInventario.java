/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionInventario;

import conexionBDInventario.ConexionBDInventario;
import controladorGestionUsuario.ControladorMenu;
import modeloGestionInventario.ItemPedido;
import modeloGestionInventario.Pedido;
import modeloGestionInventario.Producto;
import modeloGestionUsuario.Usuario;
import vistaGestionInventario.VentanaRegistroPedido;
import vistaGestionInventario.VentanaVerProducto;
import vistaGestionReporte.VentanaReporteAveriaProducto;

/**
 *
 * @author Aidis
 */
public class ControladorInventario {
    
    public ControladorInventario()
    {
        encontrado = false;
        controlMenu = new ControladorMenu();
    
    }
    
    
    public void procesarRegistroItemPedido(ItemPedido item)
    {
       conexionInv = new ConexionBDInventario();
       conexionInv.insertarItemPedido (item);
       
       if(conexionInv.getDatoEncontrado())
       { 
            controlMenu.desplegarMRegistroExitoso();
            encontrado= true;
          
       }else
       {
            controlMenu.desplegarMRegistroNoExitoso();
            encontrado = false;
           
       }
    } 
    
    public void procesarRegistroPedido(Pedido order)
    {
       conexionInv = new ConexionBDInventario();
       conexionInv.insertarPedido (order);
       
       if(conexionInv.getDatoEncontrado())
       { 
            controlMenu.desplegarMRegistroExitoso();
            encontrado= true;
          
       }else
       {
            controlMenu.desplegarMRegistroNoExitoso();
            encontrado = false;
           
       }
    } 
    
    public Producto procesarVistaProducto(String codigo)
    {
       Producto product = new Producto(); 
       conexionInv = new ConexionBDInventario();
       product = conexionInv.consultarProducto(codigo);
       
       if(conexionInv.getDatoEncontrado())
       { 
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMDatoNoEncontrado();
           encontrado = false;
           
       }
       
       return product;
    }
    
    public boolean getDatoEncontrado()
    {
        return encontrado;
    }
    
    public void irVistaProducto(Usuario usuario)
    {
        VentanaVerProducto ventanaVP= new VentanaVerProducto(usuario);
        ventanaVP.setVisible(true);
    }
    
    public void irReporteAveria(Usuario usuario)
    {
 
        VentanaReporteAveriaProducto ventanaAP= new VentanaReporteAveriaProducto(usuario);
        ventanaAP.setVisible(true);
    }
    
    public void irSolicitudPedido(Usuario usuario)
    {
        VentanaRegistroPedido ventanaP= new VentanaRegistroPedido(usuario);
        ventanaP.setVisible(true);
    }
    
    private boolean encontrado;
    private ConexionBDInventario conexionInv;
    private final ControladorMenu controlMenu;
    
}
