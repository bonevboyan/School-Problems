package pkg.set_9_access_modifiers;

public class Program {
    public static void main(String[] args){
        RegularPolygon[] polygons = {new RegularPolygon(), new RegularPolygon(6, 4), new RegularPolygon(10, 4, 5.6, 7.8)};

        for (RegularPolygon polygon : polygons)
        {
            System.out.printf("Perimeter: %.2f, Area: %.2f\n", polygon.getPerimeter(), polygon.getArea());
        }
    }
}
