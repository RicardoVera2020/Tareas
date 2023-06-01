package ListadoInvitados;

import java.util.Set;
import java.util.TreeSet;

class Invitados {
    private Set<String> invitados;

    public Invitados() {
        // Instanciar un TreeSet para almacenar los invitados ordenadamente
        invitados = new TreeSet<>();
    }

    public void agregarCompaneros() {
        // Agregar los nombres de los compañeros al conjunto invitados
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");
    }

    public void agregarPosiblesInvitados() {
        // Agregar los posibles invitados al conjunto invitados
        invitados.add("Jorge");
        invitados.add("Francisco");
        invitados.add("Marcos");
    }

    public void eliminarInvitado(String nombre) {
        // Elimina un invitado del conjunto invitados
        invitados.remove(nombre);
    }

    public void imprimirInvitados() {
        // Imprime  invitados en consola
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}

