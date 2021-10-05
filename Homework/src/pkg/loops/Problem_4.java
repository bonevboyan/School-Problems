package pkg.loops;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("What year are you interested in?");
        int year = scanner.nextInt();

        System.out.println("Which day of the week is January the first?");
        int dayOfWeek = scanner.nextInt();

        for (int i = 0; i < 12; i++) {
            int daysInAMonth = daysInAMonth(i + 1, year);
            System.out.println(center(months[i], 46));
            System.out.println(new String(new char[46]).replace("\0", "-"));
            System.out.println(Arrays.stream(weekdays).map(x -> String.format("%-7s", x)).collect(Collectors.joining("")));

            for (int j = 0; j < dayOfWeek; j++) {
                System.out.print(new String(new char[7]).replace("\0", " "));
            }

            for (int j = 1; j <= daysInAMonth; j++) {
                dayOfWeek = dayOfWeek == 6 ? 0 : dayOfWeek + 1;
                System.out.printf("%-7d", j);
                if (dayOfWeek % 7 == 0 || j == daysInAMonth) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
    public static String center(String text, int len){
        String out = String.format("%" + len + "s%s%" + len + "s", "", text, "");
        double mid = (out.length() / 2.0);
        double start = mid - (len / 2.0);
        double end = start + len;
        return out.substring((int)start, (int)end);
    }
    public static int daysInAMonth(int month, int year){
        int daysInAMonth;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInAMonth = 31;
            case 2 -> {
                daysInAMonth = 28;
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInAMonth = 29;
                }
            }
            default -> daysInAMonth = 30;
        }
        return daysInAMonth;
    }
}
