import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AutorizationPageObject;
import pageObject.SwearchTaskPagwObject;

import static io.restassured.RestAssured.given;

public class ActTest {
    WebDriver driver;
    Api api;
    AutorizationPageObject autorizationPageObject;
    SwearchTaskPagwObject swearchTaskPagwObject;

    @BeforeEach
    public void test() {
        driver = new ChromeDriver();
        api = new Api();
        swearchTaskPagwObject = new SwearchTaskPagwObject(driver);
        autorizationPageObject = new AutorizationPageObject(driver);
        driver.get("https://smartid.reinform.ru/iam/auth/realms/smart/protocol/openid-connect/auth?client_id=smart-app&redirect_uri=https%3A%2F%2Fsmart-dev.reinform-int.ru%2Foauth%2Fcallback&response_type=code&scope=openid+email+profile&state=5715e07e-7c18-4c47-9672-2a2467061807");

    }

    public void postAct(){
        String token =  api.getToken();
        System.out.println(token);
        given()
                .auth().oauth2(token)
                .pathParam("inspectionDecisionId", "6c074993-479f-455d-8b8d-f96840428fc6")
                .when()
                .post("/nadzor/createFromInspectionDecision/{inspectionDecisionId}/inspectionAct")
                .then()
                .log().ifValidationFails().statusCode(200);

    }
    @Test
    public void testAct(){
        System.out.println(2);
        autorizationPageObject.clickButtonSignIb();
        autorizationPageObject.setFieldLoginPassword("ilya", "Ghbdtn123");
        swearchTaskPagwObject.clickTask();
    }
}
