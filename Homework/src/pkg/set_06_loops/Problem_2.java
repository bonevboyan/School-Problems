package pkg.set_06_loops;

public class Problem_2 {
    public static void main(String[] args){
        for (int i = 0; i < 7; i++){
            String repeated = new String(new char[7 - i]).replace("\0", "* ");
            String spaces = new String(new char[i]).replace("\0", "  ");
            System.out.printf("%s%s\n", spaces, repeated);
        }
    }
}
