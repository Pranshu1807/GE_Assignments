import java.util.ArrayList;
import java.util.Scanner;

import packageCompany.*;

class Start {
    static {
        CompanyDetails.main(null);
        Employee.createEmployees();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompanyDetails companyDetails = new CompanyDetails();
        ArrayList<Company> companies = companyDetails.companies;
        ArrayList<Employee> employees = Employee.employees;

        boolean end = false;
        while (true) {
            System.out.println("\nWhat do you want to do");
            System.out.println("Enter 0 to end");
            System.out.println("Enter 1 do get the total wages of all the company");
            System.out.println("Enter 2 to get details of an Employee\n");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0: {
                    end = true;
                    break;
                }
                case 1: {
                    for (int i = 0; i < companies.size(); i++) {
                        Company company = companies.get(i);
                        for (int j = 0; j < employees.size(); j++) {
                            Employee employee = employees.get(j);
                            employee.monthlyWage(company);
                        }
                        System.out.println("Total Wage of Company " + company.name + " is " + company.totalWageCompany);
                        company.totalWageCompany = 0;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the Employee");
                    String employeeName = sc.nextLine();
                    Employee employee = null;
                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).name.equals(employeeName)) {
                            employee = employees.get(i);
                            break;
                        }
                    }
                    if (employee == null) {
                        System.out.println("No employee exist with this name \n");
                        break;
                    }
                    boolean exit = false;
                    while (true) {
                        System.out.println("What do you want to find");
                        System.out.println("Enter 0 to exit");
                        System.out.println("Enter 1 to find attendance");
                        System.out.println("Enter 2 to find daily wage");
                        System.out.println("Enter 3 to find monthly wage");
                        System.out.println("Enter 4 to find monthly wage with hours limitation");
                        int Choice = sc.nextInt();
                        sc.nextLine();
                        switch (Choice) {
                            case 0: {
                                exit = true;
                                break;
                            }

                            case 1: {
                                employee.Present(companies);
                                break;
                            }
                            case 2: {
                                for (int i = 0; i < companies.size(); i++) {
                                    int dailyWage = employee.dailyWage(companies.get(i));
                                    System.out.println("Daily Wage of " + employee.name + " in company "
                                            + companies.get(i).name + " is " + dailyWage);
                                }
                                break;
                            }
                            case 3: {
                                for (int i = 0; i < companies.size(); i++) {
                                    int dailyWage = employee.monthlyWage(companies.get(i));
                                    System.out.println("Monthly Wage of " + employee.name + " in company "
                                            + companies.get(i).name + " is " + dailyWage);
                                }
                                break;
                            }
                            case 4: {
                                for (int i = 0; i < companies.size(); i++) {
                                    int dailyWage = employee.maxHoursAndDays(companies.get(i));
                                    System.out.println("Monthly Wage of " + employee.name + " in company "
                                            + companies.get(i).name + " with hours limitation is " + dailyWage);
                                }
                                break;
                            }

                            default: {
                                System.out.println("Enter a value between 0-4");
                                break;
                            }
                        }
                        if (exit) {
                            break;
                        }
                    }
                }

                default: {
                    System.out.println("Enter a value between 0-2");
                    break;
                }
            }
            if (end)
                break;

        }

    }
}