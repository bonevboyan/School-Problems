package term_3.set_00_revision.global_warming;

public class Building implements CarbonFootprint {
    private double electricity;
    private double lpg;
    private double waste;
    private double water;

    public Building() {
    }

    public Building(double electricity, double lpg, double waste, double water) {
        this.electricity = electricity;
        this.lpg = lpg;
        this.waste = waste;
        this.water = water;
    }

    public Building(Building building) {
        this(building.electricity, building.lpg, building.waste, building.water);
    }


    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public double getLpg() {
        return lpg;
    }

    public void setLpg(int lpg) {
        this.lpg = lpg;
    }

    public double getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public double getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public String toString() {
        return "Building{" +
                "electricity=" + electricity +
                ", lpg=" + lpg +
                ", waste=" + waste +
                ", water=" + water +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        double EF = 0.4374;
        return electricity * EF + lpg * EF + waste * 365 * EF + water * 52 * EF;
    }
}
