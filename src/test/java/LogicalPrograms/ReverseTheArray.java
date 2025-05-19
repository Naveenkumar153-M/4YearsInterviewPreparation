package LogicalPrograms;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] number={42, 7, 19, 3, 66, 28, 90, 11, 53};
        for(int i=0;i<number.length/2;i++){
            int a=number[i];
            int b= number[number.length-1-i];

            number[i]=b;
            number[number.length-1-i]=a;
//         By Achieve this we can use swapping two numbers concepts
/*
            number[i]=number[i]+number[number.length-1-i];
            number[number.length-1-i]=number[i]-number[number.length-1-i];
            number[i]=number[i]-number[number.length-1-i];
*/
        }
        System.out.println(Arrays.toString(number));

    }
}
