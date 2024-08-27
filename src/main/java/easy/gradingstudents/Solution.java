package easy.gradingstudents;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Any grade less than 40 is a failing grade.

    /*
     * If the difference between the grade and the next multiple of 5 is less than 3,
     * round grade up to the next multiple of 5. 80-85, 85-90, 55-60...
     * */

    /* if the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. */

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(84, 29, 57)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>();

        grades.forEach(grade -> {
            if (grade < 38) {
                rounded.add(grade);
                return;
            }

            int mod = grade % 5;
            int nextMultiple = grade + (5 - mod);
            if ((nextMultiple - grade) < 3) {
                grade = nextMultiple;
            }
            rounded.add(grade);
        });

        return rounded;
    }
}
