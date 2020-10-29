/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.*;

public class ConexionBaseDatos {
    
    private String url;
    private String usuario;
    private String contrasenha;
    private boolean datoEncontrado;
    private Usuario user;
    
    public ConexionBaseDatos()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        usuario= "postgres";
        contrasenha = "AMMC12345";
        datoEncontrado= false;
    }
    public Usuario consultarUsuario(String codigo)
    {
        Usuario miUsuario = new Usuario();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="SELECT * FROM Usuario WHERE codigo ="+"'"+codigo+"'" ;
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                setDatoEncontrado(true);
             System.out.println(resultado.getString("codigo"));
                    miUsuario.setCodigo(resultado.getString("codigo"));
                    miUsuario.setDocId(resultado.getString("docid"));
                    miUsuario.setNombre(resultado.getString("nombre"));
                    miUsuario.setCargo(resultado.getString("cargo"));
                    miUsuario.setNombreUsuario(resultado.getString("nombreusuario"));
                    miUsuario.setContrasenha(resultado.getString("contrasenha"));
                    miUsuario.setEstado(resultado.getString("estado"));
                    miUsuario.setFechaRegistro(resultado.getString("fecharegistro"));
                    miUsuario.setDireccion(resultado.getString("direccion"));
                    miUsuario.setTelefono(resultado.getString("telefono"));
                   
             }
            
            
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return miUsuario;
    
    }
    
    public Usuario consultarUsuarioLogin(String password, String nUser)
    {
        Usuario miUsuario = new Usuario();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="SELECT nombre, cargo, codigo, nombreusuario FROM Usuario "+ 
              "WHERE contrasenha ="+"'"+password+"'"+"AND "+
              "nombreusuario ="+"'"+nUser+"'";
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                setDatoEncontrado(true);
                miUsuario.setNombre(resultado.getString("nombre"));
                miUsuario.setCargo(resultado.getString("cargo"));
                miUsuario.setCodigo(resultado.getString("codigo"));
                miUsuario.setNombreUsuario(resultado.getString("nombreusuario"));
                
             }
                    
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return miUsuario;
    
    }
    
    public void actualizarUsuario(String campoCambio, String valorCambio, String codigo)
    {
         datoEncontrado= true;
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,usuario,contrasenha);
            java.sql.Statement statement = conexion.createStatement();
            System.out.println("Hata AQUI");
            String consulta ="UPDATE Usuario" +
                   " SET "+campoCambio+ " =" +"'"+valorCambio+"'"+ "WHERE codigo ="+"'"+codigo+"'";
            
            statement.executeUpdate(consulta);
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
        
        datoEncontrado= true;
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
