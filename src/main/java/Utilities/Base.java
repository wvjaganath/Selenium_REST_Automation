package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties properties;
    public static WebDriverWait wait;

    @BeforeClass
    public void setupApplication() {

        Reporter.log("=====Browser Session Started=====", true);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

//        driver.get("https://magento.softwaretestingboard.com");
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        Reporter.log("=====Application Started=====", true);

        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
