package term_3.set_00_revision.vehicles;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String filename = "C:\\Users\\PC\\source\\repos\\School-Problems\\Homework\\src\\term_3\\set_00_revision\\vehicles\\data.txt";
        File file = new File(filename);

        ArrayList<Car> vehicles = new ArrayList<>();

        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String[] tokens = input.nextLine().split("\\s+");

                if (tokens[0].equals("1")) {
                    vehicles.add(new Car(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4])));
                } else {
                    vehicles.add(new Truck(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5])));
                }
            }
            input.close();
        } catch (Exception ex) {
            System.out.println("Unhandled exception");
        }

        for (var vehicle :
                vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
