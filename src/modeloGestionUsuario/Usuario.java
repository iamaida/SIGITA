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
    
    public Usuario (){
        super();
    }

    public void setCargo( String cargo) {
        this.cargo = cargo;
    }
    
    public void setCodigo( String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombreUsuario (String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public void setContrasenha( String password) {
        this.password = password;
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
        return nomUsuario;
    }

    public String getContrasenha() {
        return password;
    }
    
    public String getEstado( ) {
        return estado;
    }
    
    private String cargo;
    private String codigo;
    private String nomUsuario;
    private String password;
    private String estado;
}
