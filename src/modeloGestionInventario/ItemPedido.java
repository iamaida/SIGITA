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
public class ItemPedido {
    
    private String nroItem;
    private String codPedido;
    private String codProducto;
    private double cantidad;

    public ItemPedido() {
        
    }

    public String getNroItem() {
        return nroItem;
    }

    public void setNroItem(String nroItem) {
        this.nroItem = nroItem;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
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

}
