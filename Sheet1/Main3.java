public class Main3 {
    public static void main(String[] args) {
        
        double currentPopulation = 312032486;

        double secondsPerYear = 365 * 24 * 60 * 60;

        double birthsPerYear = secondsPerYear / 7;
        double deathsPerYear = secondsPerYear / 13;
        double immigrantsPerYear = secondsPerYear / 45;

        
        for (int year = 1; year <= 5; year++) {
            currentPopulation = currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println("Year " + year + " population: " + (long) currentPopulation);
        }
    }
}
