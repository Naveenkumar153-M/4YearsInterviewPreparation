package LogicalPrograms;

import java.util.*;

public class RemoveDuplicateChar {

    public static void main(String[] args) {
        String input = "aabbcdddeedg";
        char[] array = input.toCharArray();

        Set<Character> output = new HashSet<>();
        for (char c : array) {
            output.add(c);
        }
        System.out.println(output);
    }
}




