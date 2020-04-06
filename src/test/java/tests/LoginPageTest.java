package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void shouldLoginSucsessfully(){
        LoginPage login = new LoginPage(nav);
        login.fillLoginField("newuser@testautomation.com");
        login.fillPasswordField("new");
        login.clickSubmitButton();
        String successMessage = login.getLoginMessage();
        Assert.assertEquals(successMessage, "Bem vindo, New User!");
    }
}
