/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBDGestionReporte;

import java.sql.*;
import java.util.*;
import modeloGestionReporte.Reporte;

public class ConexionBDReporte {
    
    public ConexionBDReporte()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        userDB= "postgres";
        contraDB = "AMMC12345";
        datoEncontrado= false;
        reportes = new ArrayList<>();
    }
    
    public ArrayList<Reporte> consultarReportes()
    {
       
        Connection conexion;
        try{
            
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
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
            setDatoEncontrado(false);
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return reportes;
    }
    
    public void cambiarEstadoReporte (String campo, String valor, String codigo)
    {
        Connection conexion;
    
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            String consulta ="UPDATE Reporte" +
                   " SET "+campo+ " =" +"'"+valor+"'"+
                    "WHERE codigo ="+"'"+codigo+"'";
            setDatoEncontrado(true);
            statement.executeUpdate(consulta);
            statement.close();
            
        }catch(Exception e){
            setDatoEncontrado(false);
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                   
    }
    
    public void insertarReporte(Reporte miReporte)
    {
        report = new Reporte();
        report = miReporte;

        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();

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
            
            setDatoEncontrado(true);
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            
            setDatoEncontrado(false);
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public void setDatoEncontrado(boolean datoEncontrado)
    {
        this.datoEncontrado= datoEncontrado;
    }
    
    public boolean getDatoEncontrado()
    {
        return datoEncontrado;
    }
    
    private final String url;
    private final String userDB;
    private final String contraDB;
    private boolean datoEncontrado;
    private Reporte report;
    private final ArrayList<Reporte> reportes;
}
