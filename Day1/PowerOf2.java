import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(1 << i);
        }
    }
}