/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionVenta;

import java.util.ArrayList;
import modeloGestionInventario.Producto;

/**
 *
 * @author Aidis
 */
public class Factura {
    
    public Factura()
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
    
    public String getCodCajero() {
        return codCajero;
    }

    public void setCodCajero(String codCajero) {
        this.codCajero = codCajero;
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    public double getTotal() {
        return total;
    }

    public void sumarTotalPVenta()
    {
        total =0;
        double multp;
        
        for(int i =0; i< productos.size(); i++)
        {
            multp = Integer.parseInt(productos.get(i).getCantidad());
            multp = multp* Double.parseDouble(productos.get(i).getPrecioVenta());
            total = total + multp;
        }
        
    }
    
    
    private String codigo;
    private String fecha;
    private String codCajero;
    private String idCliente;
    private double total;
    private final ArrayList<Producto> productos;
    
}
