package LogicalPrograms;

public class FindSmallNumberInTheArray {

    public static void main(String[] args) {

        int[] number = {25,44,66,10,105,15,50};
        smallestNumber(number);
        secondSmallest(number);

    }

    public static void smallestNumber(int[] number){
        int smallestNumber=number[0];

        for (int i=0;i<number.length;i++){
            if(number[i]<smallestNumber){
                smallestNumber=number[i];
            }
        }
        System.out.println(smallestNumber);
    }
    public static void secondSmallest(int[] number){

        int smallestNumber=number[0];
        int secondSmallest=0;

        for (int i=0;i<number.length;i++){
            if(number[i]<smallestNumber){
                secondSmallest=smallestNumber;
                smallestNumber=number[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
