package pages;


import blocks.NavigateBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 27.07.2016.
 */
public class VacanciesPageObject {

    private NavigateBlock navigateBlock;

    public  VacanciesPageObject(WebDriver driver){

        HtmlElementLoader.populatePageObject(this,driver);
    }
    private  final By SEARCH_VACNCIES_TEXT =  By.cssSelector(".column-left>h3");

               public  boolean isSearchVacanciesTextDisplyed(WebDriver driver){
               WebElement searchVacanciesText = driver.findElement(SEARCH_VACNCIES_TEXT);

                     if(!searchVacanciesText.getText().equals("Поиск вакансий:")){
                      return false;
                   }
                return true;

            }



}
