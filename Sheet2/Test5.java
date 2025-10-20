//Q6.3
import java.util.Scanner;

public class Test5 {
    public static int reverse(int number) {
        int reversenumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversenumber = reversenumber * 10 + digit;
            number /= 10;
        }
        return reversenumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println("Reversed number is: " + reverse(num));
        if (isPalindrome(num))
            System.out.println("This is a palindromic integer ");
        else
            System.out.println("This is not a palindromic integer ");

    }
}
