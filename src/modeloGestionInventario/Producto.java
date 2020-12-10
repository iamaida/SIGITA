/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionInventario;

/**
 *
 * @author Aidis
 */
public class Producto {
     
    public Producto()
    {
    
    }
 
    public void setCodigo( String codigo) {
        this.codigo = codigo;
    }
    
    public void setDescripcion( String descripcion) {
        this.descripcion = descripcion;
    }
    
     public void setProveedor( String proveedor) {
        this.proveedor = proveedor;
    }
    
    public void setTipo( String tipo) {
        this.tipo = tipo;
    }
    
    public void setPrecioCompra( String precioCompra){
        this.precioCompra = precioCompra;
    }
    
    public void setPrecioVenta( String precioVenta){
        this.precioVenta = precioVenta;
    }
     
    public void setFechaV(String fecha)
    {
        this.fecha = fecha;
    }
    
    public void setCantidad(String cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
     public String getProveedor() {
        return proveedor;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getPrecioCompra(){
        return precioCompra;
    }
    
    public String getPrecioVenta(){
        return precioVenta;
    }
     
    public String getFechaV()
    {
        return fecha;
    }
    
    public String getCantidad()
    {
        return cantidad;
    }
    
    private String codigo;
    private String descripcion;
    private String proveedor;
    private String tipo;
    private String precioCompra;
    private String precioVenta;
    private String fecha;
    private String cantidad;
}
