package LogicalPrograms;

public class Factorial {

    public static void main(String[] args) {
        int factorial =5;
        int factorialValue=1 ;


        for (int i=1; i<=factorial;i++){
            factorialValue=factorialValue * i;
        }
        System.out.println("Factorial Value : "+factorialValue);
    }
}
