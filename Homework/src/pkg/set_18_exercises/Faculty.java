package pkg.set_18_exercises;

import java.util.Date;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
