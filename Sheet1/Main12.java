//Q4.5
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        final int angle = 180;
        double angl = Math.toRadians(angle);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.println();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = ((n * (Math.pow(side, 2))) / (4 * (Math.tan(angl / n))));
        System.out.print("The area of the polygon is " + area);
    }
}
