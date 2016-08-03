package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 03.08.2016.
 */
public  class HelperClass {
    public static void takeScreenShoot(WebDriver driver,String screenShoorName) throws IOException {
       File pageScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreen, new File("D:\\ATsilenium\\DevByHtmlElements\\src\\main\\resources\\scrennshoots\\"+screenShoorName+".png"));
    }
}