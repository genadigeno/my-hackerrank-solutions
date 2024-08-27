package hackerrank.betweentwosets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> resultList = new ArrayList<>();
        for (int number = a.get(a.size()-1); number <= b.get(0); number++) {
            final int finalNumber = number;
            if (a.stream().allMatch(integer -> finalNumber%integer == 0)){
                resultList.add(finalNumber);
            }
            if (b.stream().anyMatch(integer -> integer%finalNumber!=0)){
                resultList.remove(Integer.valueOf(finalNumber));
            }
        }
        return resultList.size();
    }

    public static void main(String[] args) {
        //System.out.println(getTotalX(List.of(2, 6), List.of(24, 36)));
        System.out.println(getTotalX(List.of(4, 8, 12), List.of(96, 144)));
    }
}
