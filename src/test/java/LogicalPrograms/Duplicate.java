package LogicalPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {
        String name="Shubaa Ravi";
        name=name.toUpperCase();
        String duplicate="";
        String nonDuplicate="";
        String vowels="AEIOU";
        String vowelsLetters="";

        for (int i=0; i<name.length(); i++){
            if (vowels.contains(String.valueOf(name.charAt(i)))){
                vowelsLetters=vowelsLetters+name.charAt(i);
            }

        }

        System.out.println("vowelsLetters : "+vowelsLetters);


        for (int i=0;i<name.length();i++){

            for (int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    duplicate=duplicate+name.charAt(j);
                }
            }
            if (!duplicate.contains(String.valueOf(name.charAt(i)))){
                nonDuplicate=nonDuplicate+name.charAt(i);
            }

        }
        System.out.println("duplicate : "+duplicate);

        System.out.println("nonDuplicate : "+nonDuplicate);
    }
}
