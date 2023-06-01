package MarcasAntiguas;

import java.util.ArrayList;
import java.util.List;

public class MarcasAntiguas  {
    public static void main(String[] args) {
    	
        // Paso 1: Instanciar un ArrayList de tipo String llamado "marcas"
        List<String> marcas = new ArrayList<>();
        
        

        // Paso 2: .Add  de 10 marcas  como listado
        
        marcas.add("parmalat");
        marcas.add("mitimi");
        marcas.add("coka");
        marcas.add("monokids");
        marcas.add("cuatro");
        marcas.add("dorada");
        marcas.add("viceroy");
        marcas.add("morenita");
        marcas.add("evercrips");
        marcas.add("tazos");

        // Imprimir  marcas 
        System.out.println("....Listado de marcas.....:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 3: Agregar  3 marcas adicionales 
        marcas.add("Blockbuster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println("\n-------Nuevo listado de marcas:-------");
        for (String marca : marcas) {
            System.out.println(marca);
        }

     // Paso 4: Corregir el nombre "Blokbaster" a "Blockbuster"
        int index = marcas.indexOf("Blokbaster");
        if (index != -1) {
            marcas.set(index, "Blockbuster");
        } else {
            System.out.println("'Blokbaster' no existe en el listado de marcas.");
        }

        

        // Paso 5: Remover "Carrefour" del listado
        boolean removed = marcas.remove("Carrefour");
        if (removed) {
            System.out.println("\n 'Carrefour' removido correctamente");
        }

        System.out.println("\nListado de marcas después de eliminar 'Carrefour':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 6: Crear una colección de marcas posibles y agregarlas a "marcas"
        List<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Marca1");
        posiblesMarcas.add("Marca2");
        posiblesMarcas.add("Marca3");

        marcas.addAll(posiblesMarcas);

        System.out.println("\nListado de marcas completo:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 7: Contar la cantidad de elementos en el listado de marcas
        int cantidadElementos = marcas.size();
        System.out.println("\nCantidad de elementos en el listado de marcas: " + cantidadElementos);
    }
}



/* 1. Instanciar un ArrayList<>() del tipo String llamado “marcas” para generar un
listado de marcas.

2. Agregar 10 marcas que usted haya conocido e imprimirlas en consola mediante
System.out.println.

3. Su amiga le dice que recordó 3 marcas y le pregunta si puede agregarlas al listado.
Los elementos a agregar son “Blokbaster”, “Carrefour” y “Jetix”. Imprimir el nuevo
listado en consola.

4. Se dan cuenta que “Blokbaster” en realidad se escribe “Blockbuster” y deciden
cambiar la palabra en el listado.

5. Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo
del listado. Para ello, usted debe remover el elemento número 11 e imprimir el nuevo
listado en pantalla. Puede usar la función .remove("Carrefour") para ver si el
elemento se borró correctamente, ya que arrojará true si se eliminó de manera
correcta.

6. Usted se inspira y decide hacer una colección aparte de marcas que podrían estar
fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una
nueva ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de
”marcas”.

7. A eso de las 11 de la noche, deciden ver cuántos elementos tiene este listado. Es por
eso que usted utiliza sus conocimientos y cuenta la cantidad de elementos que
contiene la lista para imprimir en pantalla.*/
