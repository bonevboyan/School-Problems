package term_1.set_06_loops;

public class Problem_3 {
    public static void main(String[] args){
        double sum = 0;
        for (int i = 5000; i != 0; i--){
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
