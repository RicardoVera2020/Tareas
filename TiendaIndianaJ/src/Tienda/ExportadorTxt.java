package Tienda;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class ExportadorTxt extends Exportador {
    @Override
    public void exportar(ArrayList<Producto> listaProductos) {
        System.out.println("Exportando datos a archivo TXT.");
    
        try {
            FileWriter writer = new FileWriter("productos.txt"); // Nombre del archivo de salida

            for (Producto producto : listaProductos) {
                // Obtener los atributos del producto
                String articulo = producto.getArticulo();
                

               
            }

            writer.close();
            System.out.println("Datos exportados exitosamente en el archivo productos.txt.");

            //  ubicación del archivo
            System.out.println("Ubicación del archivo: " + new File("productos.txt").getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al exportar los datos: " + e.getMessage());
        }
    }
}
