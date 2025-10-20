//Q7.9

import java.util.Scanner;

public class Test9 {
    public static double min(double[] array) {
        double smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];

            }

        }
        return smallest;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }
        System.out.print("The minimum number is: "+min(numbers));

    }
}