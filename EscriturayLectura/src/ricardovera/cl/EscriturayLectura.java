package ricardovera.cl;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EscriturayLectura {

    public static void main(String[] args) {
    	crearArchivo("texto.txt");
    	
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");
        
        crearDirectorio("directorio");     //metodos
        crearFile(lista);
        lectura();
        
    };

    private static void crearArchivo(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void crearDirectorio(String string) {
        File directorio = new File(string);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya esta creado");
        }
    }

    public static void crearFile(ArrayList<String> lista) {
        File archivo = new File("directorio/texto.txt");  

        try {
            archivo.createNewFile();
            FileWriter fileW = new FileWriter(archivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);

            Iterator<String> iterator = lista.iterator();   // itero rrecorriendo la lista
            while (iterator.hasNext()) {
                bufferedWriter.write(iterator.next());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Archivo creado con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lectura() { 
        try {
            File archivo = new File("directorio/texto.txt");
            if (archivo.exists()) {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String data = br.readLine();
                while (data != null) {
                    System.out.println(data);  	 
                    data = br.readLine();
                }
                br.close(); 
            } else {
                System.out.println("El fichero ingresado no existe");
            }

        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero : " + e);
        }
    }
}



