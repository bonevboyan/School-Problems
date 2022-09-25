package term_3.set_00_revision.shapes;

import java.util.List;

public class Rectangle extends Shape {
    public Rectangle(List<Coordinate> points) {
        super(points);
    }

    @Override
    public double getPerimeter() {
        return Coordinate.findDistance(points.get(0), points.get(1)) +
                Coordinate.findDistance(points.get(1), points.get(2)) +
                Coordinate.findDistance(points.get(2), points.get(3)) +
                Coordinate.findDistance(points.get(3), points.get(0));
    }

    @Override
    public double getArea() {
        return Coordinate.findRectangleArea(points.get(0), points.get(1), points.get(2));
    }

    @Override
    public String toString() {
        return "Rectangle" + super.toString();
    }
}
