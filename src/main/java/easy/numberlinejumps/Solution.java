package easy.numberlinejumps;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(kangaroo(2, 1, 1, 2));
        //System.out.println(kangaroo(0, 3, 4, 2));
        //System.out.println(kangaroo(0, 2, 5, 3));
        //System.out.println(kangaroo(43, 2, 70, 2));
        System.out.println("lo".getBytes().length);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result;

        if (x1 == x2) return "YES";
        else if (v1 > v2 && x1 > x2) return "NO";
        else if (v2 > v1 && x2 > x1) return "NO";
        else if (v2 == v1 && x2 > x1) return "NO";
        else if (v2 == v1 && x1 > x2) return "NO";
        else {
            x1 += v1;
            x2 += v2;
            result = kangaroo(x1, v1, x2, v2);
        }

        return result;
    }

    public static int secondMax(int[] array){
        int[] ordered = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min_idx] > array[j]){
                    min_idx = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = tmp;
        }
        return array[1];
    }
}
