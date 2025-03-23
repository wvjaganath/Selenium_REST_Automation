package ShoppingApp;

import Pages.ShoppingApp.Login;
import Utilities.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends Base {

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
