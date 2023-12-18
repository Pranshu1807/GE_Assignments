import java.util.*;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for prime factorization");
        int N = sc.nextInt();
        System.out.println("The prime factors of" + N + "are:");
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                while (N % i == 0) {
                    N /= i;
                }
                System.out.print(i + " ");
            }
        }
        if (N > 1) {
            System.out.print(N);
        }
    }
}
