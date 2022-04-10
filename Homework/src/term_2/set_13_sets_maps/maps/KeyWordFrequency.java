package term_2.set_13_sets_maps.maps;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyWordFrequency {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\term_2\\set_13_sets_maps\\sets\\TestHashSet.java");
        if (file.exists()) {
            System.out.println("The number of keywords is " + countKeywords(file));
        } else {
            System.out.println("File does not exist");
        }

    }

    public static Map<String, Integer> countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null"};

        Map<String, Integer> keywordMap = new HashMap<>();

        for (String str : keywordString) {
            keywordMap.put(str, 0);
        }

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word = input.next();
            try {
                int count = keywordMap.get(word);
                keywordMap.put(word, count + 1);
            } catch (NullPointerException ignored) {
            }
        }
        input.close();

        Map<String, Integer> sortedMap = new HashMap<>();

        keywordMap.entrySet().stream()
                .filter(x -> x.getValue() != 0)
                .sorted(Map.Entry.comparingByValue())
                .toList()
                .forEach(x -> {
                    sortedMap.put(x.getKey(), x.getValue());
                });

        return sortedMap;
    }
}
