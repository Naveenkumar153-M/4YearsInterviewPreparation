package LogicalPrograms;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome("race a car");
    }
    public static boolean isPalindrome(String strValue) {

        strValue=strValue.toLowerCase().replaceAll(" ","").replaceAll(",","").replaceAll(":","");
        StringBuilder builder= new StringBuilder(strValue);
        String reversed= builder.reverse().toString();
        if(strValue.equals(reversed)){
            return true;
        }
        return false;

    }
}
