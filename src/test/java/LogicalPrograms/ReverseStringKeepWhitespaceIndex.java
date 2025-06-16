package LogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringKeepWhitespaceIndex {

    //Tata Elxsi
    public static void main(String[] args) {
        print(100);
        rev();
    }

    static int count = 1;
    public static void print(int value) {
        System.out.println(count);
        count++;
        if (value >= count) {
            print(value);
        }
    }

    public static void rev() {
        String input = "ab cde";
        int position = 0;
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equals(" ")) {
                position = i;
            }
        }
        System.out.println("Position : "+position);

        StringBuilder builder = new StringBuilder(input);
        builder.reverse();

        for (char c : builder.toString().toCharArray()) {
            if (!String.valueOf(c).equals(" ")) {
                list.add(c);
            }
        }

        list.add(position, ' ');
        System.out.println(list);
        String output = "";
        for (char c : list) {
            output = output + String.valueOf(c);
        }
        System.out.println("Output : "+output);


    }
}

