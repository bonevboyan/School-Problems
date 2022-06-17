package term_2.set_17_files.sorted;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortedFile {
    public static void main(String[] args) {
        File file = new File("src\\term_2\\set_17_files\\files\\names.txt");
        String line = "c";

        writeInFile(line, file);
//        String filePath = new File("").getAbsolutePath();
//        System.out.println(filePath);
    }

    public static int readInFile(String line, File file) {
        try {
            Scanner input = new Scanner(file);

            int i = 1;
            while (input.hasNext()) {
                String currentLine = input.nextLine();
                if (currentLine.equals(line)) {
                    return i;
                }
                i++;
            }
            input.close();

            return -1;
        } catch (FileNotFoundException ex) {
            return -1;
        }

    }

    public static void writeInFile(String name, File file){
        try {
            Scanner input = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            boolean isAdded = false;

            while (input.hasNext()) {
                String currentLine = input.nextLine();
                if(name.compareTo(currentLine) < 0 && !isAdded){
                    sb.append(name).append("\n");
                    isAdded = true;
                }
                sb.append(currentLine).append("\n");
            }
            input.close();

            PrintWriter output = new PrintWriter(file);
            output.print(sb.toString());
            output.close();
        } catch (FileNotFoundException ignored) {
        }
    }
}
