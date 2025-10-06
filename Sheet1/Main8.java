import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter today day: ");
        int input1 = input.nextInt();
        String day;

        if (input1 == 0)
            day = "Sunday";
        else if (input1 == 1)
            day = "Monday";
        else if (input1 == 2)
            day = "Tuesday";
        else if (input1 == 3)
            day = "Wednesday";
        else if (input1 == 4)
            day = "Thursday";
        else if (input1 == 5)
            day = "Friday";
        else
            day = "Saturday";
        System.out.print("Enter the number of days elapsed since today: ");
        int input2 = input.nextInt();
        int futureDay = (input1 + input2) % 7;
        String future;
        if (futureDay == 0)
            future = "Sunday";
        else if (futureDay == 1)
            future = "Monday";
        else if (futureDay == 2)
            future = "Tuesday";
        else if (futureDay == 3)
            future = "Wednesday";
        else if (futureDay == 4)
            future = "Thursday";
        else if (futureDay == 5)
            future = "Friday";
        else
            future = "Saturday";
        System.out.println("Today is : " + day + " the future day is: " + future);

    }

}
