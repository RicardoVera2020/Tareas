package Tienda;

import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
   // metodo para listar
    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : listaProductos) {
                System.out.println(producto.toString());
            }
        }
    }
 
    
      // metodo para agregar
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }
}
