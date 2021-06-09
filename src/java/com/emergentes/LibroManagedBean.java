package com.emergentes;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "librosManagedBean")
@RequestScoped
@ManagedBean
public class LibroManagedBean {
    private String titulo;
    private String autor;
    private String resumen;
    private String medio;  
    public LibroManagedBean() {
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getResumen() {
        return resumen;
    }
    public String getMedio() {
        return medio;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }   
    public String mostrar(){
        return "salidaLibro";
    }
}
