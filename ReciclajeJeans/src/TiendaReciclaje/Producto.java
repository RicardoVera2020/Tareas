package TiendaReciclaje;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Producto {
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;
    private String color;

    public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    
    
    // get y set
    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Datos del Producto:\n" +
                "Nombre articulo: " + articulo + "\n" +
                "Código: " + codigo + "\n" +
                "Marca: " + marca + "\n" +
                "Color: " + color + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Precio: " + precio + "\n" +
                "Talla: " + talla;
    }
}