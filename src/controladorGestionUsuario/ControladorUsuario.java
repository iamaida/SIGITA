/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionUsuario;

import vistaGestionUsuario.*;
import frontendGestionCliente.*;
import frontendGestionInventario.*;
import frontendGestionReporte.*;
import frontendGestionVenta.*;
import frontendMensEmerg.*;
import modeloGestionUsuario.*;



/**
 *
 * @author Aidis
 */
public class ControladorUsuario {
    
    public ControladorUsuario()
    {
        usuarioP= new Usuario();
        encontrado = false;
        controlMenu = new ControladorMenu();
    
    }
    
    public void procesarLogin(String password, String nUser)
    {
       conexionUs = new ConexionBDUsuario();
       usuarioP = conexionUs.consultarUsuarioLogin(password,nUser);
       
       if(conexionUs.getDatoEncontrado())
       { 
           encontrado = true;
           controlMenu.irVentanaInicio(usuarioP);
           
       }else
       {
           encontrado = false;
           controlMenu.desplegarMDatoNoEncontrado();

       }
        
    }
    
    public Usuario procesarVistaUsuario(String codigo)
    {
       Usuario userBuscado = new Usuario(); 
       conexionUs = new ConexionBDUsuario();
       userBuscado = conexionUs.consultarUsuario(codigo);
       
       if(conexionUs.getDatoEncontrado())
       { 
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMDatoNoEncontrado();
           encontrado = false;
           
       }
       
       return userBuscado;
    }
    
    
    public void procesarEdicionEstadoUsuario(String campoCambio, String valorCambio, String codigo)
    {
        
       conexionUs = new ConexionBDUsuario();
       conexionUs.actualizarUsuario(campoCambio, valorCambio,codigo);
       
       if(conexionUs.getDatoEncontrado())
       { 
           controlMenu.desplegarMActualizacionExitosa();
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMActualizacionNoExitosa();
           encontrado = false;
           
       }
       
    }
    
    public void procesarEdicionUsuario(String campoCambio, String valorCambio, String codigo, int cont)
    {
        
       conexionUs = new ConexionBDUsuario();
       conexionUs.actualizarUsuario(campoCambio, valorCambio,codigo);
       
       if(conexionUs.getDatoEncontrado())
       { 
           if(cont == 8)
           {
               controlMenu.desplegarMActualizacionExitosa();
           }
           
           encontrado= true;
          
       }else
       {
           if(cont == 8)
           {
                controlMenu.desplegarMActualizacionNoExitosa();
           }
           encontrado = false;
           
       }
       
    }
    
    public void procesarRegistroUsuario(Usuario usuario)
    {
       conexionUs = new ConexionBDUsuario();
       conexionUs.insertarUsuario(usuario);
       
       if(conexionUs.getDatoEncontrado())
       { 
            controlMenu.desplegarMRegistroExitoso();
            encontrado= true;
          
       }else
       {
            controlMenu.desplegarMRegistroNoExitoso();
            encontrado = false;
           
       }
    }
    public boolean getEncontrado()
    {
        return encontrado;
    }
    

    private Usuario usuarioP;
    private boolean encontrado;
    private ConexionBDUsuario conexionUs;
    private ControladorMenu controlMenu;
    
}
