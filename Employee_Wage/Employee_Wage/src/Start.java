import java.lang.Math;

public class Start {
    public static void main(String[] args) {
        double rand = Math.random();
        int randomNumber = (int) (rand * 100);
        boolean present;
        present = randomNumber % 2 == 0 ? true : false;
        if (present)
            System.out.println("The employee is present");
        else
            System.out.println("The employee is absent");

    }
}
