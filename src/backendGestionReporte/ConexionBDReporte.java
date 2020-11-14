/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendGestionReporte;

import modeloGestionUsuario.Usuario;
import java.sql.*;
import java.util.*;

public class ConexionBDReporte {
    
    private String url;
    private String usuario;
    private String contrasenha;
    private boolean datoEncontrado;
    private Reporte report;
    private ArrayList<Reporte> reportes;
    
    public ConexionBDReporte()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        usuario= "postgres";
        contrasenha = "AMMC12345";
        datoEncontrado= false;
        reportes = new ArrayList<Reporte>();
    }
    
    public void consultarReportes()
    {
       
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="SELECT * FROM Reporte" ;
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                setDatoEncontrado(true);
                report = new Reporte();
                report.setEstado(resultado.getString("estado"));
                
                if(report.getEstado().equalsIgnoreCase("NoRevisado"))
                {
                    report.setCodigo(resultado.getString("codigo"));
                   
                    report.setFecha(resultado.getString("fecha"));
                    report.setTipo(resultado.getString("tipo"));
                    report.setCodUsuario(resultado.getString("codUsuario"));
                    report.setCodProducto(resultado.getString("codProducto"));
                    report.setNomInteresado(resultado.getString("nombreInt"));
                    report.setComentario(resultado.getString("comentario"));
                    
                    reportes.add(report);
                }
                              
                
                
             }
            
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
    
    }
    
    public void cambiarEstadoReporte (String campoCambio, String valorCambio, String codigo)
    {
         datoEncontrado= true;
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            String consulta ="UPDATE Reporte" +
                   " SET "+campoCambio+ " =" +"'"+valorCambio+"'"+
                    "WHERE codigo ="+"'"+codigo+"'";
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
    }
    
     public void insertarReporte(Reporte miReporte)
    {
        report = new Reporte();
        report = miReporte;
        
        datoEncontrado= true;
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO Reporte (codigo, fecha, tipo," +
                " estado, codUsuario, codProducto, nombreInt,"+
                "comentario)";
            
            consulta = consulta + "VALUES("+"'"+report.getCodigo()+"'"+","+
                "'"+report.getFecha()+"'"+","+
                "'"+report.getTipo()+"'"+","+"'"+report.getEstado()+"'"+","+
                "'"+report.getCodUsuario()+"'"+","+
                "'"+report.getCodProducto()+"'"+","+
                "'"+report.getNomInteresado()+"'"+","+
                "'"+report.getComentario()+"'"+")";
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public ArrayList<Reporte> getReportes()
    {
        return reportes;
    }
    
    public void setDatoEncontrado(boolean datoEncontrado)
    {
        this.datoEncontrado= datoEncontrado;
    }
    
    public boolean getDatoEncontrado()
    {
        return datoEncontrado;
    }
    
}
