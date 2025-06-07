package LogicalPrograms;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen".toLowerCase();
        String str2 = "Silent".toLowerCase();
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (str1.length() == str2.length()) {
            if (Arrays.equals(str1Array, str2Array)) {
                System.out.println("It's an Anagram");
            } else {
                System.out.println("It's not an Anagram");
            }

        } else {
            System.out.println("It's not an Anagram");
        }
    }
}
