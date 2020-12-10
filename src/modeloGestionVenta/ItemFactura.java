/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionVenta;

/**
 *
 * @author Aidis
 */
public class ItemFactura {
    
    public ItemFactura() {
        
    }

    public String getNroItem() {
        return nroItem;
    }

    public void setNroItem(String nroItem) {
        this.nroItem = nroItem;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    private String nroItem;
    private String codFactura;
    private String codProducto;
    private double cantidad;
    
}
