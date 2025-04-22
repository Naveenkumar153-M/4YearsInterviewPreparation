package javaPractice;

public class Test {

    static String word="Testing";
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        word="Testing";
        System.out.println(word);
        test();
    }

    static {
        System.out.println("static");
    }

    public static void test(){
        System.out.println("Test Method");
    }
}
