package Lab4;

public class Counter{
    private int Count;

    public Counter(){
        Count = 0;
    }

    public int getCounter() {
        return Count;
    }

    public void Click() {
        Count++ ;
    }

    public void Reset() {
        Count = 0;
    }
}