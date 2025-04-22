package javaPractice.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.*;

public class ArrayPractice  {


// Fast for random access, slower for insertions/removals in the middle.


    public static void main(String[] args) {
        var name ="qer";


        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> newList = new ArrayList<>();
        String jobName="Testing";

        list.add("MS");
        list.add("NKS");
        list.add("KS");
        list.add(jobName);
        list.remove("Testing");

        newList.add(123);

        newList.add(8250);

        list.add("123");
        System.out.println(list);
        System.out.println(newList);


        int [] intArray = new int[4];
        intArray[1]=1;
        int length= intArray.length;

        String [] stringArray = new String[3];
        stringArray[2] = "Naveen";

        System.out.println(stringArray);

        int [][] multiIntArray = new int[3][4];

        multiIntArray[0][0]=12;

        System.out.println(multiIntArray);

        ArrayList nameList = new ArrayList();

        nameList.add("Naveen");
        nameList.add("Murlai");
        nameList.add("Ajay");
        nameList.add("Ajay");
        nameList.add("Jerome");
        nameList.remove("Ajay");
        nameList.add(143);
        System.out.println("nameList : "+nameList);

//        WebDriver driver = new ChromeDriver();

    File file = new File("");


    }


}
