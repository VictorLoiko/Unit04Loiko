package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int n=3,m=4,countSeven=0;
        int[][] mas = new int[n][m];
        Random rand = new Random();

        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                mas[i][j] = rand.nextInt(9);
                if(mas[i][j]==7){
                    countSeven++;
                }
            }
        }
        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("Цифра 7 встречается в массиве вот сколько раз: " + countSeven);
    }
}
