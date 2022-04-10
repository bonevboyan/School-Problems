package term_2.set_13_sets_maps.sets;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountKeywords {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\term_2\\set_13_sets_maps\\sets\\TestHashSet.java");
        if (file.exists()) {
            System.out.println("The number of keywords is " + countKeywords(file));
        } else {
            System.out.println("File does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null" };

        Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
        int count = 0;

        String text = String.join("\n" ,Files.readAllLines(file.toPath().toAbsolutePath(), StandardCharsets.UTF_8).stream().filter(x -> !x.startsWith(".*//")).toList());

        Pattern p = Pattern.compile("(/\\*).*(\\*/)");
        Matcher m = p.matcher(text);
        text = m.replaceAll("");


        p = Pattern.compile("(\")(.|\\n)*(\")");
        m = p.matcher(text);
        text = m.replaceAll("");

        System.out.println(text);

        var words = text.split("\\s+");

        for (String word : words) {
            if (keywordSet.contains(word))
                count++;
        }
        return count;
    }
}