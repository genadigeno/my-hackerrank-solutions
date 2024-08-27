package easy.appleandorange;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final String PATH =
            "C:\\Users\\GENO\\IdeaProjects\\hackerrank\\src\\main\\resources\\data\\apples.txt";

    public static int s = 13313;
    public static int t = 28430;

    public static int a = 156;
    public static int b = 69686;

    private static List<Integer> apples  = new ArrayList<>();

    private static List<Integer> oranges = new ArrayList<>();

    public static List<Integer> getApples() {
        if (apples.isEmpty()) {
            BufferedReader reader = null;
            try {

                reader = new BufferedReader(new FileReader(PATH));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    for (String s: line.split(",")) {
                        if (!s.matches("-?\\d+(\\.\\d+)?")){
                            throw new NumberFormatException(line+" is not numeric");
                        }
                        apples.add(Integer.valueOf(s));
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
        return apples;
    }

    public static List<Integer> getOranges() {
        if (oranges.isEmpty()) {
            BufferedReader reader = null;
            try {

                reader = new BufferedReader(new FileReader("C:\\Users\\GENO\\IdeaProjects\\hackerrank\\src\\main\\resources\\data\\oranges.txt"));
                String line = null;
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
