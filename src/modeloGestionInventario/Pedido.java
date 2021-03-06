/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionInventario;

import java.util.ArrayList;

/**
 *
 * @author Aidis
 */
public class Pedido {

    public Pedido()
    {
        total = 0;
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }
    
    public void quitarProducto(int index)
    {
        productos.remove(index-1);
    }
    
    public ArrayList<Producto> getProductos()
    {
        return productos;
    }
            
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodAlmacenista() {
        return codAlmacenista;
    }

    public void setCodAlmacenista(String codAlmacenista) {
        this.codAlmacenista = codAlmacenista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void sumarTotalPCompra()
    {
        total =0;
        double multp;
        
        for(int i =0; i< productos.size(); i++)
        {
            multp = Integer.parseInt(productos.get(i).getCantidad());
            multp = multp* Double.parseDouble(productos.get(i).getPrecioCompra());
            total = total + multp;
        }
       
    }
    
    private String codigo;
    private String fecha;
    private String codAlmacenista;
    private String estado;
    private double total;
    private final ArrayList<Producto> productos;
    
}
