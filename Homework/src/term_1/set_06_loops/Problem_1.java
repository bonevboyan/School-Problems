package term_1.set_06_loops;

public class Problem_1 {
    public static void main(String[] args){
        int i = 1;
        for (char c = '!'; c != '~' + 1; c++, i++) {
            System.out.printf("%s ", c);
            if(i == 10) {
                System.out.println();
                i = 0;
            }
        }
    }
}
