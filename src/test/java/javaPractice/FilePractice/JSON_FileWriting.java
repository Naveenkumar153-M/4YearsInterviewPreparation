package javaPractice.FilePractice;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JSON_FileWriting {

    public static void main(String[] args) {
        JSONObject jsonObject= new JSONObject();

        jsonObject.put("Name","Naveen");
        jsonObject.put("Age",28);
        jsonObject.put("ID",153);
        jsonObject.put("DOB","15.03.1998");

        JsonArray array=new JsonArray();
        array.add("JAVA");
        array.add("Selenium");

        jsonObject.put("Skills",array);
        jsonObject.put("Mobile number","8508250272");


        System.out.println(jsonObject);
        try {

            FileWriter fileWriter = new FileWriter("src/test/java/javaPractice/FilePractice/BioData.json");
            fileWriter.write(jsonObject.toString());
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
