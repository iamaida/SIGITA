/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

import java.sql.*;
import java.util.*;

public class ConexionBDUsuario {
    

    
    public ConexionBDUsuario()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        usuario= "postgres";
        contrasenha = "AMMC12345";
        datoEncontrado= false;
    }
    
    public Usuario consultarUsuario(String codigo)
    {
        user = new Usuario();
        Connection conexion;
        try{
            
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            
            String consulta ="SELECT * FROM Usuario WHERE codigo ="+"'"+codigo+"'" ;
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                 System.out.println("Dato encontrado!!");
                datoEncontrado = true;
                user.setCodigo(resultado.getString("codigo"));
                user.setDocId(resultado.getString("docid"));
                user.setNombre(resultado.getString("nombre"));
                user.setCargo(resultado.getString("cargo"));
                user.setNombreUsuario(resultado.getString("nombreusuario"));
                user.setContrasenha(resultado.getString("contrasenha"));
                user.setEstado(resultado.getString("estado"));
                user.setFechaRegistro(resultado.getString("fecharegistro"));
                user.setDireccion(resultado.getString("direccion"));
                user.setTelefono(resultado.getString("telefono"));
                   
             }
            
            
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            datoEncontrado = false;
            System.out.println("Dato No encontrado!!");
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return user;
    
    }
    
    public Usuario consultarUsuarioLogin(String password, String nUser)
    {
        user = new Usuario();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            
            String consulta ="SELECT nombre, cargo, codigo, nombreusuario FROM Usuario "+ 
              "WHERE contrasenha ="+"'"+password+"'"+"AND "+
              "nombreusuario ="+"'"+nUser+"'";
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                datoEncontrado = true;
                user.setNombre(resultado.getString("nombre"));
                user.setCargo(resultado.getString("cargo"));
                user.setCodigo(resultado.getString("codigo"));
                user.setNombreUsuario(resultado.getString("nombreusuario"));
                
             }
                    
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            datoEncontrado=false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return user;
    
    }
    
    public void actualizarUsuario(String campoCambio, String valorCambio, String codigo)
    {
         
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="UPDATE Usuario" +
                   " SET "+campoCambio+ " =" +"'"+valorCambio+"'"+ "WHERE codigo ="+"'"+codigo+"'";
            
            statement.executeUpdate(consulta);
            datoEncontrado= true;
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
    }
    
    public void insertarUsuario(Usuario miUsuario)
    {
        user = new Usuario();
        user = miUsuario;
       
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO Usuario (codigo, docId, nombre," +
                " cargo, nombreUsuario, contrasenha, estado,"+
                " fechaRegistro, direccion, telefono)";
            
            consulta = consulta + "VALUES("+"'"+user.getCodigo()+"'"+","+
                "'"+user.getDocId()+"'"+","+
                "'"+user.getNombre()+"'"+","+"'"+user.getCargo()+"'"+","+
                "'"+user.getNombreUsuario()+"'"+","+
                "'"+user.getContrasenha()+"'"+","+"'"+user.getEstado()+"'"+","+
                "'"+user.getFechaRegistro()+"'"+","+
                "'"+user.getDireccion()+"'"+","+"'"+user.getTelefono()+"'"+")";
            
            statement.executeUpdate(consulta);
            datoEncontrado= true;
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public boolean getDatoEncontrado()
    {
        return datoEncontrado;
    }
    
    private String url;
    private String usuario;
    private String contrasenha;
    private boolean datoEncontrado;
    private Usuario user;
}
