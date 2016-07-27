package pages.mailruemailcalc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailRuEmailPageSimpleFactory {

    @FindBy(id = "b-letters")
    WebElement mailTab;
    @FindBy(css = ".b-dropdown.b-dropdown_selectAll")
    WebElement allInboxCheckbox;
    @FindBy(css = ".b-dropdown__list__item[ data-name = \\\"all\\\"]")
    WebElement allInboxSelect;
    @FindBy(xpath = "//a[@class='pseudo-link']")
    WebElement allInboxLettersLocs;
    @FindBy(xpath = ".//div[@class='b-announcement__text']")
    WebElement allLettersCountTextSelect;

    public void chooseAllLetters() {
        allInboxCheckbox.click();
        allInboxSelect.click();
        allInboxLettersLocs.click();
    }

    public void showAllLettersCount() {

        String text = allLettersCountTextSelect.getText();

        String letters = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                letters += ch;
            }


        }
        System.out.println("There are " + letters + "inbox letters.");

    }

    public boolean isAuthSucced() {
        if (!mailTab.isDisplayed()) {
            return false;
        }
        return true;
    }


}
