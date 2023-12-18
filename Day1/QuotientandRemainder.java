import java.util.*;

public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int Dividend = sc.nextInt();
        System.out.println("Enter the Divisor");
        int Divisor = sc.nextInt();
        System.out.println("The Quoteint is " + Dividend / Divisor);
        System.out.println("The Remainder is " + Dividend % Divisor);
    }
}