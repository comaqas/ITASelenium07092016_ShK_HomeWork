package pages;


import blocks.NavigateBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 27.07.2016.
 */
public class CompaniesPageObject {

    private NavigateBlock navigateBlock;
    private final By ISSOFT = By.cssSelector("#tablesort [href=\"/issoft\"]");

    public CompaniesPageObject(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }
    public boolean isIsSoft(WebDriver driver){
        WebElement isSoft =  driver.findElement(ISSOFT);

        if (!isSoft.isDisplayed()){
            return false;
        }
        return  true;
    }


    


}
