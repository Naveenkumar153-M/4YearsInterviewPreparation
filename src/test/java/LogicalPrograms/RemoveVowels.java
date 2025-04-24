package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveVowels {


    public static void main(String[] args) {
        String value="Naveenkumar Automation".toLowerCase();
        Map<Character,Integer> map = new HashMap<>();

        for (char c:value.toCharArray()){
            if (!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
                System.out.print(c);
            }
        }

    }
}
