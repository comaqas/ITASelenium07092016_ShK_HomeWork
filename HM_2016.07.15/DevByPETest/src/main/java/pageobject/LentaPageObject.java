package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 27.07.2016.
 */
public class LentaPageObject {

   private  static  final By DEV_BY_LOGO = By.cssSelector(".header-logo");

    public static boolean isLogoDisplayed (WebDriver driver){
        WebElement devByLogo = driver.findElement(DEV_BY_LOGO);
        if(!devByLogo.isDisplayed()){
            return false;
        }

        return true;
    }



}
