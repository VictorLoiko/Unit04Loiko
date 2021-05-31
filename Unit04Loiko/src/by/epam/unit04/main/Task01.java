package by.epam.unit04.main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //Declaration and initialization
        int[] ar = new int[9];
        Random rand = new Random();
        int countEven =0;

        //Filling array
        for(int i=0; i<ar.length; i++){
            ar[i] = rand.nextInt(1000);
            if (ar[i]%2==0){
                countEven++;
            }
        }
        System.out.println("Массив: " + Arrays.toString(ar));

        if(countEven == 0 ){
            System.out.println("Четных элементов массива нет");
        }
        else {
            //Make new array
            int[] evenAr = new int[countEven];
            for (int i=0,j=0; i<ar.length; i++){
                if(ar[i]%2==0){
                    evenAr[j]=ar[i];
                    j++;
                }
            }
            System.out.println("Массив четных элементов: " + Arrays.toString(evenAr));
        }
    }
}
