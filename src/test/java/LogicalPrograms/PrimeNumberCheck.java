package LogicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        int number= 143;

        boolean isPrimeNumber = false;

        if (number<=1) {
            isPrimeNumber=false;
        }else {
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isPrimeNumber=false;
                break;
            }else {
                isPrimeNumber=true;
            }
        }
        }
        if (isPrimeNumber){
            System.out.println(number +" is a Prime Number");
        }else if(!isPrimeNumber){
            System.out.println(number +" is Not a Prime Number");

        }
    }
}


