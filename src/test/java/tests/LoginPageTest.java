package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void shouldLoginSucsessfully(){
        LoginPage login = new LoginPage(nav);
        login.fillLoginForm("newuser@testautomation.com", "new");
        String successMessage = login.getLoginMessage();
        Assert.assertEquals(successMessage, "Bem vindo, New User!");
    }
}
