package LogicalPrograms;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] charArray = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        int longestSubStringCount = 1;
        List<Character> longestSubString = new ArrayList<>();

        for (char c : charArray) {
            if (!set.contains(c)) {
                set.add(c);
            } else if (set.contains(c)) {
                if (set.size() > longestSubStringCount) {
                    longestSubStringCount = set.size();
                    longestSubString.removeAll(longestSubString);
                    longestSubString.addAll(set);
                    set.removeAll(set);
                }
            }
        }
        System.out.println(longestSubString);
        System.out.println(longestSubStringCount);

    }

}
