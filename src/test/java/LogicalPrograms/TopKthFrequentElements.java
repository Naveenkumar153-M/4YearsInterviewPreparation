package LogicalPrograms;

import java.util.*;

public class TopKthFrequentElements {

    public static void main(String[] args) {

        int[] input = {1, 1, 2, 2, 3, 3, 3};
        int k = 2;
        int[] output=new int[k];

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int key : input) {
        map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<k;i++){
            int max=0;
            int maxKey=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max= entry.getValue();
                    maxKey=entry.getKey();
                }
            }
            output[i]=maxKey;
            map.remove(maxKey);
        }
        System.out.println(Arrays.toString(output));
    }
}
