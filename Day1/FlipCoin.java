import java.util.*;
import java.lang.Math;

class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a  number");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Please Enter a positive number");
        } else {
            Integer heads = 0, tails = 0;
            for (int i = 0; i < N; i++) {
                double rand = Math.random();
                if (rand < 0.5)
                    tails++;
                else
                    heads++;
            }
            System.out.println("Percentage of heads is:" + ((double) heads / (double) N) * 100);
            System.out.println("Percentage of tails is:" + ((double) tails / (double) N) * 100);
        }
    }
}