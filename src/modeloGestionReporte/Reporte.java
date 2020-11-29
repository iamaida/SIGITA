/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionReporte;

/**
 *
 * @author Aidis
 */
public class Reporte {
    

    public Reporte()
    {
    
    }
 
    public void setCodigo( String codigo) {
        this.codigo = codigo;
    }
    
    public void setFecha( String fecha) {
        this.fecha = fecha;
    }
    
     public void setTipo( String tipo) {
        this.tipo = tipo;
    }
    
    public void setEstado( String estado) {
        this.estado= estado;
    }
    
    public void setCodUsuario( String codUsuario){
        this.codUsuario= codUsuario;
    }
    
    public void setCodProducto(String codProducto)
    {
        this.codProducto = codProducto;
    }
    
    public void setNomInteresado( String  nomInteresado) {
        this.nomInteresado = nomInteresado;
    }
    
    public void setComentario( String  comentario) {
        this.comentario = comentario;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public String getTipo( ) {
        return tipo;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getCodUsuario(){
        return codUsuario;
    }
    
    public String getCodProducto()
    {
        return codProducto;
    }
    
    public String getNomInteresado( ) {
        return nomInteresado;
    }
    
    public String getComentario( ) {
        return comentario;
    }
    
    private String codigo;
    private String fecha;
    private String tipo;
    private String estado;
    private String codUsuario;
    private String codProducto;
    private String nomInteresado;
    private String comentario;   
 
}
