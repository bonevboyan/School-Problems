package pkg.set_18_exercises;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
