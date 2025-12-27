import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;


import static io.restassured.RestAssured.given;

public class Api {

    public String getToken() {
        String token = given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("grant_type", "password")
                .formParam("username", "ilya")
                .formParam("password", "Ghbdtn123")
                .formParam("client_id", "smart-app")
                .formParam("client_secret", "509f3a87-dea7-49ce-a111-8b40672dc56f")
                .when()
                .post("https://smartid.reinform.ru/iam/auth/realms/smart/protocol/openid-connect/token")
                .then().log().ifValidationFails().extract().path("access_token");
        return token;
    }
}
