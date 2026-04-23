package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    WebDriver driver;
    public WebElement getWebElement (String locator){
        return driver.findElement(By.cssSelector(locator));
    }
}
