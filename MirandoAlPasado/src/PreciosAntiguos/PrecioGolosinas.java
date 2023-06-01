package PreciosAntiguos;

import java.util.Map;
import java.util.TreeMap;

class PreciosGolosinas {
    private Map<String, Integer> golosinas;

    public PreciosGolosinas() {
        // Instanciar un TreeMap para almacenar las golosinas por claves
        golosinas = new TreeMap<>();
    }

    public void agregarGolosinas() {
        // Agregar las golosinas al mapa
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);
    }

    public void mostrarGolosinasMenoresA100() {
    	
        // Filtrar las golosinas que cuestan menos de 100 pesos y mostrarlas en pantalla
        System.out.println("<<<Golosinas con precio menor a 100 pesos:>>>");
        
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
            	
                System.out.println(entry.getKey() + " - " + entry.getValue() + " pesos");
            }
        }
    }
}
