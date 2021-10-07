package pkg.set_7_objects_and_classes;

public class Circle {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
