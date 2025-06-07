package LogicalPrograms;
import io.cucumber.java.sl.In;

import java.util.*;
public class ConvertListToMap {

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "apple","grapes","orange"};

        Map<String, Integer> map= new HashMap<>();
        for (String key:input){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        System.out.println(map);
    }
}
