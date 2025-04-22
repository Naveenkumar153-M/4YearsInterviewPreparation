package javaPractice.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.*;

public class set {
    public static void main(String[] args) throws FileNotFoundException {

        String a="Naveen";
        String b="Shubaa";
        a=a+b;
        b=a;

        System.out.println("A : "+a.substring(6));
        System.out.println("B : "+b.substring(0,6));

        Set<String>  stringSet = new HashSet<>();
        stringSet.add("Naveen");
        stringSet.add("Shubaa");

        System.out.println();
        stringSet.iterator().next();


        Map<String,Integer> map= new HashMap<>();
        map.put("Shubaa",26);
        map.put("Naveen",27);
        int age=0;
        for (int vv:map.values()){
            age=age+vv;
        }

    }
}
