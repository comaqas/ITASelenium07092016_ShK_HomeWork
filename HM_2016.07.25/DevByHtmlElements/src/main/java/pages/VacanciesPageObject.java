package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 27.07.2016.
 */
public class VacanciesPageObject {

    private WebDriver driver;

    public  VacanciesPageObject(WebDriver driver){this.driver = driver;}

    private  final By SEARCH_VACANCIES_TEXT =  By.cssSelector(".column-left>h3");

               public  boolean isSearchVacanciesTextDisplyed(WebDriver driver){
               WebElement searchVacanciesText = driver.findElement(SEARCH_VACANCIES_TEXT);

                     if(!searchVacanciesText.getText().equals("Поиск вакансий:")){
                      return false;
                   }
                return true;

            }



}
