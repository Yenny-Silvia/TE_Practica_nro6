package com.emergentes;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "productoManagedBean")
@RequestScoped
@ManagedBean
public class ProductoManagedBean {   
    private String producto;
    private String categoria;
    private int existencia;
    private float precio;   
    public ProductoManagedBean() {
    }
    public String getProducto() {
        return producto;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getExistencia() {
        return existencia;
    }
    public float getPrecio() {
        return precio;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }  
    public String mostrar(){
        return "salidaProducto";
    }
}
