package term_2.set_01_gui_exercise;

public class Product implements Comparable<Product> {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d) %s - %.2f", id, description, price);
    }

    @Override
    public int compareTo(Product product) {
        double difference = this.price - product.price;

        if(difference > 0){
            return 1;
        }

        return -1;
    }
}
