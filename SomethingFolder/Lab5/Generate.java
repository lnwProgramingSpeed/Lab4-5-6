package Lab5;

import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        Random Random1 = new Random();
        int rand = 20 + Random1.nextInt(21);
        System.out.println("Sin of " + rand + " is " + Math.sin(rand));
        System.out.println("Cos of " + rand + " is " + Math.cos(rand));
        System.out.println("Tan of " + rand + " is " + Math.tan(rand));

    }
}