package term_1.set_18_exercises;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private String salary;
    private Date dateHired;


    public Employee(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
