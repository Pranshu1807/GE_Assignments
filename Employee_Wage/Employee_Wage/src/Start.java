import java.util.ArrayList;
import java.util.Scanner;

import packageCompany.*;

class Start {
    static int partTimeHours = 4, fullTimeHours = 8;

    public static void Present(ArrayList<Company> Companies) {
        for (int i = 1; i <= Companies.size(); i++) {
            int randomNumber = (int) (Math.random() * 100);
            if (randomNumber % 2 == 0)
                System.out.println("Employee is Present in company " + i);
            else
                System.out.println("Employee is Absent in company " + i);
        }
    }

    public static int dailyWage(Company Comp) {
        int randomNumber = (int) (Math.random() * 100);
        boolean isFullTime = (randomNumber % 3) == 1;
        boolean isPartTime = (randomNumber % 3) == 2;
        int DailyWage = 0;
        if (isFullTime)
            DailyWage += fullTimeHours * Comp.hourlyWage;
        if (isPartTime)
            DailyWage += partTimeHours * Comp.hourlyWage;
        return DailyWage;
    }

    public static int monthlyWage(Company Comp) {
        int MonthlyWage = 0;
        for (int i = 0; i < Comp.maxDays; i++) {
            MonthlyWage += dailyWage(Comp);
        }
        return MonthlyWage;
    }

    public static int maxHoursAndDays(Company comp) {
        int currDays = 0;
        int currHours = 0;
        int totalWage = 0;
        while (currDays < comp.maxDays && currHours < comp.maxHours) {
            currDays++;
            int randomNumber = (int) (Math.random() * 100);
            if ((randomNumber % 3) == 1) {
                if (currHours + fullTimeHours >= comp.maxHours) {
                    totalWage += (comp.maxHours - currHours) * comp.hourlyWage;
                    break;
                }
                totalWage += comp.hourlyWage * fullTimeHours;
                currHours += fullTimeHours;
            }
            if ((randomNumber % 3) == 2) {
                if (currHours + partTimeHours >= comp.maxHours) {
                    totalWage += (comp.maxHours - currHours) * comp.hourlyWage;
                    break;
                }
                totalWage += comp.hourlyWage * partTimeHours;
                currHours += partTimeHours;
            }
        }
        return totalWage;
    }

    static {
        CompanyDetails.main(null);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompanyDetails Employee1CompanyDetails = new CompanyDetails();
        ArrayList<Company> Employee1Companies = Employee1CompanyDetails.companies;

        System.out.println("Enter the value corresponding to the details you want");
        System.out.println("Enter 1 for checking attendance");
        System.out.println("Enter 2 for calculating daily Wage");
        System.out.println("Enter 3 for calculating monthly Wage");
        System.out.println("Enter 4 for calculating monthly Wage with max hours limitation");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                Present(Employee1Companies);
                break;
            }
            case 2: {
                for (int i = 0; i < Employee1Companies.size(); i++) {
                    int DailyWage = dailyWage(Employee1Companies.get(i));
                    System.out.println("Daily Wage of the Employee in company " + (i + 1) + " is " + DailyWage);
                }
                break;
            }
            case 3: {
                for (int i = 0; i < Employee1Companies.size(); i++) {
                    int MonthlyWage = monthlyWage(Employee1Companies.get(i));
                    System.out.println("Monthly Wage of the Employee in company " + (i + 1) + " is " + MonthlyWage);
                }
                break;
            }
            case 4: {
                for (int i = 0; i < Employee1Companies.size(); i++) {
                    int MonthlyWageWithLimitation = maxHoursAndDays(Employee1Companies.get(i));
                    System.out.println("Monthly Wage of the Employee in company " + (i + 1) + " with hours limit is "
                            + MonthlyWageWithLimitation);
                }
                break;
            }
            default: {
                System.out.println("Enter a value between 1-4");
                break;
            }
        }

    }
}