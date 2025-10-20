//Q5.9

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Note the number of students is at least 2 ");

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String First_Name = "";
        String second_Name = "";
        int First_Score = 0;
        int second_Score = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the name of student number %d: ",i+1);
            String nam = input.next();

            System.out.printf("Enter the grade of student number %d: ",i+1);
            int grade = input.nextInt();

            if (grade > First_Score) {
                second_Score = First_Score;
                second_Name = First_Name;

                First_Score = grade;
                First_Name = nam;
            } else if (grade > second_Score) {
                second_Score =grade;
                second_Name = nam;
            }

        }
        System.out.println("The HighestGrade is:"+First_Score+"   For Student name is: "+First_Name);
        System.out.println("The SecondGrade is:"+second_Score+"    For Student name is: "+second_Name);

    }
}