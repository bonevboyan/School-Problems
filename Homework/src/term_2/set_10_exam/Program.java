package term_2.set_10_exam;

import java.util.Iterator;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Developer> developers = new LinkedList<>();

        developers.add(new Intern("Gosho", "gosho@abv.bg", 5, 5));
        developers.add(new Intern("Pesho", "pesho@abv.bg", 6, 8));
        developers.add(new Intern("Ivan", "ivan@abv.bg", 16, 10));

        developers.add(new Senior("Ivo", "ivo@abv.bg", 5, 5));
        developers.add(new Senior("Ivet", "ivet@abv.bg", 6, 8));
        developers.add(new Senior("Samuil", "samuil@abv.bg", 16, 10));

        Iterator<Developer> iterator = developers.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
