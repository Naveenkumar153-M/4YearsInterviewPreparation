package LogicalPrograms;
import java.util.*;
public class GroupWordsByFirstLetter {

    public static void main(String[] args) {
        String[] input={"Apple","Animals","Ball","Bat","Cat","Candy"};

        Map<Character,List<String>> map= new HashMap<>();

        for(String str:input){
            char key=str.charAt(0);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
        }

        System.out.println(map);

    }
}
