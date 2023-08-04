import java.util.*;
import java.io.*;

public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] series = calculateSeries(a, b, n);
            printSeries(series);
        }
        in.close();

    }

    public static int[] calculateSeries(int a, int b, int n) {
        int[] series = new int[n];
        series[0] = a + b;

        for (int i = 1; i < n; i++) {
            series[i] = series[i - 1] + (int) Math.pow(2, i) * b;
        }
        return series;
    }

    public static void printSeries(int[] series) {
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
