package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceCounter {

    static char[] value ="Naveenkumar".toUpperCase().toCharArray();

    public static void main(String[] args) {

        Map<Character,Integer> map= new HashMap<>();
        for (char c:value){
            if (map.containsKey(c)){
            map.put(c,map.get(c)+1);
            }else {
            map.put(c,1);
            }
        }
        System.out.println(map);

    }
}
