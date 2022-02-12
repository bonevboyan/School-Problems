package term_1.set_08_objects_and_memory;

public class Rectangle {
    private double width = 1;
    private double height = 1;
    private String color;

    public  Rectangle(){

    }

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }
}
