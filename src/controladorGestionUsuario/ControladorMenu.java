/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionUsuario;

import frontendGestionCliente.*;
import frontendGestionInventario.*;
import frontendGestionReporte.*;
import frontendGestionVenta.*;
import frontendMensEmerg.*;
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
    
        VentanaInicio ventanaMenu= new VentanaInicio(usuario);
        ventanaMenu.setVisible(true);
    }
    public void irVistaUsuario(Usuario usuario)
    {
        VentanaVerUsuario vVUser = new   VentanaVerUsuario(usuario);
        vVUser.setVisible(true);
    }
    
    public void irEdicionUsuario(Usuario usuario)
    {
        VentanaEdicionUsuario vEUser = new   VentanaEdicionUsuario(usuario);
        vEUser.setVisible(true); 
    }
    
    public void irRegistroUsuario(Usuario usuario)
    {
        VentanaRegistroUsuario vRUser = new   VentanaRegistroUsuario(usuario);
        vRUser.setVisible(true);//mostrar ventana usuarios
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
        VentanaPrincipalInventario vInventario= new VentanaPrincipalInventario(usuario);
        vInventario.setVisible(true);
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
    
    private Usuario usuario;
    
}
