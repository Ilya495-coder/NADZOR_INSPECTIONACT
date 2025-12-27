package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutorizationPageObject {
    WebDriver driver;
    By buttonSignInLoginAndPassword = By.linkText("Войти по логину и паролю");
    By fieldLogin = By.id("username");
    By fieldPassword = By.id("password");
    By signIn = By.name("login");


    public AutorizationPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonSignIb(){
        driver.findElement(buttonSignInLoginAndPassword).click();
    }
    public void setFieldLoginPassword(String login, String password){
        driver.findElement(fieldLogin).sendKeys(login);
        driver.findElement(fieldPassword).sendKeys(password);
        driver.findElement(signIn).click();
    }

}
