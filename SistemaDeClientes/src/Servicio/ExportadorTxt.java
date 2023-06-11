package Servicio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Modelo.Cliente;

public class ExportadorTxt extends Exportador {
    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Escribir los datos de los clientes en formato texto
            for (Cliente cliente : listaClientes) {
                String line = "Nombre: " + cliente.getNombreCliente() + ", Apellido: " + cliente.getApellidoCliente()
                        + ", Email: " + cliente.getEmailCliente();
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al exportar el archivo de texto: " + e.getMessage());
        }
    }
}

