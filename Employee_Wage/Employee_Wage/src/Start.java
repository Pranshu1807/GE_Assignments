import java.lang.Math;

public class Start {
    public static void main(String[] args) {
        double rand = Math.random() * 100;
        int randomNumber = (int) rand;
        int fullTimeHour = 8;
        int hourlyWage = 20;
        int partTimeHour = 5;
        int dailyWage;
        switch (randomNumber % 3) {
            case 1: {
                dailyWage = fullTimeHour * hourlyWage;
                break;
            }
            case 2: {
                dailyWage = partTimeHour * hourlyWage;
                break;
            }
            default:
                dailyWage = 0;
                break;
        }
        System.out.println(" Daily Wage of the customer is " + dailyWage);
    }

}
