package LogicalPrograms;

import java.util.*;

public class Disprz {

    public static String LetterCount(String str) {
        // str="No words";
        Map<Character, Integer> mapCharAndCount = new LinkedHashMap<>();
        Map<String, Integer> finalOutput = new LinkedHashMap<>();

        String[] strArray = str.split(" ");
        Integer firstGreatest = 0;
        String output = "";

        for (String strValue : strArray) {
            for (int i = 0; i < strValue.length(); i++) {
                mapCharAndCount.put(strValue.charAt(i), mapCharAndCount.getOrDefault(strValue.charAt(i), 0) + 1);
            }
            int duplicate = 0;
            for (Integer value : mapCharAndCount.values()) {
                if (value > duplicate) {
                    duplicate = value;
                }
            }
            finalOutput.put(strValue, duplicate);
            mapCharAndCount.clear();
            duplicate = 0;
        }
        for (int value : finalOutput.values()) {
            if (value > firstGreatest) {
                firstGreatest = value;
            }
        }

        if (firstGreatest > 1) {
            for (Map.Entry<String, Integer> entry : finalOutput.entrySet()) {

                if (entry.getValue() == firstGreatest) {
                    output = entry.getKey();
                    break;
                }
            }
        } else {
            output = "-1";
        }

        return (firstGreatest > 1) ? output : "-1";
    }

}

