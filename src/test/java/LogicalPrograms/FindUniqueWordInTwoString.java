package LogicalPrograms;

public class FindUniqueWordInTwoString {

    public static void main(String[] args) {
        String str1 = "Have a nice day";
        String str2 = "Have a good day";
        StringBuilder output = new StringBuilder();

        for (String s1 : str1.split(" ")) {
            if (!str2.contains(s1)) {
                output.append(s1).append(" ");
            }
        }
        for (String s2 : str2.split(" ")) {
            if (!str1.contains(s2)) {
                output.append(s2).append(" ");
            }
        }
        System.out.println(output);
    }
}
