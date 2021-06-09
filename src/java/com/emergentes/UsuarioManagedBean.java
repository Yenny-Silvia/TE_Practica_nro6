package com.emergentes;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "usuariosManagedBean")
@RequestScoped
@ManagedBean
public class UsuarioManagedBean {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;   
    public UsuarioManagedBean() {
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }   
    public String mostrar(){
        return "salidaUsuario";
    }
}
