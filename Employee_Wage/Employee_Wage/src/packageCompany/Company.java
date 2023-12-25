package packageCompany;

public class Company {
    public int hourlyWage, maxDays, maxHours;
    public String name;
    public int totalWageCompany = 0;

    Company(int hourlyWage, int maxDays, int maxHours, String name) {
        this.hourlyWage = hourlyWage;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
        this.name = name;
    }
}