/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

/**
 *
 * @author Aidis
 */
public class Usuario extends Persona {
    
    private String cargo;
    private String codigo;
    private String nombreUsuario;
    private String contrasenha;
    private String estado;
    
    public Usuario (){
        super();
    }
    
    public void setCargo( String cargo) {
        this.cargo = cargo;
    }
    
    public void setCodigo( String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombreUsuario (String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasenha( String contrasenha) {
        this.contrasenha = contrasenha;
    }
    
     public void setEstado( String estado) {
        this.estado = estado;
    }
     
    public String getCargo( ) {
        return cargo;
    }
    
    public String getCodigo( ) {
        return codigo;
    }
    
    public String getNombreUsuario ( ) {
        return nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }
    
    public String getEstado( ) {
        return estado;
    }
    
    
}
