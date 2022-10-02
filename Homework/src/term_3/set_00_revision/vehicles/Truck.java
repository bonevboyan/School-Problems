package term_3.set_00_revision.vehicles;

public class Truck extends Car{
    private int tonnage;

    public Truck(String brand, int year, int mileage, int value) {
        super(brand, year, mileage, value);
    }

    public Truck(String brand, int year, int mileage, int value, int tonnage) {
        super(brand, year, mileage, value);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public double price() {
        if(year < 5) return value;
        if(tonnage < 5) return value * 0.3;
        if(tonnage < 10) return value * 0.6;
        return value * 0.8;
    }
}
