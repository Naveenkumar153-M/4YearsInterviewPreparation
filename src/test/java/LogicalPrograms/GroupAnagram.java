package LogicalPrograms;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for(String word:input){
            char[] c=word.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

//            map.put(key,map.computeIfAbsent(key,k-> new ArrayList<>())).addAll(List.of(word));
            map.computeIfAbsent(key,k->new ArrayList<>()).addAll(List.of(word));

        }

        System.out.println(map);

    }

}
