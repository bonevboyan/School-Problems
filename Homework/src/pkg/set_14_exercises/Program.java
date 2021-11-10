package pkg.set_14_exercises;

public class Program {
    public static void main(String[] args) {
        Time time1 = new Time(555550000);
        Time time2 = new Time(5, 23, 55);
        Time time3 = new Time();

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
    }
}
