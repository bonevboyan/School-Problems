package term_3.set_00_revision.global_warming;

public class Car implements CarbonFootprint {
    private FuelType fuelType;
    private double distance;

    public Car() {
    }

    public Car(FuelType fuelType, double distance) {
        this.fuelType = fuelType;
        this.distance = distance;
    }

    public Car(Car car) {
        this(car.fuelType, car.distance);
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String toString() {
        return "Car{" +
                "fuelType=" + fuelType +
                ", distance=" + distance +
                '}';
    }

    public double getCarbonFootprint() {
        switch (fuelType) {
            case CNG:
                return distance * 0.05444;
            case Diesel:
                return distance * 10.21;
            case LPG:
                return distance * 5.68;
            case MotorGasoline:
                return distance * 8.78;
            default:
                return -1;
        }
    }
}
