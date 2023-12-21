import java.lang.Math;

public class Start {
    public static void main(String[] args) {
        double rand = Math.random() * 100;
        int randomNumber = (int) rand;
        int fullTimeHour = 8;
        int hourlyWage = 20;
        int partTimeHour = 5;
        boolean isFullTime = (randomNumber % 3 == 1);
        boolean isPartTime = (randomNumber % 3 == 2);
        int dailyWage = 0;
        if (isFullTime) {
            dailyWage = fullTimeHour * hourlyWage;
        }
        if (isPartTime) {
            dailyWage = partTimeHour * hourlyWage;
        }
        System.out.println("Daily Wage of the customer is " + dailyWage);
    }
}
