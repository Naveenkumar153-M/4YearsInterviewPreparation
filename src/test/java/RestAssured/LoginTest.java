package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class LoginTest {

    static PojoClass values;
    @BeforeSuite
    public static void init() {
        values= new PojoClass();
        values.setPath("users/Login");
        values.setUserName("naveenkumar.m@inksoft.com");
        values.setPassword("Naveen@123");
        values.setBaseUrl("https://graphicsflowqaapi.azurewebsites.net/");
    }

    @Test
    public static void loginWithNonBdd() {
        RestAssured.baseURI = values.getBaseUrl();

        RequestSpecification specification = RestAssured.given()
                .header("accept", "application/json")
                .multiPart("Email", values.getUserName())
                .multiPart("password", values.getPassword()).log().all();
        Response response = specification.request(Method.POST, values.getPath());
        response.statusCode();

        System.out.println("Response: " + response.asPrettyString());
    }

    @BeforeClass
    public static void login() {

        Response response = given().baseUri(values.getBaseUrl())
                .header("accept", "application/json")
                .formParam("Email", values.getUserName())
                .formParam("password", values.getPassword()).log().all()
                .when().post(values.getPath())
                .then().statusCode(200).log().all().extract().response();

        values.setToken(response.jsonPath().getString("data.loggedInUser.token"));
        System.out.println("Session Token : "+ values.getToken());
        values.setOrganizationId(response.jsonPath().getString("data.organizations[0].organizationId"));
        System.out.println("Organization ID of the Login User : "+ values.getOrganizationId());

    }
}

