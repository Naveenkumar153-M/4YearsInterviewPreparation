package LogicalPrograms;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] input ={1,2,3,4};
        int[] output=new int[input.length];

        for(int i=0;i<input.length;i++){

            int temp=1;
            for(int j=0;j<input.length;j++){
                if(i!=j){
                    temp=temp*input[j];
                }
            }
            output[i]=temp;
            temp=1;

        }
        System.out.println(Arrays.toString(output));
    }
}
