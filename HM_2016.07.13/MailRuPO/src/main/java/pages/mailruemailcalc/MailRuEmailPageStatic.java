package pages.mailruemailcalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailRuEmailPageStatic {
    private static final By MAIL_TAB = By.id("b-letters");

    private static final By ALL_INBOX_CHECBOX = By.cssSelector(".b-dropdown.b-dropdown_selectAll");

    private static final By ALL_INBOX_SELECT = By.cssSelector(".b-dropdown__list__item[ data-name = \"all\"]");

    private static final By ALL_INBOX_LETTERS_LOCS = By.xpath("//a[@class='pseudo-link']");

    private static final By SELECT_LETTERS_COUNT_TEXT = By.xpath(".//div[@class='b-announcement__text']");

    public static void chooseAllLetters(WebDriver driver) {

        WebElement allInboxCheckbox = driver.findElement(ALL_INBOX_CHECBOX);
        allInboxCheckbox.click();
        WebElement allInboxSelect = driver.findElement(ALL_INBOX_SELECT);
        allInboxSelect.click();
        WebElement allInboxLettersLocs = driver.findElement(ALL_INBOX_LETTERS_LOCS);
        allInboxLettersLocs.click();


    }

    public static void showAllLetters(WebDriver driver) {
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


    }

    public static boolean isAuthSucced(WebDriver driver) {
        WebElement userEmail = driver.findElement(MAIL_TAB);
        if (!userEmail.isDisplayed()) {
            return false;

        }
        return true;
    }


}
