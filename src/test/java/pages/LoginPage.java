package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver = null;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillLoginField(String login){
        this.driver.findElement(By.id("email")).sendKeys(login);
        //"newuser@testautomation.com"
    }
    public void fillPasswordField(String password){
        this.driver.findElement(By.id("senha")).sendKeys(password);
        //"new"
    }
    public void clickSubmitButton(){
        this.driver.findElement(By.className("btn-primary")).click();
    }
    public String getLoginMessage(){
        return this.driver.findElement(By.className("alert-success")).getText();
    }
}
