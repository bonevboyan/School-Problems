package pkg.statements;

public class Rectangle {
    Coordinate coordinate;
    double width, height;
    Rectangle (double a,double b,double c,double d)
    {
        coordinate = new Coordinate(a, b);
        height = c - a;
        width = b - d;
    }
}
