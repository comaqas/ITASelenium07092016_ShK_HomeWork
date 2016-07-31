package pages.mailruemailcalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MailRuEmailPageStatic {
    private static final By MAIL_TAB = By.id("b-letters");

    private static final By ALL_INBOX_CHECBOX = By.cssSelector(".b-dropdown.b-dropdown_selectAll");

    private static final By ALL_INBOX_SELECT = By.cssSelector(".b-dropdown__list__item[ data-name = \"all\"]");

    private static final By ALL_INBOX_LETTERS_LOCS = By.xpath("//a[@class='pseudo-link']");

    private static final By SELECT_LETTERS_COUNT_TEXT = By.xpath(".//div[@class='b-announcement__text']");

    private static final By LETTERS_ON_PAGE = By.cssSelector("div.b-datalist__item__panel");
    private static final By NEXT_PAGE_BUTTON = By.cssSelector("div[data-name='next']");
    private static final By NEXT_PAGE_ARROW = By.cssSelector("i.ico_toolbar_arrow_right");

    private static   int numberOfLetters = 0;
    private static  final String atributeName = "class";
    private static  final  String DisableStateFlag = "b-toolbar__btn_disabled";
    public static void chooseAllLetters(WebDriver driver) {

        WebElement allInboxCheckbox = driver.findElement(ALL_INBOX_CHECBOX);
        allInboxCheckbox.click();
        WebElement allInboxSelect = driver.findElement(ALL_INBOX_SELECT);
        allInboxSelect.click();
        WebElement allInboxLettersLocs = driver.findElement(ALL_INBOX_LETTERS_LOCS);
        allInboxLettersLocs.click();


    }

    public static int showAllLetters(WebDriver driver) {
        while (true){
            List<WebElement> lettersOnThePage = driver.findElements(LETTERS_ON_PAGE);
            numberOfLetters += lettersOnThePage.size();

            WebElement nextPageButton = driver.findElement(NEXT_PAGE_BUTTON);
            WebElement nextPageArrow = driver.findElement(NEXT_PAGE_ARROW);

            if (!nextPageButton.getAttribute(atributeName).contains(DisableStateFlag)) {
                nextPageArrow.click();
            } else {
                break;
            }
        }
        return numberOfLetters;
    }






    public static boolean isAuthSucced(WebDriver driver) {
        WebElement userEmail = driver.findElement(MAIL_TAB);
        if (!userEmail.isDisplayed()) {
            return false;

        }
        return true;
    }


}
