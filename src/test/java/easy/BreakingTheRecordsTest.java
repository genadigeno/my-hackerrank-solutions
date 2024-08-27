package easy;

import easy.breakingtherecords.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BreakingTheRecordsTest {
    List<Integer> data1 = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);//[2, 4]
    List<Integer> data2 = List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);//[4, 0]

    @Test
    public void test1(){
        System.out.println(Solution.breakingRecords(data1));
    }

    @Test
    public void test2(){
        System.out.println(Solution.breakingRecords(data2));
    }
}
