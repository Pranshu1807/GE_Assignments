package packageCompany;

import java.util.*;

public class CompanyDetails {
    public static ArrayList<Company> companies = new ArrayList<Company>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of companies");
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the name of the company " + i);
            String name = sc.nextLine();
            System.out.println("Enter the hourly wage for company " + i);
            int hourlyWage = sc.nextInt();
            System.out.println("Enter the max days for company " + i);
            int maxDays = sc.nextInt();
            System.out.println("Enter the max hours for company " + i);
            int maxHours = sc.nextInt();
            sc.nextLine();
            Company newCompany = new Company(hourlyWage, maxDays, maxHours, name);
            companies.add(newCompany);
        }
    }
}