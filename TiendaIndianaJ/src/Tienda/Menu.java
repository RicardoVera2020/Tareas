package Tienda;

import java.util.Scanner;


//clase principal
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        ExportadorTxt exportadorTxt = new ExportadorTxt();

        int opcion;
        do {
            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    productoServicio.listarProductos();
                    break;
                case 2:
                    System.out.println("Crear Producto");
                    System.out.println("Ingresar nombre del producto:");
                    String articulo = scanner.nextLine();
                    System.out.println("Ingresa precio:");
                    String precio = scanner.nextLine();
                    System.out.println("Ingresa descripción:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingresa código:");
                    String codigo = scanner.nextLine();
                    System.out.println("Ingresa talla:");
                    String talla = scanner.nextLine();
                    System.out.println("Ingresa marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Ingresa color:");
                    String color = scanner.nextLine();

                    Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
                    productoServicio.agregarProducto(producto);
                    break;
                case 3:
                    exportadorTxt.exportar(productoServicio.getListaProductos());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}
