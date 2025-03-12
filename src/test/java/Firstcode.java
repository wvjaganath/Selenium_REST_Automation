import Pages.Login;
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

        Login login = new Login(driver);
        login.signIn().click();
        login.userName().sendKeys(properties.getProperty("username"));
        login.password().sendKeys(properties.getProperty("password"));
        login.loginButton().click();


        if (login.welcome().getText().isEmpty()) {
            wait.until(d -> login.welcome().getText().equals("Welcome, test user!"));
            System.out.println(login.welcome().getText());
        }

    }
}
