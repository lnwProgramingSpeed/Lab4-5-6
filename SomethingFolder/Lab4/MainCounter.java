package Lab4;

public class MainCounter {
    public static void main(String[] args) {
        Counter Count1 = new Counter();
        Counter Count2 = new Counter();

        Count1.Click();
        Count1.Click();

        for (int i = 0; i < 10; i++) {
            Count2.Click();
        }
        System.out.println(Count2.getCounter() + " " + Count1.getCounter());
        Count1.Reset();
        Count2.Reset();
        System.out.println(Count2.getCounter() + " " + Count1.getCounter());

    }
}
