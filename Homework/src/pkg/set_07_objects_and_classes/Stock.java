package pkg.set_07_objects_and_classes;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;

        return change / previousClosingPrice * 100;
    }

}
