package term_3.set_00_revision.shapes;

import java.util.List;

public class Triangle extends Shape{
    public Triangle(List<Coordinate> points) {
        super(points);
    }

    @Override
    public double getPerimeter() {
        return Coordinate.findDistance(points.get(0), points.get(1)) +
                Coordinate.findDistance(points.get(2), points.get(1)) +
                Coordinate.findDistance(points.get(0), points.get(2));
    }

    @Override
    public double getArea() {
        return Coordinate.findTriangleArea(points.get(0), points.get(1), points.get(2));
    }

    @Override
    public String toString() {
        return "Triangle" + super.toString();
    }
}
