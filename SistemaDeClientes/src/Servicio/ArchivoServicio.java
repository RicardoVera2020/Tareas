package Servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import Modelo.Cliente;
import Modelo.CategoriaEnum;

@SuppressWarnings("unused")
public class ArchivoServicio extends Exportador {
    private ClienteServicio clienteServicio;
    
    public ArchivoServicio() {
        clienteServicio = new ClienteServicio();
    }

    public void cargarDatos(String fileName) {
        // ...
    }

    public void importarDatos(String fileName) {
        // ...
    }

    @Override
    public void exportar(String rutacvs, List<Cliente> listaClientes, ExportadorCsv exportadorCsv) {
        // ...
    }

    public void exportar(String rutaTxt, List<Cliente> listaClientes, ExportadorTxt exportadorTxt) {
        // ...
    }
    
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("Run,Nombre,Apellido,Email,Años,Categoría");
            bufferedWriter.newLine();

            for (Cliente cliente : listaClientes) {
                String linea = cliente.getRunCliente() + "," +
                               cliente.getNombreCliente() + "," +
                               cliente.getApellidoCliente() + "," +
                               cliente.getEmailCliente() + "," +
                               cliente.getAniosCliente() + "," +
                               cliente.getNombreCategoria().toString();

                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }

            System.out.println("Datos exportados en formato CSV correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
