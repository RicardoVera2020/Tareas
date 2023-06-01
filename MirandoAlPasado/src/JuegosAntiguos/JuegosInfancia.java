package JuegosAntiguos;

import java.util.LinkedList;
import java.util.Queue;

public class JuegosInfancia {
    public Queue<String> agregarJuegos() {
        Queue<String> juegos = new LinkedList<>();

        // Agregar  juegos 
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        return juegos;
    }

    public int contarJuegos(Queue<String> juegos) {
    	
        // Obtener la cantidad de juegos
        return juegos.size();
    }
}
