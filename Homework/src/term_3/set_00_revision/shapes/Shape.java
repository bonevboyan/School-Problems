package term_3.set_00_revision.shapes;

import java.util.List;

public abstract class Shape {
    List<Coordinate> points;

    public Shape(List<Coordinate> points) {
        this.points = points;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "{" +
                "points=" + points +
                '}';
    }
}
