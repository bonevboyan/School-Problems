package term_3.set_00_revision.shapes;

import java.util.List;

public abstract class Shape implements Comparable<Shape> {
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

    @Override
    public int compareTo(Shape o) {
        double diff = this.getArea() - o.getArea();
        if(diff > 0) return 1;
        else if (diff < 0) return -1;
        return 0;
    }
}
