import java.lang.Math;

public class MaxHours {
    public static void main(String[] args) {
        int MaxHour = 100;
        int MaxDays = 20;
        int hourlyWage = 20;
        int fullTimeHours = 8;
        int PartTimeHours = 5;
        int totalWage = 0;
        int currHours = 0, currDays = 0;

        while (currHours < MaxHour && currDays < MaxDays) {
            currDays++;
            int RandomNumber = (int) (Math.random() * 100);
            if (RandomNumber % 3 == 1) {
                if (currHours + fullTimeHours >= MaxHour) {
                    totalWage += (MaxHour - currHours) * hourlyWage;
                    currHours = MaxHour;
                    break;
                }
                totalWage += fullTimeHours * hourlyWage;
                currHours += fullTimeHours;
            }
            if (RandomNumber % 3 == 2) {
                if (currHours + PartTimeHours >= MaxHour) {
                    totalWage += (MaxHour - currHours) * hourlyWage;
                    currHours = MaxHour;
                    break;
                }
                totalWage += PartTimeHours * hourlyWage;
                currHours += PartTimeHours;
            }
        }
        System.out.println("Total Working Days of the employee" + currDays);
        System.out.println("Total Working Hours of the employee " + currHours);
        System.out.println("The total Wage of the employee is " + totalWage);
    }
}
