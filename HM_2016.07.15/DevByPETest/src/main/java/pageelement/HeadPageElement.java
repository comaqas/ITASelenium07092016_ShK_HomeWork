package pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 26.07.2016.
 */
public class HeadPageElement {

    private static final By LENTA = By.cssSelector("a[href=\"https://dev.by/lenta\"]");
    private static final By COMPANIES = By.cssSelector("a[href=\"https://companies.dev.by/\"]");
    private static final By SALARIES = By.cssSelector("a[href=\"https://salaries.dev.by/\"]");
    private static final By VACANCIES = By.cssSelector("a[href=\"https://jobs.dev.by/\"]");


    public static  void lentaClick(WebDriver driver){

        WebElement lenta = driver.findElement(LENTA);
        lenta.click();
    }

    public static  void companiesClick(WebDriver driver){

        WebElement companies = driver.findElement(COMPANIES);
        companies.click();
    }
    public static  void salariesClick(WebDriver driver){

        WebElement salaries = driver.findElement(SALARIES);
        salaries.click();
    }
    public static  void vacanciesClick(WebDriver driver){

        WebElement vacancies = driver.findElement(VACANCIES);
        vacancies.click();
    }
}

