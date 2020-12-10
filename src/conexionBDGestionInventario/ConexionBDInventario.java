/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBDGestionInventario;

import java.sql.*;
import modeloGestionInventario.*;


public class ConexionBDInventario {
   
    
    public ConexionBDInventario()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        userDB= "postgres";
        contraDB = "AMMC12345";
        datoEncontrado= false;
    }
    
    public Producto consultarProducto(String codigo)
    {
        Producto miProducto = new Producto();
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            String consulta ="SELECT * FROM Producto WHERE codigo ="+"'"+codigo+"'" ;
            ResultSet resultado = statement.executeQuery(consulta);
           
            while(resultado.next())
            {
                setDatoEncontrado(true);
                miProducto.setCodigo(resultado.getString("codigo"));
                miProducto.setDescripcion(resultado.getString("descripcion"));
                miProducto.setProveedor(resultado.getString("proveedor"));
                miProducto.setTipo(resultado.getString("tipo"));
                miProducto.setPrecioCompra(resultado.getString("preciocompra"));
                miProducto.setPrecioVenta(resultado.getString("precioventa"));
                miProducto.setFechaV(resultado.getString("fechavencimiento"));
                miProducto.setCantidad(resultado.getString("cantidad"));
                   
             }
                   
            resultado.close();
            statement.close();
            
        }catch(Exception e){
            
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
    
        return miProducto;
    
    }
    
    public void insertarItemPedido (ItemPedido miItem)
    {
        itemPedido = new ItemPedido();
        itemPedido = miItem;
        
        
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO ItemPedido (nroItem, codPedido, codProducto," +
                " cantidad)";
            
            consulta = consulta + "VALUES("+"'"+itemPedido.getNroItem()+"'"+","+
                "'"+itemPedido.getCodPedido()+"'"+","+
                "'"+itemPedido.getCodProducto()+"'"+","+
                "'"+itemPedido.getCantidad() +"'"+")";
            datoEncontrado= true;
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public void insertarPedido (Pedido miPedido)
    {
        pedido = new Pedido();
        this.pedido = miPedido;
        
        
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO Pedido (codigo, fechaPedido, codAlmacenista," +
                " estado, total "+")";
            datoEncontrado= true;
            consulta = consulta + "VALUES("+"'"+pedido.getCodigo()+"'"+","+
                "'"+pedido.getFecha()+"'"+","+
                "'"+pedido.getCodAlmacenista()+"'"+","+
                "'"+pedido.getEstado()+"'"+","+
                "'"+pedido.getTotal() +"'"+")";
            
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public void actualizarProducto(String campoCambio, String valorCambio,
                                    String codigo)
    {
            consultarProducto(codigo);
        Connection conexion;
        
        if(getDatoEncontrado())
        {
            try{
            
                Class.forName("org.postgresql.Driver");
                conexion= DriverManager.getConnection(url,userDB,contraDB);
                java.sql.Statement statement = conexion.createStatement();
            
                String consulta ="UPDATE Producto " +
                             "SET "+campoCambio+ " =" +"'"+valorCambio+"'"+ 
                             " WHERE codigo ="+"'"+codigo+"'";
                setDatoEncontrado(true);
                statement.executeUpdate(consulta);
                statement.close();

            
            }catch(Exception e){
                setDatoEncontrado(false);
                System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
            }
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
    private ItemPedido itemPedido;
    private Pedido pedido;
    
}
