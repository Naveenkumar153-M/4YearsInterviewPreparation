package LogicalPrograms;

import java.util.Random;

public class RandomStringID {

    public static void main(String[] args) {
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
}
