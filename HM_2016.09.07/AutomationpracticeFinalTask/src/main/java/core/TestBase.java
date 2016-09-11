package core;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {


    public static final  String BASE_LINK = "http://automationpractice.com/index.php" ;
    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "D:\\sileniumExt\\chromedriver.exe");
        System.setProperty("selenide.browser", "chrome");
        open(BASE_LINK);

    }

    @AfterTest
    public void teardown(){


    }


}
