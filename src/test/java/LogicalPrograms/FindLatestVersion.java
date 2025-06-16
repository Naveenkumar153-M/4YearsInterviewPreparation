package LogicalPrograms;

public class FindLatestVersion {

    public static void main(String[] args) {
        String input1 = "1.2.6.4";
        String input2 = "1.3.6.4";

        String output = input1;

        for (int i = 0; i < input1.length(); i++) {
            char s1 = input1.charAt(i);
            char s2 = input2.charAt(i);

            if (s2 > s1) {
                output = input2;
                break;
            } else if (s1 > s2) {
                break;
            } else {
                output = "Two Version are same ";
            }
        }
        System.out.println("Latest version : " + output);
    }
}

