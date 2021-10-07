package pkg.set_7_classes;

public class Program {
    public static void main(String[] args){
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println(circle1.getPerimeter());

        Circle circle3 = new Circle(15);
        circle3.setRadius(20);
        System.out.println(circle3.getArea());

        TV tv = new TV();
        tv.turnOn();
        tv.channelDown();
        tv.channelUp();
        tv.volumeDown();;
        tv.volumeUp();
        tv.setChannel(140);
        tv.setChannel(100);
        tv.setVolume(9);
        tv.setVolume(6);


        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println(stock.getChangePercent());
    }
}
