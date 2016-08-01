package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by AT on 27.07.2016.
 */
public class TestBase {
    public static final  String BASE_LINK = "https://dev.by";
    protected WebDriver driver;

    @BeforeTest
    public void setUp(){

            driver = new FirefoxDriver();

            driver.manage().window().maximize();
            driver.get(BASE_LINK);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }


    @AfterTest
    public void teardown() {

            driver.close();
    }
}
