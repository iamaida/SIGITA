/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendGestionInventario;

import java.util.ArrayList;

/**
 *
 * @author Aidis
 */
public class Pedido {

    private String codigo;
    private String fecha;
    private String codAlmacenista;
    private String estado;
    private double total;
    private ArrayList<Producto> productos;
    
    public Pedido()
    {
        total = 0;
        productos = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
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

    public void sumarATotal(double cant, double precio)
    {
        double multp = cant*precio;
        total = total + multp;
 
    }
    
}
