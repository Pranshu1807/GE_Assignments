import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((Integer.toString(year).length()) != 4) {
            System.out.println("Please enter a 4 digit number");
        } else {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is not a Leap Year");
        }
    }
}
