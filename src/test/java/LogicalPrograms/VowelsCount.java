package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount {


    public static void main(String[] args) {
        String value="Naveenkumar Automation".toUpperCase();
        Map<Character,Integer> map = new HashMap<>();


        System.out.println();
        for (char c:value.toCharArray()){
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                if(map.get(c)==null){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }

        }
        System.out.print(map);




    }
}
