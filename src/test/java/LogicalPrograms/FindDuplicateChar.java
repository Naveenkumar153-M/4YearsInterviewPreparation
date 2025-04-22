package LogicalPrograms;

public class FindDuplicateChar {

    static String name ="Naveenkumar";

    public static void main(String[] args) {
        findDuplicateChar(name);
        removeDuplicateLetters(name);
    }

    public static void findDuplicateChar(String strValue){
        String duplicateLetter="";
        for (int i=0; i< strValue.length();i++){
            for (int j=i+1; j<strValue.length();j++){
                if (strValue.charAt(i)==strValue.charAt(j)){
                    duplicateLetter=duplicateLetter+strValue.charAt(i);
                }}
            }
        System.out.println("Founded DuplicateLetter : "+duplicateLetter);
        }

        public static void removeDuplicateLetters(String strValue){
            String removedDuplicateLetter="";
            String removedValue="";

            for (int i=0; i< strValue.length();i++){
                for (int j=i+1; j<strValue.length();j++){
                    if (strValue.charAt(i)==strValue.charAt(j)){
                        removedDuplicateLetter=removedDuplicateLetter+strValue.charAt(i);
                    }
                }
                if (!removedDuplicateLetter.contains(String.valueOf(strValue.charAt(i)))){

                    removedValue=removedValue+strValue.charAt(i);
                }

            }
            System.out.println("Removed Duplicate  : "+removedValue);

//            removedDuplicateLetter= String.valueOf(strValue.charAt(1));
//
//            for (int i=0; i< strValue.length();i++){
//                for (int j=0; j<removedDuplicateLetter.length();j++){
//                    if (strValue.charAt(i)!=strValue.charAt(j)){
//                        removedDuplicateLetter=removedDuplicateLetter+strValue.charAt(i);
//                        break;
//                    }
//                }
//            }
//


            System.out.println("Founded DuplicateLetter : "+removedDuplicateLetter);
        }
    }



