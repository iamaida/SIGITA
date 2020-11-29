/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionCliente;

import conexionBDGestionCliente.ConexionBDCliente;
import controladorGestionUsuario.ControladorMenu;
import modeloGestionCliente.Cliente;
import modeloGestionUsuario.Usuario;
import vistaGestionCliente.*;

/**
 *
 * @author Aidis
 */
public class ControladorCliente {
    
    public ControladorCliente()
    {
        encontrado = false;
        controlMenu = new ControladorMenu();
    
    }
    
    
    public void procesarEdicionCliente(String cCambio, String vCambio, 
                                       String codigo, int cont)
    {
        
       conexionClient = new ConexionBDCliente();
       conexionClient.actualizarCliente(cCambio, vCambio,codigo);
       
       if(conexionClient.getDatoEncontrado())
       { 
           if(cont == 5)
           {
               controlMenu.desplegarMActualizacionExitosa();
           }
           
           encontrado= true;
          
       }else
       {
           if(cont == 5)
           {
                controlMenu.desplegarMActualizacionNoExitosa();
           }
           encontrado = false;
           
       }
       
    }
    
    public void procesarRegistroCliente(Cliente cliente)
    {
       conexionClient = new ConexionBDCliente();
       conexionClient.insertarCliente(cliente);
       
       if(conexionClient.getDatoEncontrado())
       { 
            controlMenu.desplegarMRegistroExitoso();
            encontrado= true;
          
       }else
       {
            controlMenu.desplegarMRegistroNoExitoso();
            encontrado = false;
           
       }
    }
    
    public Cliente procesarVistaCliente(String docId)
    {
       Cliente clientBuscado = new Cliente(); 
       conexionClient = new ConexionBDCliente();
       clientBuscado = conexionClient.consultarCliente(docId);
       
       if(conexionClient.getDatoEncontrado())
       { 
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMDatoNoEncontrado();
           encontrado = false;
           
       }
       
       return clientBuscado;
    }
    
    public boolean getEncontrado()
    {
        return encontrado;
    }
    
    public void irVistaCliente(Usuario usuario)
    {
        VentanaVerCliente vVClient = new   VentanaVerCliente (usuario);
        vVClient.setVisible(true);
    }
    
    public void irEdicionCliente(Usuario usuario)
    {
        VentanaEdicionCliente vEClient = new   VentanaEdicionCliente (usuario);
        vEClient.setVisible(true); 
    }
    
    public void irRegistroCliente(Usuario usuario)
    {
        VentanaRegistroCliente vRClient = new   VentanaRegistroCliente(usuario);
        vRClient.setVisible(true);//mostrar ventana usuarios
    }
    
    private boolean encontrado;
    private ConexionBDCliente conexionClient;
    private final ControladorMenu controlMenu;
}

