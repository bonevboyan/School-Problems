package pkg.set_12_exercises;

public class Program {
    public static void main(String[] args) {
        int[] arr = initializeArray(10000);

        StopWatch sw = new StopWatch();

        sort(arr);

        sw.stop();

        System.out.println(sw.getElapsedTime());
    }

    public static void sort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }

    public static int[] initializeArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random() * size);
        }
        return arr;
    }
}
