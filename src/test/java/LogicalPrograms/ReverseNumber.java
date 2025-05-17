package LogicalPrograms;

import org.testng.annotations.Test;

public class ReverseNumber {

    static int num= 1234567;
    static int reversedNum=0 ;
    public static void main(String[] args) {


        while (num!=0){
            reversedNum=reversedNum*10+num%10;
            num=num/10;
        }
        System.out.println("reversedNum : "+reversedNum);

    }

}
