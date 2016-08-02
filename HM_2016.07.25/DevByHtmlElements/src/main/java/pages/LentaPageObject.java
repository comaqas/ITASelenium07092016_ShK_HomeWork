package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 27.07.2016.
 */
public class LentaPageObject  {

    //private NavigateBlock navigateBlock;
   private  final By DEV_BY_LOGO = By.cssSelector(".header-logo");


    private WebDriver driver;
    public  LentaPageObject(WebDriver driver){this.driver = driver;}
    public  boolean isLogoDisplayed(WebDriver driver){
        WebElement devByLogo = driver.findElement(DEV_BY_LOGO);
        if(!devByLogo.isDisplayed()){
            return false;
        }

        return true;
    }

    /*public  void lentaLinkClick(){navigateBlock.lentaLinkClick();}

    public void companiesLinkClick(){navigateBlock.companiesLinkClick();}
*/



}
