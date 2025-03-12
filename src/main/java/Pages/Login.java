package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utilities.Base.properties;

public class Login {
    public WebDriver driver;

    By signIn = By.linkText("Sign In");
    By userName = By.id("email");
    By password = By.id("pass");
    By loginButton = By.id("send2");
    By welcome = By.cssSelector("span[class='logged-in']");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement signIn() {
        return driver.findElement(signIn);
    }

    public WebElement userName() {
        return driver.findElement(userName);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement welcome() {
        return driver.findElement(welcome);
    }
}
