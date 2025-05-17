package LogicalPrograms;

import java.util.*;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int[] number = {25,44,66,10,105,15,50};
        int [] output = new int[number.length];

        int largestNumber=number[0];
        int secondLargestValue=0;
        for (int i=1;i<number.length;i++){
            if (number[i]>largestNumber){
                secondLargestValue=largestNumber;
                largestNumber=number[i];
            }
        }
        System.out.println(largestNumber);
        System.out.println(secondLargestValue);

        //By Using Array Sorting
        Arrays.sort(number);
        System.out.println(number[number.length-2]);








}

}

