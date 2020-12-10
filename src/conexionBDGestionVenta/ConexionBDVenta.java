/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBDGestionVenta;


import java.sql.*;
import modeloGestionVenta.Factura;
import modeloGestionVenta.ItemFactura;

/**
 *
 * @author Aidis
 */
public class ConexionBDVenta {
     
    public ConexionBDVenta()
    {
        url = "jdbc:postgresql://localhost:5432/SIGITA";
        userDB= "postgres";
        contraDB = "AMMC12345";
        datoEncontrado= false;
    }
    
    public void insertarItemFactura (ItemFactura miItem)
    {
        itemFactura = new ItemFactura();
        itemFactura = miItem;
        
        
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO ItemFactura (nroItem, codFactura, codProducto," +
                " cantidad)";
            
            consulta = consulta + "VALUES("+"'"+itemFactura.getNroItem()+"'"+","+
                "'"+itemFactura.getCodFactura()+"'"+","+
                "'"+itemFactura.getCodProducto()+"'"+","+
                "'"+itemFactura.getCantidad() +"'"+")";
            datoEncontrado= true;
            statement.executeUpdate(consulta);
            statement.close();

            
        }catch(Exception e){
            datoEncontrado= false;
            System.out.println("ERROR DE CONEXIÓN"+e.getMessage());
        }
                    
  
    }
    
    public void insertarFactura (Factura miFactura)
    {
        factura = new Factura();
        this.factura = miFactura;
        
        
        Connection conexion;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,userDB,contraDB);
            java.sql.Statement statement = conexion.createStatement();
            
            System.out.println("Hata AQUI");
            String consulta = "INSERT INTO Factura (codigo, fechaVenta, codCajero," +
                " idCliente, totalVenta "+")";
            datoEncontrado= true;
            consulta = consulta + "VALUES("+"'"+factura.getCodigo()+"'"+","+
                "'"+factura.getFecha()+"'"+","+
                "'"+factura.getCodCajero()+"'"+","+
                "'"+factura.getIdCliente()+"'"+","+
                "'"+factura.getTotal() +"'"+")";
            
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
    
    private final String url;
    private final String userDB;
    private final String contraDB;
    private boolean datoEncontrado;
    private ItemFactura itemFactura;
    private Factura factura;
    
}
