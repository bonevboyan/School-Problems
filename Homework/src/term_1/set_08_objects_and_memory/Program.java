package term_1.set_08_objects_and_memory;

public class Program {
    public static void main(String[] args){
        Student student = new Student("Gosho", 5.6, 0);
        checkForScholarship(student);
        System.out.println(student.getTransferredMoney());

        Rectangle rect1 = new Rectangle(5, 6);
        Rectangle rect2 = new Rectangle(10, 6);
        setColors(rect1, rect2);
        System.out.println(rect1.getColor());
        System.out.println(rect2.getColor());
    }
    public static void checkForScholarship(Student student){
        if(student.getGpa() >= 5.5){
            student.addTransferredMoney(100);
        }
    }
    public static void setColors(Rectangle rect1, Rectangle rect2){
        if(rect1.getPerimeter() > rect2.getPerimeter()){
            rect1.setColor("yellow");
            rect2.setColor("green");
        }else if(rect1.getPerimeter() < rect2.getPerimeter()){
            rect1.setColor("green");
            rect2.setColor("yellow");
        }
    }
}
