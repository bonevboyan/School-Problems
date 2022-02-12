package term_1.set_14_exercises;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return MyInteger.isEven(this.value);
    }

    public boolean isOdd() {
        return MyInteger.isOdd(this.value);
    }

    public boolean isPrime()
    {
        return MyInteger.isPrime(this.value);
    }

    public boolean equals(int n) {
        return this.value == n;
    }

    public boolean equals(MyInteger n) {
        return this.value == n.value;
    }

    public static int parseInt(char[] digits) {
        return Integer.parseInt(String.valueOf(digits));
    }

    public static int parseInt(String digits) {
        return Integer.parseInt(digits);
    }

    public static boolean isEven(MyInteger n) {
        return MyInteger.isEven(n.value);
    }

    public static boolean isOdd(MyInteger n) {
        return MyInteger.isOdd(n.value);
    }

    public static boolean isPrime(MyInteger n)
    {
        return MyInteger.isPrime(n.value);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
