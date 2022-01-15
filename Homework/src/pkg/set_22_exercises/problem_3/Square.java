package pkg.set_22_exercises.problem_3;

public class Square extends GeometricObject{
    private double side;

    public Square() {
        this.side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Оцветете и четирите страни");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
