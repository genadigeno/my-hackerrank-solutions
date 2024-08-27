package easy.breakingtherecords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
     *                                  Count
     * Game  Score  Minimum  Maximum   Min Max
     * 0      12     12       12       0   0
     * 1      24     12       24       0   1
     * 2      10     10       24       1   1
     * 3      24     10       24       1   1
     * */
    private static int minCount;
    private static int maxCount;
    private static int maximum;
    private static int minimum;

    public static List<Integer> breakingRecords(List<Integer> scores) {
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (i == 0) {
                minimum = score;
                maximum = score;
            } else {
                if (score > maximum) {
                    maximum = score;
                    maxCount++;
                } else if (score < minimum) {
                    minimum = score;
                    minCount++;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        reset();
        return result;
    }

    private static void reset() {
        minimum = 0;
        maximum = 0;
        minCount= 0;
        maxCount= 0;
    }
}
