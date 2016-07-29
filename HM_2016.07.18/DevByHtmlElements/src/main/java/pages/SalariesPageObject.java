package pages;


import blocks.NavigateBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 27.07.2016.
 */
public class SalariesPageObject {

    private NavigateBlock navigateBlock;

    private  final By IT_SALARY_TEXT = By.cssSelector(".input.info-count>h3");


    public SalariesPageObject(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public    boolean isItSalaryTextDislpayed(WebDriver driver){

        WebElement itSalaryText = driver.findElement(IT_SALARY_TEXT);

        if (!itSalaryText.getText().equals("Зарплата в ИТ")){
            return false;
        }
        return true;
    }



}
