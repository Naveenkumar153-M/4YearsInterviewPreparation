package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class ArtApproval extends LoginTest {

    public ArtApproval approval;

    @Test
    public void createArtApproval() {
        values.setPath(values.getOrganizationId() + "/artapproval/CreateArtApproval");
        File file = new File("src/test/resources/JsonTestData/CreateArtApproval.json");

        Response response = given().baseUri(values.getBaseUrl())
                .header("authorization", "Bearer " + values.getToken())
                .header("Content-Type", "application/json")
                .body(getInputJson("CreateArtApproval")).log().all()
                .when().post(values.getPath())
                .then()
//                .body(JsonSchemaValidator.matchesJsonSchema(getJsonSchema("CreateNewArtApproval")))
                .log().all()
                .statusCode(200).extract().response();

        JsonPath jsonValue = response.jsonPath();
        System.out.println("Created Art Approval Response " + response.asPrettyString());

        values.setArtApprovalId(jsonValue.getString("data.artApprovalId"));
        approval = new ArtApproval();


    }

    @Test
    public void uploadImgToArtApproval() {

        File image = new File("src/main/ScreenshotImages/screenshotImage.png");

        values.setPath(values.getOrganizationId() + "/artapproval/UploadArtToApproval");

        RequestSpecification specification = RestAssured.given()
                .baseUri(values.getBaseUrl())
                .headers("authorization", "Bearer " + values.getToken());

        Response response = RestAssured.given(specification)
                .multiPart("file", image, "image/png")
                .formParam("artJson", "{\"name\":\"screenshotImage\"}")
                .formParam("artApprovalId", values.getArtApprovalId())
                .log().all()
                .when()
                .post(values.getPath())
                .then()
//                .body(JsonSchemaValidator.matchesJsonSchema(getJsonSchema("UploadArtToApproval")))
                .log().all()
                .statusCode(200)
                .extract().response();

        JsonPath jsonValue = response.jsonPath();

        System.out.println(response.jsonPath().getString("data.art[0].name"));
        Assert.assertEquals(jsonValue.getString("data.art[0].name"), "screenshotImage");

    }

}
