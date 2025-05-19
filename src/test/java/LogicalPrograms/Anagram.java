package LogicalPrograms;


public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen".toLowerCase();
        String str2 = "Silent".toLowerCase();
        boolean value = true;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                    System.out.println("It's not an Anagram");
                    value = false;
                    break;
                }
            }
            if (value) {
                System.out.println("It's an Anagram");

            }
        } else {
            System.out.println("It's not an Anagram");
        }
    }
}
