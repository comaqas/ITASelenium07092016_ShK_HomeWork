package pages.mailruemailcalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.fail;

/**
 * Created by user on 26.07.2016.
 */
public class MailRuEmailPageFlow {



    private final By ALL_INBOX_CHECBOX = By.cssSelector(".b-dropdown.b-dropdown_selectAll");

    private final By ALL_INBOX_SELECT = By.cssSelector(".b-dropdown__list__item[ data-name = \"all\"]");

    private final By ALL_INBOX_LETTERS_LOCS = By.xpath("//a[@class='pseudo-link']");

    private final By SELECT_LETTERS_COUNT_TEXT = By.xpath(".//div[@class='b-announcement__text']");

    private WebDriver driver;

    public  MailRuEmailPageFlow (WebDriver driver) {
        this.driver = driver;
    }


    public  MailRuEmailPageFlow chooseAllLetters() {

        WebElement allInboxCheckbox = driver.findElement(ALL_INBOX_CHECBOX);
        allInboxCheckbox.click();
        WebElement allInboxSelect = driver.findElement(ALL_INBOX_SELECT);
        allInboxSelect.click();
        WebElement allInboxLettersLocs = driver.findElement(ALL_INBOX_LETTERS_LOCS);
        allInboxLettersLocs.click();

        return this;
    }


    public MailRuEmailPageFlow showAllLetters() {
        WebElement selectedLettersCountText = driver.findElement(SELECT_LETTERS_COUNT_TEXT);

        String text = selectedLettersCountText.getText();

        String letters = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                letters += ch;
            }


        }
        System.out.println("There are " + letters + "inbox letters.");

        return  this;
    }



}
