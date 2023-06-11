package Servicio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Modelo.Cliente;

public class ExportadorCsv extends Exportador {
    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Escribir el encabezado del archivo CSV
            writer.println("Run,Nombre,Apellido,Email,Años,Categoría");

            // Escribir los datos de los clientes
            for (Cliente cliente : listaClientes) {
                String line = cliente.getRunCliente() + "," +
                              cliente.getNombreCliente() + "," +
                              cliente.getApellidoCliente() + "," +
                              cliente.getEmailCliente() + "," +
                              cliente.getAniosCliente() + "," +
                              cliente.getNombreCategoria().toString();
                writer.println(line);
            }

            System.out.println("Datos exportados en formato CSV correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
