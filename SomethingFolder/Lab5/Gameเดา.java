package Lab5;

import java.util.Random;
import java.util.Scanner;

public class Gameเดา {
    public static void main(String[] args) {
        Random Doup = new Random();
        int rDoup = Doup.nextInt(99);
        try (Scanner UserNum = new Scanner(System.in)) {
            while (true) {
                System.out.print("Your number is: ");
                int num = UserNum.nextInt();

                if (num == 999) {
                    System.out.println("It's " + rDoup + " You are stupid.");// Give away Ans
                } else if (rDoup > num) {
                    System.out.println("No is Higher ");// Hint for user to answer again
                } else if (rDoup < num) {
                    System.out.println("No is Lower ");// Hint for user to answer again
                } else if (num == rDoup) {
                    System.out.println("Yes it is");// Answer is true
                    return;// for program to do it again until the end of the world
                }
            }
        }

    }
}
