//Q7.7

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int[] counts = new int[10];


        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 10);
            counts[randomNum]++;
        }
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + i + " occurs " + counts[i] + " times");
        }

    }
}