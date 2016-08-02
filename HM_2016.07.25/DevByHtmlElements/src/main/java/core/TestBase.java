package core;

import blocks.NavigateBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 28.07.2016.
 */
public class TestBase {

    /*protected WebDriver driver;
    @BeforeTest
    public  void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.by/");
    }

    @AfterTest
    public  void teardown(){
        driver.close();
    }*/

    protected WebDriver driver;

    public TestBase() {
        System.setProperty("phantomjs.binary.path", "d://phantomjs-2.1.1-windows//bin//phantomjs.exe");
        driver = new PhantomJSDriver();
    }

    @BeforeTest
    public void setup() {

        NavigateBlock navigateBlock;
        driver.get("https://dev.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


       /* @AfterTest
        public void teardown(){
            driver.quit();
        }
    }*/
}