package Lab4;

public class MainStock {
    public static void main(String[] args) {
        StockClass ORCL = new StockClass("ORCL", "OracleCorporation");
        
        ORCL.setPreviousClosingPrice(34.5);
        ORCL.setCurrentPrice(34.35);

        System.out.println("Chicken Stock:" + ORCL.getchangePercent());

    }
}
