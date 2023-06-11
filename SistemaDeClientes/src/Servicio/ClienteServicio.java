package Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Cliente;

public class ClienteServicio {
    private List<Cliente> listaClientes;
    private Scanner scanner;

    public ClienteServicio() {
        this.listaClientes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void editarCliente(String email) {
        Cliente clienteExistente = buscarClientePorEmail(email);
        if (clienteExistente != null) {
            System.out.println("Ingrese los nuevos datos del cliente:");
            System.out.print("Nombre: ");
            String nuevoNombre = scanner.nextLine();
            clienteExistente.setNombreCliente(nuevoNombre);

            System.out.print("Apellido: ");
            String nuevoApellido = scanner.nextLine();
            clienteExistente.setApellidoCliente(nuevoApellido);

            System.out.print("Email: ");
            String nuevoEmail = scanner.nextLine();
            clienteExistente.setEmailCliente(nuevoEmail);

            System.out.print("Run: ");
            String nuevoRun = scanner.nextLine();
            clienteExistente.setRunCliente(nuevoRun);

            System.out.print("Años: ");
            int nuevosAnios = Integer.parseInt(scanner.nextLine());
            clienteExistente.setAniosCliente(nuevosAnios);

            System.out.println("Cliente editado con éxito.");
        } else {
            System.out.println("No se encontró ningún cliente con el email proporcionado.");
        }
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void listarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }
    }

    public Cliente buscarCliente(String run) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getRunCliente() != null && cliente.getRunCliente().equals(run)) {
                return cliente;
            }
        }
        return null; // Si el cliente no se encuentra, devuelve null
    }

    
    public void importarDatos(String fileName1) {
        // TODO: Implementar la lógica para importar datos desde un archivo
    }

    public List<Cliente> getClientes() {
        return listaClientes; // 
    }

    
    public Cliente buscarClientePorEmail(String email) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getEmailCliente().equals(email)) {
                return cliente;
            }
        }
        return null;
    }
}

