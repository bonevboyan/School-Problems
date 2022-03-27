package term_2.set_12_stack_queue.lidl;

import java.util.ArrayList;
import java.util.List;

public class Line implements Comparable<Line> {
    private int count;
    private int number;
    private List<Integer> clients;

    public Line(int number, int capacity) {
        this.count = 0;
        this.number = number;

        this.clients = new ArrayList<Integer>();
        for (int i = 0; i < capacity + 1; i++) {
            clients.add(0);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getClients() {
        return clients;
    }

    public void setClients(List<Integer> clients) {
        this.clients = clients;
    }

    public void addCount(int productCount) {
        this.clients.set(productCount, this.clients.get(productCount) + 1);
        count += productCount;
    }

    @Override
    public int compareTo(Line line) {
        if (this.count != line.count) {
            return  this.count - line.count;
        }
        return this.number - line.number;
    }
}