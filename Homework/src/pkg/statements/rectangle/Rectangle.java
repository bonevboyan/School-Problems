package pkg.statements.rectangle;

public class Rectangle {
    public Coordinate coordinate;
    public double width, height;
    public Rectangle (double a,double b,double c,double d)
    {
        coordinate = new Coordinate(a, b);
        height = c - a;
        width = b - d;
    }
}
