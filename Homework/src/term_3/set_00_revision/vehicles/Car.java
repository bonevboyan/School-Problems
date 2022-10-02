package term_3.set_00_revision.vehicles;

public class Car {
    protected String brand;
    protected int year;
    protected int mileage;
    protected double value;

    public Car(String brand, int year, int mileage, int value) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double price() {
        if(year < 4) return value * 0.8;
        if(year < 7) return value * 0.6;
        return  value * 0.3;
    }

    @Override
    public String toString() {
        return String.format("%s: %d km, %.2f", brand, mileage, price());
    }
}
