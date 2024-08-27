package easy.appleandorange;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String APPLES_DATA_PATH =
            "C:\\Users\\GENO\\IdeaProjects\\hackerrank\\src\\main\\resources\\data\\apples.txt";
    private static final String ORANGES_DATA_PATH =
            "C:\\Users\\GENO\\IdeaProjects\\hackerrank\\src\\main\\resources\\data\\oranges.txt";

    public static int s = 13313;
    public static int t = 28430;

    public static int a = 156;
    public static int b = 69686;

    private static final List<Integer> apples  = new ArrayList<>();

    private static final List<Integer> oranges = new ArrayList<>();

    public static List<Integer> getApples() {
        return getData(apples, APPLES_DATA_PATH);
    }

    public static List<Integer> getOranges() {
        return getData(oranges, ORANGES_DATA_PATH);
    }

    private static List<Integer> getData(List<Integer> oranges, String orangesDataPath) {
        if (oranges.isEmpty()) {
            BufferedReader reader = null;
            try {

                reader = new BufferedReader(new FileReader(orangesDataPath));
                String line;
                while ((line = reader.readLine()) != null) {
                    for (String s: line.split(",")) {
                        if (!s.matches("-?\\d+(\\.\\d+)?")){
                            throw new NumberFormatException(line+" is not numeric");
                        }
                        oranges.add(Integer.valueOf(s));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return oranges;
    }
}
