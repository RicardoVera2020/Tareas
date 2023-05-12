package ricardovera.cl;

public class Visitas {                            // Clase     
	
public static double promedio(int[] visitas) {
		double sum = 0;                               // Inicio la suma en cero
		
		
		for(int i=0; i<visitas.length; i++) {        //  Ciclo que recorre y me Suma todas las visitas, diarias.
			sum += visitas[i];
	}
		
	
		return jsum / visitas.length;
	}
	
	public static void main(String[] args) {
		
		
		int[] visitas1 = {3001, 1402, 1304,1505};  // ingreso parametros faltantes en el arreglo

		                                         
		for(int i=0; i<args.length; i++) {        // Leo las visitas diarias desde los argumentos del programa
			visitas1[i] = Integer.parseInt(args[i]);
		}
		
		double promedioVisitas = promedio(visitas1); // Calcula el promedio de visitas
		
		System.out.println("El promedio de visitas diarias es: " + promedioVisitas); // imprimo en pantalla 
}
}
