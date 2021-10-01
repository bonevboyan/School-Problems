package pkg.classes;

public class Program {
    public static void main(String[] args){
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println(circle1.getPerimeter());

        Circle circle3 = new Circle(15);
        circle3.setRadius(20);
        System.out.println(circle3.getArea());

    }
}
