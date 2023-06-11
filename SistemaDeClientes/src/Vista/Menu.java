package Vista;

import java.util.Scanner;
import Servicio.ArchivoServicio;
import Servicio.ClienteServicio;
import Servicio.ExportadorCsv;
import Servicio.ExportadorTxt;
import Modelo.Cliente;


public class Menu {
    private ClienteServicio clienteServicio;
    private ArchivoServicio archivoServicio;
    private Scanner scanner;

    public Menu() {
        this.clienteServicio = new ClienteServicio();
        this.archivoServicio = new ArchivoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Importar Datos");
            System.out.println("5. Exportar Datos");
            System.out.println("6. Terminar Programa");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    agregarCliente();
                    break;
                case 3:
                    editarCliente();
                    break;
                case 4:
                    importarDatos();
                    break;
                case 5:
                    exportarDatos();
                    break;
                case 6:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 6);
    }

    public void listarClientes() {
        clienteServicio.listarClientes();
    }

    public void agregarCliente() {
        System.out.println("---------Agregar Cliente-----------");
        System.out.print("Ingrese el run del cliente: ");
        String run = scanner.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el email del cliente: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese años del cliente: ");
        int anios = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese estado del cliente: ");
        String estado = scanner.nextLine();

        Cliente cliente = new Cliente(run, nombre, apellido, email, anios, estado);

        clienteServicio.agregarCliente(cliente);
        System.out.println("Cliente agregado correctamente.");
    }


    public void editarCliente() {
        System.out.println("---------Editar Cliente-----------");
        System.out.print("Ingrese el run del cliente a editar: ");
        String run = scanner.nextLine();

        Cliente clienteExistente = clienteServicio.buscarCliente(run);

        if (clienteExistente != null) {
            System.out.println("Cliente encontrado: " + clienteExistente);
            System.out.print("Ingrese el nuevo nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el nuevo apellido del cliente: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese el nuevo email del cliente: ");
            String email = scanner.nextLine();

            clienteExistente.setNombreCliente(nombre);
            clienteExistente.setApellidoCliente(apellido);
            clienteExistente.setEmailCliente(email);

            System.out.println("Cliente editado correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void importarDatos() {
        System.out.println("---------Importar Datos-----------");
        System.out.print("Ingrese la ruta del archivo a importar: ");
        String rutaArchivo = scanner.nextLine();

        archivoServicio.importarDatos(rutaArchivo);
        System.out.println("Datos importados correctamente.");
    }

    public void exportarDatos() {
        System.out.println("---------Exportar Datos-----------");
        System.out.println("Seleccione el formato a exportar:");
        System.out.println("1.- Formato CSV");
        System.out.println("2.- Formato TXT");
        System.out.print("Ingrese una opción para exportar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        String rutaArchivo = "C:\\Users\\ricardo\\Desktop\\curso andoid\\Modulo 3\\sistemacliente.csv";

        switch (opcion) {
            case 1:
                exportarCsv();
                break;
            case 2:
                exportarTxt();
                break;
            default:
                System.out.println("Opción inválida. No se realizará la exportación.");
        }
    }

    public void exportarCsv() {
        System.out.println("---------Exportar Datos en formato CSV-----------");
        System.out.print("Ingresa la ruta donde deseas exportar el archivo clientes.csv: ");
        //String rutaArchivo = scanner.nextLine();
        String rutaArchivo = "C:\\Users\\ricardo\\Desktop\\curso andoid\\Modulo 3\\sistemacliente.csv";


        ExportadorCsv exportadorCsv = new ExportadorCsv();
        archivoServicio.exportar(rutaArchivo, clienteServicio.getClientes(), exportadorCsv);
        System.out.println("Datos exportados en formato CSV correctamente.");
    }


    public void exportarTxt() {
        System.out.println("---------Exportar Datos en formato TXT-----------");
        String rutaArchivo = "C:\\Users\\ricardo\\Desktop\\curso andoid\\Modulo 3\\sistemaclientes\\clientes.txt";
        //String rutaArchivo = scanner.nextLine();
        
        
        ExportadorTxt exportadorTxt = new ExportadorTxt();
        archivoServicio.exportar(rutaArchivo, clienteServicio.getClientes(), exportadorTxt);
        System.out.println("Datos exportados en formato TXT correctamente.");
    }
}