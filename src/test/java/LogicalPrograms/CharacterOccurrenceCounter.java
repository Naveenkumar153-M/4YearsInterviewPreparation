package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceCounter {

    static char[] value ="Naveenkumar".toUpperCase().toCharArray();

    public static void main(String[] args) {

        Map<Character,Integer> map= new HashMap<>();
        for (char c:value){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

    }
}
