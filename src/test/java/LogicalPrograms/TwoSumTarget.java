package LogicalPrograms;

import java.util.Arrays;

public class TwoSumTarget {
        public static int[] twoSum(int[] nums, int target) {
            int [] output=new int[2];

            for ( int i=0; i < nums.length; i++) {
                for ( int j = i+1; j < nums.length; j++) {
                    if(target==(nums[i]+nums[j])){
                        output[0]=i;
                        output[1]=j;
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(output));
            return output;

        }

    public static void main(String[] args) {
        twoSum(new int[]{2,76,11,7,15},9);
    }
    }

