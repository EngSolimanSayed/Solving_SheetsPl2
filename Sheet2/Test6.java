//Q6.5

import java.util.Scanner;

public class Test6 {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("The numbers in increasing order are: " + num1 + " " + num2 + " " + num3);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter three numbers: ");
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        displaySortedNumbers(x,y,z);

    }
}