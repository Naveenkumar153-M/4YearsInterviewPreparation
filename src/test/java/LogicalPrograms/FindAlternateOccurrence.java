package LogicalPrograms;

public class FindAlternateOccurrence {


    static String stringInput = "Capgemenini";

    public static void main(String[] args) {

        method1(stringInput);
        method2(stringInput);
    }

    public static void method1(String strValue) {

    String outputLetter = "";

        for(int i = 0; i<strValue.length();i++){
        if ((i % 2) == 0) {
            outputLetter = outputLetter + strValue.charAt(i);
        }
        }
        System.out.println("method1 : "+outputLetter);
    }

    public static void method2(String strValue){

    String outputLetter = "";
        for(int i=0;i < strValue.length(); i++){
        outputLetter=outputLetter+strValue.charAt(i);
        i++;
    }
        System.out.println("method2 : "+outputLetter);


    }
}



