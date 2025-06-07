package LogicalPrograms;

import java.util.*;

public class GroupStringsByLength {

    public static void main(String[] args) {
        String input = "a to cat dog java";

        Map<Integer, List<String>> map = new HashMap<>();

        for (String value : input.split(" ")) {
            int key = value.length();
            map.computeIfAbsent(key, k -> new ArrayList<>()).addAll(List.of(value));
        }
        System.out.println(map);
    }
}
