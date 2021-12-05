package Lab5;
import java.util.Random;
public class TEST {
    public static void main(String[] args) {
        Random random1 = new Random(1000);
        System.out.print("From Random 1: ");
        for (int i = 1; i < 50; i++)
            System.out.print(random1.nextInt(100) + " ");

    }
}
