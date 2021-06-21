package utlitiles;

import javax.security.auth.login.Configuration;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthUtil {

    public static String gettoken(){
        String username = ConfigurationReader.getProperties("username");
        String password = ConfigurationReader.getProperties("password");

        Response response = given().
                formParam("email", username).
                formParam("password", password).
                log().all().
                when().
                post("login").prettyPeek();
        response.then().statusCode(200);

        return response.jsonPath().getString("token");

    }



}
