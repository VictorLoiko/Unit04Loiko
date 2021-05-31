package by.epam.unit04.main;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        //Declaration
        int[] ar = new int[10];
        Random rand = new Random();

        //Filling array
        for(int i=0; i<ar.length; i++){
            ar[i] = rand.nextInt(1000);
        }
        System.out.println("Массив: " + Arrays.toString(ar));

        //Insertion sorting
        for (int left = 0; left < ar.length; left++) {
            int value = ar[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < ar[i]) {
                    ar[i + 1] = ar[i];
                } else {
                    break;
                }
            }
            ar[i + 1] = value;
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(ar));
    }
}
