package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        Random rand = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(1000);
        }
        System.out.print("Исходный массив:\t\t ");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%4d ", ar[i]);
        }
        System.out.println();


        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] < ar[i + 1]) {
                    temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.print("Отсортированный массив:\t\t ");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%4d ", ar[i]);
        }
        System.out.println();
    }
}
