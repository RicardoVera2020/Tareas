package Servicio;

import java.util.List;
import Modelo.Cliente;

public abstract class Exportador {
    public abstract void exportar(String fileName, List<Cliente> listaClientes);

    public void exportar(String fileName, List<Cliente> listaClientes, ExportadorCsv exportadorCsv) {
        exportadorCsv.exportar(fileName, listaClientes);
    }

    public void exportar(String rutaTxt, List<Cliente> listaClientes, ExportadorTxt exportadorTxt) {
        exportadorTxt.exportar(rutaTxt, listaClientes);
    }
}
