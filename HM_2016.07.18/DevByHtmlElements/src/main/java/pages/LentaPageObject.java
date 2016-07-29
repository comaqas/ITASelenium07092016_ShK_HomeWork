package pages;


import blocks.NavigateBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 27.07.2016.
 */
public class LentaPageObject  {

    private NavigateBlock navigateBlock;
   private  final By DEV_BY_LOGO = By.cssSelector(".header-logo");


   public  LentaPageObject(WebDriver driver){
       HtmlElementLoader.populatePageObject(this,driver);
    }
    public  boolean isLogoDisplayed(WebDriver driver){
        WebElement devByLogo = driver.findElement(DEV_BY_LOGO);
        if(!devByLogo.isDisplayed()){
            return false;
        }

        return true;
    }






}
