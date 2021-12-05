package Lab5;

import java.util.Date;

public class ElapsedTime {
    public static void main(String[] args) {
        Date date = new Date();

        int Count = 1;
        long time = System.currentTimeMillis();

        while (Count <= 2000) {
            date.setTime(time);
            System.out.println(date.toString());
            Count++;
            time*=10;
        }
    }

}
