package ListadoInvitados;

public class ListadoInvitados {
    public static void main(String[] args) {
        // Crear una instancia de la clase Invitados
        Invitados invitados = new Invitados();

        // Llamar al método agregarCompaneros() de la clase Invitados
        invitados.agregarCompaneros();

        System.out.println("Listado de invitados:");
        invitados.imprimirInvitados();

        // Llamar al método agregarPosiblesInvitados() de la clase Invitados
        invitados.agregarPosiblesInvitados();

        System.out.println("\nListado de invitados actualizado:");
        invitados.imprimirInvitados();

        // Llamar al método eliminarInvitado() de la clase Invitados
        invitados.eliminarInvitado("Jorge");

        System.out.println("\nListado final de invitados:");
        invitados.imprimirInvitados();
    }
}
