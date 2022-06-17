package term_2.set_19_exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ItemList {
    ArrayList<Item> items;

    public ItemList() {
        this.items = new ArrayList<>();
    }

    int size() {
        return items.size();
    }

    Item get(int index) throws Exception {
        if (index >= size())
            throw new Exception();
        return items.get(index);
    }

    void add(Item item) {
        items.add(item);
        Collections.sort(items);
    }
}
