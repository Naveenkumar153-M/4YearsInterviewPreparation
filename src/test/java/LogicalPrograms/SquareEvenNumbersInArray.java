package LogicalPrograms;

import java.util.Arrays;

public class SquareEvenNumbersInArray {

    public static void main(String[] args) {
        int[] input = {1, 4, 3, 6, 8};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[i] = input[i] * input[i];
            } else {
                output[i] = input[i];
            }
        }
        System.out.println(Arrays.toString(output));

    }
}
