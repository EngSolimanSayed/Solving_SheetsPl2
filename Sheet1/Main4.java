import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = input.nextFloat();

        System.out.print("Enter length: ");
        float l = input.nextFloat(); 
        final float pi = 3.14f;

        float area = r * r * pi;
        float volume = area * l;

        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);

        input.close(); 
    }
}
