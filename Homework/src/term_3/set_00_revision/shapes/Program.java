package term_3.set_00_revision.shapes;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        var triangleCoords = new ArrayList<Coordinate>();
        triangleCoords.add(new Coordinate(0, 0));
        triangleCoords.add(new Coordinate(2, 0));
        triangleCoords.add(new Coordinate(2, 2));
        shapes[0] = new Triangle(triangleCoords);

        var rectangleCoords = new ArrayList<Coordinate>();
        rectangleCoords.add(new Coordinate(0, 0));
        rectangleCoords.add(new Coordinate(2, 0));
        rectangleCoords.add(new Coordinate(2, 2));
        rectangleCoords.add(new Coordinate(2, 0));
        shapes[1] = new Rectangle(rectangleCoords);

        for (var shape :
                shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

        System.out.println(shapes[0].compareTo(shapes[1]));
    }
}
