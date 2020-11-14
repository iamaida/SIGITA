/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloGestionUsuario;

import java.util.Date;

/**
 *
 * @author Aidis
 */
//Date(int year, int month, int date)
public class Persona {
    
    private String nombre;
    private String docId;
    private String fechaRegistro;
    private String direccion;
    private String telefono;
    private String email;
 
    public Persona()
    {
    
    }
 
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    
    public void setDocId( String docId) {
        this.docId = docId;
    }
    
     public void setFechaRegistro( String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public void setDireccion( String direccion) {
        this.direccion = direccion;
    }
    
    public void setTelefono( String telefono){
        this.telefono = telefono;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDocId( ) {
        return docId;
    }
    
    public String getFechaRegistro( ) {
        return fechaRegistro;
    }
    
    public String getDireccion( ) {
        return direccion;
    }
    
    public String getTelefono( ){
        return telefono;
    }
    
    public String getEmail( )
    {
        return email;
    }
    
}
