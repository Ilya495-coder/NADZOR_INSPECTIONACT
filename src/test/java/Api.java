import io.qameta.allure.internal.shadowed.jackson.databind.JsonSerializable;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;


import static io.restassured.RestAssured.given;

public class Api {
    //RestAssured.baseURI = "https://smart-dev.reinform-int.ru/app/rinrif/nadzor"
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
    public void postAct(){
        String token =  getToken();
        System.out.println(token);
        given()
                .auth().oauth2(token)
                .pathParam("inspectionDecisionId", "6c074993-479f-455d-8b8d-f96840428fc6")
                .when()
                .post("https://smart-dev.reinform-int.ru/public/nginx8085/app/rinrif/nadzor/nadzor/createFromInspectionDecision/{inspectionDecisionId}/inspectionAct")
                .then()
                .log().ifValidationFails().statusCode(200);

    }
}
