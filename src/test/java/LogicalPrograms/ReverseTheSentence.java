package LogicalPrograms;

public class ReverseTheSentence {

    public static void main(String[] args) {
        String sentence = "Java is powerful language";
        String[] sentenceArray = sentence.split(" ");
        String output1 = "";
        String output2 = "";

        for (int i = sentenceArray.length - 1; i >= 0; i--) {
            output1 += sentenceArray[i] + " ";
        }

        for (String str : sentenceArray) {
            output2 = str + " " + output2;

        }
        System.out.println(output1);
        System.out.println(output2);


    }
}

