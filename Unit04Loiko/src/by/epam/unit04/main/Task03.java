package by.epam.unit04.main;

import java.util.Arrays;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        //Declaration and initialization
        int N=10;
        double[] ar = new double[N];
        Random rand = new Random();
        int negativeCount=0,positiveCount=0,zeroCount=0;
        int a=-10,b=20;

        //Filling array and
        for(int i=0; i<ar.length; i++){
            ar[i] = a+(b-a)*rand.nextDouble();
            if (ar[i]<0){
                negativeCount++;
            } else if(ar[i]>0){
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Массив: " + Arrays.toString(ar));
        System.out.println("Положительных элементов "+positiveCount);
        System.out.println("отрицательных элементов "+negativeCount);
        System.out.println("Нулевых элементов "+zeroCount);
    }
}
