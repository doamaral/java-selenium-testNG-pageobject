package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void shouldLoginSuccessfully(){
        LoginPage login = new LoginPage(nav);
<<<<<<< HEAD
        HomePage home = login.fillLoginForm("newuser@testautomation.com", "new");
        String successMessage = home.getLoginMessage();
=======
        login.fillLoginForm("newuser@testautomation.com", "new");
        String successMessage = login.getLoginMessage();
>>>>>>> 6deed392478c0b924b1c9d96c483a838ce5e902c
        Assert.assertEquals(successMessage, "Bem vindo, New User!");
    }
}
