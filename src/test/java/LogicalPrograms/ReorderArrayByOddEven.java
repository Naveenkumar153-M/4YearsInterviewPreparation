package LogicalPrograms;

import java.util.*;

public class ReorderArrayByOddEven {


    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int a : a1) {
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }

        for (int b : a2) {
            if (b % 2 == 0) {
                even.add(b);
            } else {
                odd.add(b);
            }
        }
        List<Integer> output = new ArrayList<>();
        output.addAll(odd);
        output.addAll(even);
        System.out.println(output);

    }
}
