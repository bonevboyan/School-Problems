package pkg.set_14_exercises;

import java.math.BigDecimal;

public class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt((this.y - point.y) * (this.y - point.y) + (this.x - point.x) * (this.x - point.x));
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x));
    }

    public static double distance(MyPoint point, MyPoint otherPoint) {
        return Math.sqrt((otherPoint.y - point.y) * (otherPoint.y - point.y) + (otherPoint.x - point.x) * (otherPoint.x - point.x));
    }
}
