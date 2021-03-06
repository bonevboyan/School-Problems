package term_1.set_17_exercises;

public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return (p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public String printTriangle() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
