package ricardovera.cl;

import java.util.Arrays;

public class SmartWatch {

    public static Integer[] clearSteps(int[] steps) {
        Integer[] filteredSteps = new Integer[steps.length];
        int index = 0;
        
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] >= 200 && steps[i] <= 100000) {
                filteredSteps[index] = steps[i];
                index++;
            }
        }
        
        return Arrays.copyOfRange(filteredSteps, 0, index);
    }

    public static void main(String[] args) {
        int[] steps = { 300, 405, 403, 506, 100020040, 45006, -1044 }; // incluyo pasos 
        
        Integer[] filteredSteps = clearSteps(steps);

        double sum = 0;
        for (int i = 0; i < filteredSteps.length; i++) {
            sum += filteredSteps[i];
        }
        
        double promedio = sum / filteredSteps.length;
        
        System.out.println("El promedio de pasos diarios es: " + promedio);
    }
}
