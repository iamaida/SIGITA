/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGestionReporte;

import conexionBDGestionReporte.ConexionBDReporte;
import controladorGestionUsuario.ControladorMenu;
import java.util.ArrayList;
import modeloGestionReporte.Reporte;
import modeloGestionUsuario.Usuario;
import vistaGestionReporte.VentanaVerReporte;

/**
 *
 * @author Aidis
 */
public class ControladorReporte {
    
    public ControladorReporte()
    {
       encontrado = false;
       controlMenu = new ControladorMenu();
       reportes = new ArrayList<>();
    
    }
    
    public ArrayList<Reporte> procesarConsultaReportes()
    {
       
       conexionReport = new ConexionBDReporte();
       reportes = conexionReport.consultarReportes();
       
       if(conexionReport.getDatoEncontrado())
       { 
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMDatoNoEncontrado();
           encontrado = false;
           
       }
       
       return reportes;
    }
    
    public void procesarEdicionEstadoReporte(String cCambio, String vCambio, 
                                             String codigo)
    {
        
       conexionReport = new ConexionBDReporte();
       conexionReport.cambiarEstadoReporte(cCambio, vCambio,codigo);
       
       if(conexionReport.getDatoEncontrado())
       { 
           controlMenu.desplegarMActualizacionExitosa();
           encontrado= true;
          
       }else
       {
           controlMenu.desplegarMActualizacionNoExitosa();
           encontrado = false;
           
       }
       
    }
    
    public void procesarRegistroReporte(Reporte reporte)
    {
       conexionReport = new ConexionBDReporte();
       conexionReport.insertarReporte(reporte);
       
       if(conexionReport.getDatoEncontrado())
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
    
    public void irVistaCliente(Usuario usuario, Reporte reporte)
    {
        VentanaVerReporte ventanaVR= new VentanaVerReporte(usuario, reporte);
        ventanaVR.setVisible(true);//mostrar ventana usuarios
    }
    private boolean encontrado;
    private ConexionBDReporte conexionReport;
    private final ControladorMenu controlMenu;
    private ArrayList<Reporte> reportes;
    
}
