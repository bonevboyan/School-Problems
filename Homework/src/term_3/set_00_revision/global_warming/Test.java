package term_3.set_00_revision.global_warming;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> list = new ArrayList<>();
        Car car = new Car(FuelType.Diesel, 34);
        Bicycle bicycle = new Bicycle("Ivan Ivanov", "Kolelo");
        Building building = new Building(4, 4, 4, 4);
        list.add(car);
        list.add(bicycle);
        list.add(building);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getCarbonFootprint());
        }
    }
}
