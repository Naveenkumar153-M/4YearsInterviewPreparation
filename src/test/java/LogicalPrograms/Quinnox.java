package LogicalPrograms;

import java.util.*;

public class Quinnox {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7, 8, 3, 8, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 9, 2, 0, 1, 3, 8, 3, 8, 7));

        list2.addAll(list1);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer key : list2) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<Integer> output = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                output.add(entry.getKey());
            }
        }

        System.out.println("Output Common List : " + output);

        for (int i = 0; i < 2; i++) {
            output.remove(Collections.min(output));
        }

        System.out.println("Third Minimum Element is : " + Collections.min(output));
    }

}
