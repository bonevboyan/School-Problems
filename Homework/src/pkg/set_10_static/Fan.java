package pkg.set_10_static;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;
    private boolean switchedOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean switchedOn, double radius, String color) {
        this.speed = speed;
        this.switchedOn = switchedOn;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString () {
        if (switchedOn) {
            return String.format("Speed: %s\nColor: %s\nRadius: %.2f", speed, color, radius);
        }
        return String.format("Fan is off\nColor: %s\nRadius: %.2f", color, radius);
    }
}
