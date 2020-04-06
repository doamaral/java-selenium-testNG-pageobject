import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
    @Test
    public void shouldLoginSucsessfully(){
        nav.findElement(By.id("email")).sendKeys("newuser@testautomation.com");
        nav.findElement(By.id("senha")).sendKeys("new");
        nav.findElement(By.className("btn-primary")).click();
        String successMessage = nav.findElement(By.className("alert-success")).getText();
        Assert.assertEquals(successMessage, "Bem vindo, New User!");
    }
}
