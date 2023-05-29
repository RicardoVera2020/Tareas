package TiendaReciclaje;


import java.util.Scanner;
import java.util.List;
import TiendaReciclaje.Producto;
import TiendaReciclaje.ProductoServicio;
import TiendaReciclaje.ArchivoServicio;


class Menu {
    private Scanner scanner;
    private ProductoServicio productoServicio;

    public Menu() {
        scanner = new Scanner(System.in);
        productoServicio = new ProductoServicio();
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("1 Listar Producto");
            System.out.println("2 Editar Datos");
            System.out.println("3 Importar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    productoServicio.mostrarProductos();
                    break;
                case 2:
                    editarDatos();
                    break;
                case 3:
                    ArchivoServicio.cargarDatos(productoServicio);
                    break;
                case 4:
                    System.out.println("Abandonando el sistema de clientes...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private void editarDatos() {
        System.out.println("Editar Producto");
        System.out.print("Ingrese el número 1 para editar los datos ingresados del Producto: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese código del producto: ");
            String codigo = scanner.next();

            for (Producto producto : productoServicio.getListaProductos()) {
                if (producto.getCodigo().equals(codigo)) {
                    System.out.println("1.-El nombre del articulo actual es: " + producto.getArticulo());
                    System.out.println("2.-El código del producto: " + producto.getCodigo());
                    System.out.println("3.-El color del producto: " + producto.getColor());
                    System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
                    System.out.println("5.-La marca del producto: " + producto.getMarca());
                    System.out.println("6.-El precio del producto: " + producto.getPrecio());
                    System.out.println("7.-La talla del producto: " + producto.getTalla());
                    System.out.print("Ingrese la opción a editar de los datos del producto: ");
                    int opcionEditar = scanner.nextInt();

                    switch (opcionEditar) {
                        case 1:
                            System.out.print("Ingrese el nuevo nombre del articulo: ");
                            String nuevoArticulo = scanner.next();
                            producto.setArticulo(nuevoArticulo);
                            break;
                        case 2:
                            System.out.print("Ingrese el nuevo código del producto: ");
                            String nuevoCodigo = scanner.next();
                            producto.setCodigo(nuevoCodigo);
                            break;
                        case 3:
                            System.out.print("Ingrese el nuevo color del producto: ");
                            String nuevoColor = scanner.next();
                            producto.setColor(nuevoColor);
                            break;
                        case 4:
                            System.out.print("Ingrese la nueva descripción del producto: ");
                            String nuevaDescripcion = scanner.next();
                            producto.setDescripcion(nuevaDescripcion);
                            break;
                        case 5:
                            System.out.print("Ingrese la nueva marca del producto: ");
                            String nuevaMarca = scanner.next();
                            producto.setMarca(nuevaMarca);
                            break;
                        case 6:
                            System.out.print("Ingrese el nuevo precio del producto: ");
                            String nuevoPrecio = scanner.next();
                            producto.setPrecio(nuevoPrecio);
                            break;
                        case 7:
                            System.out.print("Ingrese la nueva talla del producto: ");
                            String nuevaTalla = scanner.next();
                            producto.setTalla(nuevaTalla);
                            break;
                        default:
                            System.out.println("Opción inválida. No se realizarán cambios.");
                    }
                }
            }
        }
    }
}
