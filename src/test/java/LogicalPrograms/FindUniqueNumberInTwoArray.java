package LogicalPrograms;

import java.util.*;

public class FindUniqueNumberInTwoArray {


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 4, 6, 3};
        int[] arr2 = {1, 7, 8, 3, 2};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i:arr1){
        map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr2){
        map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
