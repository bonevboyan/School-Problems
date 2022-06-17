package term_2.set_19_exercises;

public final class Item implements Comparable<Item> {
    String description;
    double price;

    public Item(String description, double price) throws Exception {
        if (description.equals("") || price <= 0)
            throw new Exception();
        this.description = description;
        this.price = price;
    }

    public int compareTo(Item o) {
        if (description.equals(o.description)) {
            return (int) (this.price - o.price);
        } else {
            return description.compareTo(o.description);
        }
    }

    public String toString() {
        return description + " (" + price + ")";
    }
}
