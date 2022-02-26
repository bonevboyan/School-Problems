package term_2.set_06_tail_recursion;

public class Problem_5 {
    public static void main(String[] args) {
        int[] array = { 100, 55, 1, 7 };
        int size = array.length;
        System.out.print(arrAvg(array, size, 0));
    }

    static double arrAvg(int []array, int size, int sum)
    {
        if (size == 0)
            return 1.0 * sum / array.length;

        return arrAvg(array, size - 1, sum + array[size - 1]);
    }
}
