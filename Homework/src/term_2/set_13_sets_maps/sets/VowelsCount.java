package term_2.set_13_sets_maps.sets;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        Map<Character, Integer> letterCount = new IdentityHashMap<>();

        for (char ch : input.toCharArray()) {
            int count = 0;
            try {
                count = letterCount.get(ch);
            } catch (NullPointerException ignored) {
            } finally {
                letterCount.put(ch, count + 1);
            }
        }

        System.out.println(letterCount);
    }
}
