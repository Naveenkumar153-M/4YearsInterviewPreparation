package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindFirstDuplicate {



    public static void main(String[] args) {
        String strValue="Abcdababcf".toUpperCase();
        Map<Character,Integer> mapValue = new HashMap<>();

        for(char c:strValue.toCharArray()){

            if(mapValue.containsKey(c)){
            mapValue.put(c,mapValue.get(c)+1);
                System.out.println("First Duplicate : "+c);
                break;

            }else {
                mapValue.put(c,1);
            }
        }
        System.out.println(mapValue);

    }
}
