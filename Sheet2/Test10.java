//Q8.2

import java.util.Scanner;

public class Test10 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of matrix : ");
        int size = input.nextInt();

        double[][] arr = new double[size][size];
        System.out.printf("Enter a %d-by-%d matrix row by row:",size,size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        double result = sumMajorDiagonal(arr);
        System.out.println("Sum of the elements in the major diagonal: " + result);

    }
}