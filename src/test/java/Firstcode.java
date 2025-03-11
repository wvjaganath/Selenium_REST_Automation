import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Firstcode extends Base {

    @Test
    public void login() throws IOException {

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.linkText("Sign In"));
        textBox.click();
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys(properties.getProperty("username"));
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys(properties.getProperty("password"));
        driver.findElement(By.id("send2")).click();


        WebElement welcome = driver.findElement(By.cssSelector("span[class='logged-in']"));

        if (welcome.getText().isEmpty()) {
            System.out.println("Login failed");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(d -> driver.findElement(By.cssSelector("span[class='logged-in']")).getText().equals("Welcome, test user!"));
            System.out.println(driver.findElement(By.cssSelector("span[class='logged-in']")).getText());
        }

    }
}
