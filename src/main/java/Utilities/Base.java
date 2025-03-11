package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties properties;

    @BeforeClass
    public void setupApplication() {

        Reporter.log("=====Browser Session Started=====", true);

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com");

        Reporter.log("=====Application Started=====", true);

        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void closeApplication() {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
