package RestAssured;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PojoClass {

    private String baseUrl = "https://graphicsflowqaapi.azurewebsites.net/";
    private String path ;
    private String token ;
    private String organizationId ;
    private String userName;
    private String password;

}
