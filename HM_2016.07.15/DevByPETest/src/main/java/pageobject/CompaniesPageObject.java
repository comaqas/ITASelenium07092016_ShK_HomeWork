package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 27.07.2016.
 */
public class CompaniesPageObject {
    private final By ISSOFT = By.cssSelector("#tablesort [href=\"/issoft\"]");
    private WebDriver driver;
    public CompaniesPageObject(WebDriver driver){
        this.driver=driver;
    }
    public boolean isIsSoft(){
        WebElement isSoft =  driver.findElement(ISSOFT);

        if (!isSoft.isDisplayed()){
            return false;
        }
        return  true;
    }
}
