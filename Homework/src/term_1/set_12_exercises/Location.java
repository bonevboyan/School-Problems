package term_1.set_12_exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) throws Exception {
        double[] flatArray = Stream.of(a)
                .flatMapToDouble(DoubleStream::of)
                .toArray();

        double max = Collections.max(Arrays.stream(flatArray).boxed().collect(Collectors.toList()));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == max) {
                    return new Location(i, j, max);
                }
            }
        }
        throw new Exception();
    }

    @Override
    public String toString() {
        return String.format("The location of the largest element is %.2f at (%d, %d)", this.maxValue, this.row, this.column);
    }
}
