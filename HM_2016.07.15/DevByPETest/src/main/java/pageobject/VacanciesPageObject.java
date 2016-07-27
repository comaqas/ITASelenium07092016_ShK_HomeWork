package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 27.07.2016.
 */
public class VacanciesPageObject {
    private static final By SEARCH_VACNCIES_TEXT =  By.cssSelector(".column-left>h3");

               public static boolean isSearchVacanciesTextDisplyed(WebDriver driver){
               WebElement searchVacanciesText = driver.findElement(SEARCH_VACNCIES_TEXT);

                     if(!searchVacanciesText.getText().equals("Поиск вакансий:")){
                      return false;
                   }
                return true;
            }
}
