import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(1 << i);
        }
    }
}