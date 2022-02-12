package term_1.set_18_exercises;

public class Student extends Person {
    private ClassStatus classStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, ClassStatus classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classStatus=" + classStatus +
                '}';
    }
}
