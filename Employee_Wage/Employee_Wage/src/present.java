import java.lang.Math;

public class present {
    public static void main(String[] args) {
        double rand = Math.random();
        int randomNumber = (int) (rand * 100);
        boolean present;
        present = randomNumber % 2 == 0 ? true : false;
        System.out.println(present);
    }
}
