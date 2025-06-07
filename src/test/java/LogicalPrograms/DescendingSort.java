package LogicalPrograms;

import java.util.Arrays;

public class DescendingSort {

    public static void main(String[] args) {

        int[] array = {10, 3, 5, 7, 9, 2, 4, 6, 8, 1};

        for(int i=0;i<array.length;i++){
            int largest=array[i];
            for(int j=i+1;j<array.length;j++){
                if(array[j]>largest){
                    largest=array[j];
                    array[j]=array[i];
                    array[i]=largest;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
