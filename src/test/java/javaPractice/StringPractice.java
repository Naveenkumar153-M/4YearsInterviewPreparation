package javaPractice;

public class StringPractice {



    String name ="Naveen";

    static String mobileBrand = new String("Realme");
    static String homeTown="Erode";
    public static void main(String[] args) {

    StringPractice stringPractice = new StringPractice();

    stringPractice.name="Kumar";

    System.out.println(stringPractice.name);
    char[] test = homeTown.toCharArray();

    System.out.println(homeTown+" "+test.length);

    System.out.println("String literal Object "+mobileBrand);


    }

}

