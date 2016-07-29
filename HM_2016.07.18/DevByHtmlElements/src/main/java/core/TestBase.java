package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

/**
 * Created by user on 28.07.2016.
 */
public class TestBase {
    @BeforeTest
    public void setup() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.by/");
    }
}