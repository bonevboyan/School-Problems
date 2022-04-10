package term_2.set_13_sets_maps.sets;

import java.util.*;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        set.add("Paris");


        System.out.println(set);
        for(String s: set) {
            System.out.print(s.toUpperCase() + " ");
        }
    }

}