package term_2.set_05_recursion;

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println(odd(5));
        System.out.println(even(5));
    }

    public static boolean odd(int x){
        if(x == 0){
            return false;
        } else if(x == 1){
            return true;
        } else{
            return odd(x - 2);
        }
    }

    public static boolean even(int x){
        if(x == 0){
            return true;
        } else if(x == 1){
            return false;
        } else{
            return even(x - 2);
        }
    }
}
