package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 27.07.2016.
 */
public class SalariesPageObject {

    private WebDriver driver;

    private final By IT_SALARY_TEXT = By.cssSelector(".input.info-count>h3");

    public SalariesPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isItSalaryTextDislpayed(WebDriver driver) {

        WebElement itSalaryText = driver.findElement(IT_SALARY_TEXT);

        if (!itSalaryText.getText().equals("Зарплата в ИТ")) {
            return false;
        }
        return true;
    }


}
