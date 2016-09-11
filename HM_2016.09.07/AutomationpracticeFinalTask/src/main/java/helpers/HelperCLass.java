package helpers;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;


public class HelperCLass {
    public  static  void attachFile( String filePath,By locators) {
        File file = new File(filePath);
        $(locators).sendKeys(file.getAbsolutePath());
    }
}
