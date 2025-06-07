package LogicalPrograms;

import java.util.Arrays;

public class MinAndMaxInArray {

    public static void main(String[] args) {
        int[] input = {2, 5, 8, 3, 1};
        findMinAndMaxInTheArray(input);
    }

    public static int[] findMinAndMaxInTheArray(int[] arrayValue) {
        int[] minAndMax = new int[2];
        int min = arrayValue[0];
        int max = arrayValue[0];
        for (int value : arrayValue) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        minAndMax[0] = min;
        minAndMax[1] = max;

        System.out.println(Arrays.toString(minAndMax));
        return minAndMax;
    }
}
