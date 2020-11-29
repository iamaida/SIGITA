/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendGestionCliente;

import java.sql.*;
import java.util.*;

public class ConexionBDCliente {
    
    private String url;
    private String usuario;
    private String contrasenha;
    private boolean datoEncontrado;
    private Cliente client;
    
    public ConexionBDCliente()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        usuario= "postgres";
        contrasenha = "AMMC12345";
        datoEncontrado= false;
    }
    public Cliente consultarCliente(String docId)
    {
        Cliente miCliente = new Cliente();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="SELECT * FROM Cliente WHERE docid ="+"'"+docId+"'" ;
            ResultSet resultado = statement.executeQuery(consulta);
            
            
            while(resultado.next())
            {
             datoEncontrado = true;
             System.out.println(resultado.getString("docid"));
             
                miCliente.setNombre(resultado.getString("nombre"));
                miCliente.setEmail(resultado.getString("email"));
                miCliente.setTelefono(resultado.getString("telefono"));
                miCliente.setDireccion(resultado.getString("direccion"));
                miCliente.setFechaRegistro(resultado.getString("fecharegistro"));
                   
             }
            
            
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return miCliente;
    
    }
       
    public void actualizarCliente(String campoCambio, String valorCambio, String docId)
    {
         datoEncontrado= true;
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="UPDATE Cliente" +
                   " SET "+campoCambio+ " =" +"'"+valorCambio+"'"+ "WHERE docid ="+"'"+docId+"'";
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public void insertarCliente(Cliente miCliente)
    {
        client = new Cliente();
        client = miCliente;
        
        datoEncontrado= true;
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO Cliente (docid, nombre, telefono," +
                " direccion, fecharegistro, email)";
            
            consulta = consulta + "VALUES("+"'"+client.getDocId()+"'"+","+
                "'"+client.getNombre()+"'"+","+"'"+client.getTelefono()+
                "'"+","+"'"+client.getDireccion()+"'"+","+
                "'"+client.getFechaRegistro()+"'"+","+
                "'"+client.getEmail()+"'"+")";
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
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
    
}
