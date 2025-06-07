package LogicalPrograms;
import java.util.*;

public class MostRepeatedWordInSentence {
    public static void main(String[] args) {

        String str = "This is a test This test is only a test";
        String[] sentenceArray = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        int repeatedWordCount = 0;
        String repeatedWord = "";
        for (String s : sentenceArray) {

            map.put(s, map.getOrDefault(s, 0) + 1);

        }
        for (Map.Entry<String, Integer> values : map.entrySet()) {
            if (values.getValue() > repeatedWordCount) {
                repeatedWordCount = values.getValue();
                repeatedWord = values.getKey();
            }
        }
        System.out.println("Repeated Word is = " + repeatedWord + " and Repeated Count is = " + repeatedWordCount);

    }
}

