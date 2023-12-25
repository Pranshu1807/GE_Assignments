package packageCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public String name;
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public Employee(String name) {
        this.name = name;
    }

    public void Present(ArrayList<Company> Companies) {
        for (int i = 1; i <= Companies.size(); i++) {
            int randomNumber = (int) (Math.random() * 100);
            if (randomNumber % 2 == 0)
                System.out.println("Employee is Present in company " + Companies.get(i - 1).name + "\n");
            else
                System.out.println("Employee is Absent in company " + Companies.get(i - 1).name + "\n");
        }
    }

    public int dailyWage(Company Comp) {
        int randomNumber = (int) (Math.random() * 100);
        boolean isFullTime = (randomNumber % 3) == 1;
        boolean isPartTime = (randomNumber % 3) == 2;
        int DailyWage = 0;
        if (isFullTime)
            DailyWage += 8 * Comp.hourlyWage;
        if (isPartTime)
            DailyWage += 4 * Comp.hourlyWage;
        return DailyWage;
    }

    public int monthlyWage(Company Comp) {
        int MonthlyWage = 0;
        for (int i = 0; i < Comp.maxDays; i++) {
            MonthlyWage += dailyWage(Comp);
        }
        Comp.totalWageCompany += MonthlyWage;
        return MonthlyWage;
    }

    public int maxHoursAndDays(Company comp) {
        int currDays = 0;
        int currHours = 0;
        int totalWage = 0;
        while (currDays < comp.maxDays && currHours < comp.maxHours) {
            currDays++;
            int randomNumber = (int) (Math.random() * 100);
            if ((randomNumber % 3) == 1) {
                if (currHours + 8 >= comp.maxHours) {
                    totalWage += (comp.maxHours - currHours) * comp.hourlyWage;
                    break;
                }
                totalWage += comp.hourlyWage * 8;
                currHours += 8;
            }
            if ((randomNumber % 3) == 2) {
                if (currHours + 4 >= comp.maxHours) {
                    totalWage += (comp.maxHours - currHours) * comp.hourlyWage;
                    break;
                }
                totalWage += comp.hourlyWage * 4;
                currHours += 4;
            }
        }
        return totalWage;
    }

    public static void createEmployees() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Employees");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the Employee");
            String name = sc.nextLine();
            Employee employee = new Employee(name);
            employees.add(employee);
        }
    }
}
