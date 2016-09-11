package utils;

import org.openqa.selenium.WebDriver;


public class TestBaseF {
    public static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {

        return DRIVER.get();
    }

}
