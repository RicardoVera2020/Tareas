package ricardovera.cl;

    public class Promedios {
    public static void main(String[] args) {
    	int[] numeros1  = new int[] {10, 20, 30, 33, 21, 8, 2, 61}; // ingreso datos a la variable
       // int[] numeros1 = new int[args.length];
        for (int i1 = 0; i1 < args.length; i1++) {
            numeros1[i1] = Integer.parseInt(args[i1]);
        }
        
        System.out.println(suma(numeros1));
        System.out.println(promedio(numeros1));
    }
    
    public static int suma(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                sum += numeros[i];
            }
        }
        return sum;
    }
    
    public static double promedio(int[] numeros) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                count++;
                sum += numeros[i];
            }
        }
        return (double) sum / count;
    }
}
