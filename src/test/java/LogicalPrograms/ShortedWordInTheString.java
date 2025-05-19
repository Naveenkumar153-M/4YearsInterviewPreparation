package LogicalPrograms;

public class ShortedWordInTheString {

    public static void main(String[] args) {
        String str = "Listen our was Code Execution Successful";
        String[] strArray=str.split(" ");

        int smallestWord=strArray[0].length();
        for(String s:strArray){
            if(s.length()<smallestWord){
                smallestWord=s.length();
            }
        }
        System.out.println("Smallest Word Count : "+smallestWord);

    }
}
