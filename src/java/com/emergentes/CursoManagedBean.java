package com.emergentes;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "cursoManagedBean")
@ManagedBean
@RequestScoped
public class CursoManagedBean {
    private String nombre;
    private String apellidos;
    private String curso;
    
    public CursoManagedBean() {
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCurso() {
        return curso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }  
    public String mostrar(){
        return "salidaCurso";
    }
}
