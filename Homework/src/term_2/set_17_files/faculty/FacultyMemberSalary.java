package term_2.set_17_files.faculty;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FacultyMemberSalary {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PC\\source\\repos\\School-Problems\\Homework\\src\\term_2\\set_17_files\\files\\Salary.txt");

        ArrayList<Employee> employees = new ArrayList<>();

        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String[] tokens = input.nextLine().split(" ");

                Employee employee = new Employee(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]));
                employees.add(employee);
            }
            input.close();
        } catch (Exception ex) {
            System.out.println("Unhandled exception");
        }

        double assistantsAvg = employees.stream().filter(x -> x.position.equals("assistant")).mapToDouble(x -> x.salary).average().orElse(0);
        System.out.printf("assistants avg salary: %.2f\n", assistantsAvg);

        double associateAvg = employees.stream().filter(x -> x.position.equals("associate")).mapToDouble(x -> x.salary).average().orElse(0);
        System.out.printf("associate avg salary: %.2f\n", associateAvg);

        double fullAvg = employees.stream().filter(x -> x.position.equals("full")).mapToDouble(x -> x.salary).average().orElse(0);
        System.out.printf("full avg salary: %.2f\n", fullAvg);
    }
}
