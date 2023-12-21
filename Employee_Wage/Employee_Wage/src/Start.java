import java.lang.Math;

public class Start {

    public static void main(String[] args) {

        int hourlyWage = 20;
        int noOfDays = 20;
        int FullTimeHours = 8;
        int PartTimeHours = 5;
        int MonthlyWage = 0;
        for (int i = 1; i <= noOfDays; i++) {
            int RandomNumber = (int) (Math.random() * 100);
            boolean isFullTime = (RandomNumber % 3 == 1);
            boolean isPartTime = (RandomNumber % 3 == 2);
            if (isFullTime) {
                MonthlyWage += hourlyWage * FullTimeHours;
            }
            if (isPartTime) {
                MonthlyWage += hourlyWage * PartTimeHours;
            }
        }

        System.out.println(" The Monthly Wage of the employee is " + MonthlyWage);
    }
}
