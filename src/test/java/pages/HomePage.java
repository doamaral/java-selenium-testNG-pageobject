package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String getLoginMessage(){
        return this.driver.findElement(By.className("alert-success")).getText();
    }
}
