import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test
    public void shouldLoginSucsessfully(){
        WebDriver nav = SimpleDriverFactory.getFirefoxDriver();
        nav.get("http://seubarriga.wcaquino.me/login");
    }
}
