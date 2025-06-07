package LogicalPrograms;

import io.cucumber.java.it.Ma;
import io.cucumber.java.sl.In;

import java.util.*;

public class DomainOccurrence {

    public static void main(String[] args) {
        String input = "naveen1@gmail.com naveen@outlook.com naveen2@gmail.com naveen1@hotmail.com";
        String[] emails = input.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String strValue : emails) {
            String str = strValue.split("@")[1];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int max = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        Optional optional=map.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(optional);



    }
}
