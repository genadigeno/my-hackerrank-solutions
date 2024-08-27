package hackerrank.appleandorange;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        countApplesAndOranges(7, 10, 4, 12, List.of(2,3,-4), List.of(3,-2,-4));
//        countApplesAndOranges(2, 3, 1, 5, List.of(-2), List.of(-1));
//        countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6));

        countApplesAndOranges(Data.s, Data.t, Data.a, Data.b, Data.getApples(), Data.getOranges());
//        solution(Data.s, Data.t, Data.a, Data.b, Data.getApples(), Data.getOranges());
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
//        System.out.println("m = " + apples.size());
//        System.out.println("n = " + oranges.size());
        int d = t-s;
        if (d < -1_000_000 || d > 1_000_000) {
            return;
        } else if (a >= s || s >= t || t >= b) {
            return;
        }

        List<Integer> list = List.of(s, t, a, b, apples.size(), oranges.size());
        for (int i : list) {
            if (i < 1 || i > 1_000_000) {
                return;
            }
        }

        apples.forEach(apple -> {
            if ((apple + a) >= s && (apple + a) <= t) {
                Helper.appleCount++;
            }
        });

        oranges.forEach(orange -> {
            if ((b + orange) <= t && (b + orange) >=s) {
                Helper.orangeCount++;
            }
        });

//        System.out.println(Helper.appleCount);
//        System.out.println(Helper.orangeCount);
    }

    private static class Helper {
        static int appleCount  = 0;
        static int orangeCount = 0;
    }

    public static void solution(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int m = apples.size();
        int n = oranges.size();

        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = apples.get(apple_i) + a;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = oranges.get(orange_i) + b;
        }

        int numApples  = 0;
        int numOranges = 0;

        for (int app : apple) {
            if (app >= s && app <= t) {
                numApples += 1;
            }
        }
        for (int ora : orange) {
            if (ora >= s && ora <= t) {
                numOranges += 1;
            }
        }
        System.out.println(numApples);
        System.out.println(numOranges);
    }
}
