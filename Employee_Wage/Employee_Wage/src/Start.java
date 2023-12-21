import java.lang.Math;

public class Start {
    public static void main(String[] args) {
        int WagePerHour = 20;
        int noOfHour = 8;
        double rand = Math.random();
        int randomNumber = (int) (rand * 100);
        boolean present;
        present = randomNumber % 2 == 0 ? true : false;
        int TotalDailyWage = present == true ? WagePerHour * noOfHour : 0;
        System.out.println("Daily Wage of the Employee is " + TotalDailyWage);
    }
}
