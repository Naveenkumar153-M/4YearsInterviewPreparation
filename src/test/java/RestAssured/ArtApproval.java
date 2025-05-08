package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Stack;

import static io.restassured.RestAssured.*;


public class ArtApproval extends LoginTest {

//    static String path = values.getOrganizationId()+"/artapproval/CreateArtApproval";

    @Test
    public void createArtApproval(){
         values.setPath(values.getOrganizationId()+"/artapproval/CreateArtApproval");


        Response response = given().baseUri(values.getBaseUrl())
                .header("authorization","Bearer "+values.getToken())
                .header("Content-Type","application/json")
                .body("{\n" +
                "            \"name\": \"RestAssured Art Approval\",\n" +
                "                \"status\": \"OPEN\"\n" +
                "        }").log().all()
                .when().post(values.getPath())
                .then().log().all()
                .statusCode(200).extract().response();

        System.out.println("Created Art Approval Response "+response.asPrettyString());
        System.out.println(response.statusLine());
        System.out.println(response.jsonPath().getString("data.createdBy"));




    }

}
