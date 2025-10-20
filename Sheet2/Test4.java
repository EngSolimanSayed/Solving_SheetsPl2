//Q6.2

import java.util.Scanner;

public class Test4 {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        long num=input.nextLong();
        System.out.println("the sum of all its digits: " + sumDigits(num));

    }
}