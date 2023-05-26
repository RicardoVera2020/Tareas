package Tienda;

public class Utilidad {
	
	
	
    public static void limpiarPantalla() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
    }
}
