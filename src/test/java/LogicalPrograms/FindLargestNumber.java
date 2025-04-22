package LogicalPrograms;

public class FindLargestNumber {
    public static void main(String[] args) {

        int[] number = {25,44,66,10,105,15,50};

        int largestNumber=number[0];

        for (int i=1;i < number.length; i++){
            if (number[i]>largestNumber){
                largestNumber=number[i];
            }
        }
        System.out.println(largestNumber);
    }
}
