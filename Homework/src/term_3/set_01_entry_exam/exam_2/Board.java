package term_3.set_01_entry_exam.exam_2;

import java.util.ArrayList;

public class Board {
    ArrayList<BoardItem> items;

    public Board() {
        items = new ArrayList<>();
    }

    public Board(ArrayList<BoardItem> items) {
        this.items = items;
    }

    public ArrayList<BoardItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<BoardItem> items) {
        this.items = items;
    }

    public void addItem(BoardItem item){
        items.add(item);
    }

    public int totalItems() {
        return items.size();
    }
}
