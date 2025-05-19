package LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindCommonNumberInTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 4, 6, 3};
        int[] arr2 = {1, 7, 8, 3, 2};
        List<Integer> commonNumbers=new ArrayList<>();
        for(int a:arr1){
          for(int b:arr2){
              if(a==b){
                  commonNumbers.add(a);
              }
          }
        }
        System.out.println(commonNumbers);
    }
}
