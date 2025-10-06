//Q2.6
import java.util.Scanner;

public class Main6 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print(" Enter a number between 0 and 1000: ");
        int num1=input.nextInt();
        int temp1=num1%10;
        int num2=num1/10;
        int temp2=num2%10;
        int num3=num2/10;
        int sum=temp1+temp2+num3;
        System.out.println("The sum of the digits is: "+sum);
        


    }

}
