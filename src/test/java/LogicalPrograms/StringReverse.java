package LogicalPrograms;

public class StringReverse {


    static String name = "NaveenMS";

    public static void main(String[] args) {

        reverseMethod1(name);
        reverseMethod2(name);

    }

    public static void reverseMethod1(String strValue){

        String reversed="";

        for(int i=strValue.length()-1;i >=0; i--){
            reversed = reversed+name.charAt(i);

        }
        System.out.println(reversed);
    }

    public static void reverseMethod2(String strValue){

        char [] nameArray=strValue.toCharArray();
        String reversed="";

        for(int i=nameArray.length-1;i >=0; i--){
            reversed = reversed+nameArray[i];

        }
        System.out.println(reversed);
    }




}
