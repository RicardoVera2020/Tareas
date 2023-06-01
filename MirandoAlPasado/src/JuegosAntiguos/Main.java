package JuegosAntiguos;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        JuegosInfancia juegosInfancia = new JuegosInfancia();

        // Agregar los juegos
        Queue<String> juegos = juegosInfancia.agregarJuegos();

        // Contar la cantidad de juegos
        int cantidadJuegos = juegosInfancia.contarJuegos(juegos);

        // Imprimir la cantidad de juegos en pantalla
        System.out.println("Cantidad de juegos de infancia: " + cantidadJuegos);
    }
}
