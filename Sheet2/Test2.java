//Q5.7
public class Test2 {
    public static void main(String[] args) {
        double current_tuition = 10000;

        for (int i = 0; i < 10; i++) {

            current_tuition *= (1 + 5.0 / 100);
            System.out.printf("Tuition in %d years is:%.2f\n ", i + 1, current_tuition);
        }

        double tuition_four_years = 0.0;
        for (int i = 0; i < 4; i++) {

            tuition_four_years += current_tuition;
            current_tuition *= (1 + 5.0 / 100);
        }
       System.out.printf("The total cost of four years after the tenth year is: %.2f%n", tuition_four_years);

    }
}