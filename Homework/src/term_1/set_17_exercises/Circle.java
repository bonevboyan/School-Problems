package term_1.set_17_exercises;

public class Circle extends GeometricObject {
    public double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void printCircle(){
        System.out.printf("Radius: %f\nColor: %s\nFilled: %b\n", this.radius, this.getColor(), this.isFilled());
    }
}
