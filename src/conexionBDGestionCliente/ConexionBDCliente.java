/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBDGestionCliente;

import java.sql.*;
import java.util.*;
import modeloGestionCliente.Cliente;

public class ConexionBDCliente {
    

    
    public ConexionBDCliente()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        userBD= "postgres";
        contraBD = "AMMC12345";
        datoEncontrado= false;
    }
    public Cliente consultarCliente(String docId)
    {
        client = new Cliente();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userBD,contraBD);
            java.sql.Statement statement = conexion.createStatement();
            String consulta ="SELECT * "+
                             "FROM Cliente "+
                             "WHERE docid ="+"'"+docId+"'" ;
            ResultSet resultado = statement.executeQuery(consulta);
            
            while(resultado.next())
            {
                
                setDatoEncontrado(true);
                client.setNombre(resultado.getString("nombre"));
                client.setEmail(resultado.getString("email"));
                client.setTelefono(resultado.getString("telefono"));
                client.setDireccion(resultado.getString("direccion"));
                client.setFechaRegistro(resultado.getString("fecharegistro"));
                   
             }
            
            
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            setDatoEncontrado(false);
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return client;
    
    }
       
    public void actualizarCliente(String campoCambio, String valorCambio, String docId)
    {
        consultarCliente(docId);
        Connection conexion;
        
        if(getDatoEncontrado())
        {
            try{
                Class.forName("org.postgresql.Driver");
                conexion= DriverManager.getConnection(url,userBD,contraBD);
                java.sql.Statement statement = conexion.createStatement();
                String consulta ="UPDATE Cliente " +
                             "SET "+campoCambio+ " =" +"'"+valorCambio+"'"+ 
                             " WHERE docid ="+"'"+docId+"'";
            
                statement.executeUpdate(consulta);
                setDatoEncontrado(true);
                statement.close();

            
            }catch(Exception e){
                setDatoEncontrado(false);
                System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
            }
        }           
  
    }
    
    public void insertarCliente(Cliente miCliente)
    {
        client = new Cliente();
        client = miCliente;

        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userBD,contraBD);
            java.sql.Statement statement = conexion.createStatement();
            
            String consulta = "INSERT INTO Cliente (docid, nombre, telefono," +
                " direccion, fecharegistro, email)";
            
            consulta = consulta + "VALUES("+"'"+client.getDocId()+"'"+","+
                "'"+client.getNombre()+"'"+","+"'"+client.getTelefono()+
                "'"+","+"'"+client.getDireccion()+"'"+","+
                "'"+client.getFechaRegistro()+"'"+","+
                "'"+client.getEmail()+"'"+")";
            
            statement.executeUpdate(consulta);
            setDatoEncontrado(true);
            statement.close();

            
        }catch(Exception e){
            setDatoEncontrado(false);
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    private void setDatoEncontrado(boolean datoEncontrado)
    {
        this.datoEncontrado= datoEncontrado;
    }
    
    public boolean getDatoEncontrado()
    {
        return datoEncontrado;
    }
    
    private final String url;
    private final String userBD;
    private final String contraBD;
    private boolean datoEncontrado;
    private Cliente client;
}
