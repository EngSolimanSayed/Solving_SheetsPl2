import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        float subtotal=input1.nextFloat();
        System.out.print("Enter percentage for gratuity: ");
        float percentage=input2.nextFloat();
        float Gratuity=subtotal*( percentage/100);
        float total=subtotal+Gratuity;
        System.out.println("gratuity is $ "+ Gratuity + " and total is $" + total);
        
       



    }
}
