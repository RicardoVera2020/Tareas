package TiendaReciclaje;

class ArchivoServicio {
    public static void cargarDatos(ProductoServicio productoServicio) {
        // llenar con los archivos
        Producto producto1 = new Producto("Jean", "15000", "Es un Jean muy lindo con hermosos detalles",
                "1500", "42", "Levis", "Azul Marino");
        productoServicio.agregarProducto(producto1);

        Producto producto2 = new Producto("Jean", "25000", "Es un Jean caro pero hermoso hermoso",
                "1501", "46", "IndianaJeans", "Blanco");
        productoServicio.agregarProducto(producto2);

        System.out.println("Datos cargados correctamente en la lista");
    }
}