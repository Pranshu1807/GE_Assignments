import java.util.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Harmonic Value");
        int N = sc.nextInt();
        double Value = 0;
        for (int i = 1; i <= N; i++) {
            Value += (double) 1 / (double) i;
        }
        System.out.println("The Nth Harmonic Number is : " + Value);
    }
}