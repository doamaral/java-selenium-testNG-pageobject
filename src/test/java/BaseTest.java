import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver nav = null;

    @BeforeTest
    public void setUp(){
        nav = SimpleDriverFactory.getFirefoxDriver();
        nav.get("http://seubarriga.wcaquino.me/login");
    }
}
