package javaPractice.FilePractice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JSON_FileReading {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("BioData.json");
            JSONParser jsonParser= new JSONParser();
            Object objectValue=jsonParser.parse(fileReader);

            JSONObject jsonValue =(JSONObject) objectValue;

            System.out.println(jsonValue.get("Name"));
            System.out.println(jsonValue.get("Companies Worked"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
