import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.*;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;

public class BaseTest {
    Api api;
    Task task;
    AutorizationPageObject autorizationPageObject;
    SwearchTaskPagwObject swearchTaskPagwObject;
    КinrifinspectionactconductKNMPageObject кinrifinspectionactconductKNMPageObject;
    RinrifinspectionactformKnmActPageObject rinrifinspectionactformKnmActPageObject;


    @BeforeEach
    public void test() {
        api = new Api();
        api.postAct();
        кinrifinspectionactconductKNMPageObject = new КinrifinspectionactconductKNMPageObject();
        swearchTaskPagwObject = new SwearchTaskPagwObject();
        autorizationPageObject = new AutorizationPageObject();
        rinrifinspectionactformKnmActPageObject = new RinrifinspectionactformKnmActPageObject();
        task = new Task();
        getDriver();

    }

    public void getDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--user-data-dir=C:\\temp\\chrome-selenide-cryptopro");
        options.addArguments("--profile-directory=Default");

        options.addArguments("--no-first-run");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--start-maximized");

        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserCapabilities = options;

        open("https://smart-dev.reinform-int.ru/main/#/app/");
    }

}
