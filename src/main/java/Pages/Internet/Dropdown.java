package Pages.Internet;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown extends Base {
    public WebDriver driver;

    By dropDown = By.id("dropdown");

    public Dropdown(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement dropDown() {
        return driver.findElement(dropDown);
    }

}
