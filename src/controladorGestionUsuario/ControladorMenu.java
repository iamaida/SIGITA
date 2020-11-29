/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionUsuario;

import vistaGestionInventario.VentanaPrincipalInventario;
import vistaGestionReporte.VentanaPrincipalReporte;
import vistaGestionVenta.VentanaPrincipalVenta;
import vistaMensEmerg.VentanaMRegistroExit;
import vistaMensEmerg.VentanaMensajeError;
import vistaMensEmerg.VentanaMActualizacionNExit;
import vistaMensEmerg.VentanaMActualizacionExit;
import vistaMensEmerg.VentanaMRegistroNExit;
import vistaGestionCliente.VentanaPrincipalCliente;
import modeloGestionUsuario.Usuario;
import vistaGestionUsuario.*;


/**
 *
 * @author Aidis
 */
public class ControladorMenu {
    
    public ControladorMenu()
    {
        usuario = new Usuario();
        
    }
    
    public void desplegarMRegistroExitoso()
    {
        VentanaMRegistroExit  vMRE= new VentanaMRegistroExit();
        vMRE.setVisible(true);
    }
    
    public void desplegarMRegistroNoExitoso()
    {
        VentanaMRegistroNExit  vMRNE= new VentanaMRegistroNExit();
        vMRNE.setVisible(true);
    }
    
    
    public void desplegarMActualizacionNoExitosa()
    {
        VentanaMActualizacionNExit  vMANE= new VentanaMActualizacionNExit();
        vMANE.setVisible(true);
        
    }
    
    public void desplegarMActualizacionExitosa()
    {
        VentanaMActualizacionExit  vMAE= new VentanaMActualizacionExit();
        vMAE.setVisible(true);
        
    }
    
    public void desplegarMDatoNoEncontrado()
    {
         VentanaMensajeError mensajeError = new VentanaMensajeError();
         mensajeError.setVisible(true);
        
    }
    
    public void irVentanaInicio(Usuario usuario)
    {
    
        VentanaInicio vInicio= new VentanaInicio(usuario);
        vInicio.setVisible(true);
    }
    
    public void irVentanaLogin()
    {
        VentanaLogin vLogin= new VentanaLogin();
        vLogin.setVisible(true);
        
    }
    
    public void irModuloGCliente(Usuario usuario)
    {
        VentanaPrincipalCliente vCliente= new VentanaPrincipalCliente(usuario);
        vCliente.setVisible(true);
    }
    
    public void irModuloGInventario(Usuario usuario)
    {
        VentanaPrincipalInventario vInvent= new VentanaPrincipalInventario(usuario);
        vInvent.setVisible(true);
    }
    
    public void irVentanaSoporte(Usuario usuario)
    {
        VentanaPrincipalSoporte vSoporte= new VentanaPrincipalSoporte(usuario);
        vSoporte.setVisible(true);
    }
    
    public void irModuloGUsuario(Usuario usuario)
    {

       VentanaPrincipalUsuario vUsuario = new VentanaPrincipalUsuario(usuario);
       vUsuario.setVisible(true);

    }
    
    public void irModuloGVenta(Usuario usuario)
    {
        VentanaPrincipalVenta vVenta= new VentanaPrincipalVenta(usuario);
        vVenta.setVisible(true);
    }
    
    public void irModuloGReporte(Usuario usuario)
    {

        VentanaPrincipalReporte vReporte= new VentanaPrincipalReporte(usuario);
        vReporte.setVisible(true);//mostrar ventana usuarios
    }
    
    private final Usuario usuario;
    
}
