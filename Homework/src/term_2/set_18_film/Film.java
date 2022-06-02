package term_2.set_18_film;

public class Film {
    private int id;
    private String name;
    private int year;
    private double price;

    public Film(int id, String name, int year, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " \n" + name + " \n" + year + " " + price;
    }
}
