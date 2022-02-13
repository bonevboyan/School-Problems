package term_2.set_01_gui_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ListOfProducts {
    private final ArrayList<Product> products;

    public ListOfProducts() {
        this.products = new ArrayList<>();
    }

    public List<String> toArray() {
        return products.stream()
                .map(Product::toString)
                .collect(Collectors.toList());
    }

    public double averagePrice() {
        OptionalDouble average = products.stream()
                .map(Product::getPrice)
                .mapToDouble(a -> a)
                .average();

        return average.isPresent() ? average.getAsDouble() : 0;
    }

    public String toString() {
        return "<html>" + String.join("<br>", toArray()) + "</html>";
    }

    public void sortByPrice() {
        products.sort(Collections.reverseOrder());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int count() {
        return products.size();
    }
}
