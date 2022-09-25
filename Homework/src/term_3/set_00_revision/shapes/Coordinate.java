package term_3.set_00_revision.shapes;

public class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double findDistance(Coordinate A, Coordinate B){
        return Math.hypot( B.x - A.x, B.y - A.y );
    }

    public static double findTriangleArea(Coordinate A, Coordinate B, Coordinate C) {
        double area = (A.x * (B.y - C.y)
                + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        return Math.abs(area);
    }

    public static double findRectangleArea(Coordinate A, Coordinate B, Coordinate C) {
        return findDistance(A, B) * findDistance(B,C);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
