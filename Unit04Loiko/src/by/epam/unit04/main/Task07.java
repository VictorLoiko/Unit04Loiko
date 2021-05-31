package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int n=4;
        int[][] mas = new int[n][n];
        Random rand = new Random();

        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Наша матрица:");
        for(int i=0; i<mas.length; i++) {
            for(int j=0; j<mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }

        System.out.println("Числа стоящие на диагонали квадратной матрицы:");
        for(int i=0;i<n;i++){
            System.out.print(mas[i][i]+"\t");
        }
    }
}
