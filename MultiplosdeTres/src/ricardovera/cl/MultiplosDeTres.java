package ricardovera.cl;

import java.util.Scanner;

    public class MultiplosDeTres {
    private static int[] numeros;

	public static void main(String[] args) {
    	numeros = new int[] {10, 20, 30, 33 ,21 ,8 ,2 ,61};
        int[] numeros1 = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros1[i] = Integer.parseInt(args[i]);
        }
        int sumaMultiplos = suma(numeros);
        System.out.println("La suma de los múltiplos de tres es: " + sumaMultiplos);
    }

    public static int suma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 3 == 0) {
                suma += num;
            }
        }
        return suma;
    }
}