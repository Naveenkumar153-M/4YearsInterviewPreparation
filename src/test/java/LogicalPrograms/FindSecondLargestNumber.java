package LogicalPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int[] number = {25,44,66,10,105,15,50};
        int [] output = new int[number.length];

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (new Random().nextFloat() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        String strRandomID = new StringBuilder("-").append(buffer).toString();
        System.out.println(strRandomID.toUpperCase());

}
//    @Test
//    public static String getRandomString() {
//
//        return strRandomID.toUpperCase();
//    }
}

