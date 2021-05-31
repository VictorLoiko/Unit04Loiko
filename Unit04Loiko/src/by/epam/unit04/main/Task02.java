package by.epam.unit04.main;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        //Declaration
        int[] ar = new int[9];
        Random rand = new Random();
        int minElement = 0,maxElement =0;

        //Filling array and determine min and max
        for(int i=0; i<ar.length; i++){
            ar[i] = rand.nextInt(1000);
            if(i==0){
                minElement = ar[i];
                maxElement = ar[i];
            }
            else {
                if (minElement>ar[i]){
                    minElement = ar[i];
                }
                if(maxElement<ar[i]){
                    maxElement = ar[i];
                }
            }
        }
        System.out.println("Массив: " + Arrays.toString(ar));
        System.out.println("Наименьший элемент: "+ minElement);
        System.out.println("Наибольший элемент: "+ maxElement);
        System.out.println("Наименьшая длина числовой оси, содержащая все числа массива равна " + (maxElement-minElement));

    }
}
