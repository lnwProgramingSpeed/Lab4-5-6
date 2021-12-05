package Lab4;

public class StockClass {
    String symbol;
    String name;
    double previousClosingPrice;
    double CurrentPrice;
    double Percent;

    public StockClass(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return CurrentPrice;
    }

    public double getchangePercent() {
        return ((CurrentPrice - previousClosingPrice) / CurrentPrice) * 100;
    }

    public void setPreviousClosingPrice(double pPrice) {
        previousClosingPrice = pPrice;
    }

    public void setCurrentPrice(double cPrice) {
        CurrentPrice = cPrice;
    }

}
