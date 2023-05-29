package TiendaReciclaje;

import java.util.List;
import java.util.ArrayList;
import TiendaReciclaje.Producto;


class ProductoServicio {
    private List<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
            System.out.println("---------------------------------");
        }
    }
}