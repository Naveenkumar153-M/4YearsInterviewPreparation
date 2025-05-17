package LogicalPrograms;

public class FibonacciSeries {
    static int count=10;
    static int[]  fibonacciValues= new int[count];
    public static void main(String[] args) {

        fibonacciValues[0]=0;
        fibonacciValues[1]=1;

        System.out.print("Fibonacci Values Output 1 : ");

    for (int i=2;i<count;i++){
            fibonacciValues[i] = fibonacciValues[i-1] + fibonacciValues[i-2];
            System.out.print(fibonacciValues[i]+" ");
    }
        System.out.println();
    
//        Output 2
        System.out.print("Fibonacci Values Output 2 : ");

        int a=0;
        int b=1;
        int c;
        for (int i=0;i<count;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

