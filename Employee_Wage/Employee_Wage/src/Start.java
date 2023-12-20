class Employee {
    int partTimeHours = 4, fullTimeHours = 8, hourlyWage = 20, noOfDays = 20, maxDays = 20, maxHours = 100;
}

class Start {
    public static int Present() {
        int randomNumber = (int) (Math.random() * 100);
        return randomNumber % 3;
    }

    public static int dailyWage(Employee E1) {
        int check = Present();
        boolean isFullTime = check == 1;
        boolean isPartTime = check == 2;
        int DailyWage = 0;
        if (isFullTime)
            DailyWage += E1.fullTimeHours * E1.hourlyWage;
        if (isPartTime)
            DailyWage += E1.partTimeHours * E1.hourlyWage;
        return DailyWage;
    }

    public static int monthlyWage(Employee E1) {
        int MonthlyWage = 0;
        for (int i = 0; i < E1.noOfDays; i++) {
            MonthlyWage += dailyWage(E1);
        }
        return MonthlyWage;
    }

    public static int maxHoursAndDays(Employee E1) {
        int currDays = 0;
        int currHours = 0;
        int totalWage = 0;
        while (currDays < E1.maxDays && currHours < E1.maxHours) {
            currDays++;
            int check = Present();
            if (check == 1) {
                if (currHours + E1.fullTimeHours >= E1.maxHours) {
                    totalWage += (E1.maxHours - currHours) * E1.hourlyWage;
                    break;
                }
                totalWage += E1.hourlyWage * E1.fullTimeHours;
                currHours += E1.fullTimeHours;
            }
            if (check == 2) {
                if (currHours + E1.partTimeHours >= E1.maxHours) {
                    totalWage += (E1.maxHours - currHours) * E1.hourlyWage;
                    break;
                }
                totalWage += E1.hourlyWage * E1.partTimeHours;
                currHours += E1.partTimeHours;
            }
        }
        return totalWage;
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        if (Present() == 0)
            System.out.println("The Employee is absent");
        else
            System.out.println("The employee is present");
        System.out.println("Today's Wage for the Employee is " + dailyWage(E1));
        System.out.println("Monthly Wage of the Employee is " + monthlyWage(E1));
        System.out.println("The Wage of the Employee with hours and days limitation is " + maxHoursAndDays(E1));

    }
}
