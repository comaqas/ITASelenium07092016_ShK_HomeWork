package pages;

import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    private static final By NEWSLETTER_INPUT = Locators.get("NewsletterInput");
    private static final By SUBMIT_NEWSLETTER_BUTTON = Locators.get("NewsletterSubmitButton");
    private static final By NEWSLETTER_SUCCESS_ALERT = Locators.get("NewsletterSuccessAlert");
    private static final By ACCOUNT = Locators.get("Account");



    public static void setNewsletterInput(String email) {
        $(NEWSLETTER_INPUT).sendKeys(email);
        $(SUBMIT_NEWSLETTER_BUTTON).click();
    }

    public static boolean isNewsletterSuccessAlertPresent() {

        return $(NEWSLETTER_SUCCESS_ALERT).isDisplayed();
    }


    public static boolean isUserSignedIn(){
        return  $(ACCOUNT).isDisplayed();
    }

    public static boolean isUserSignedOut(){
        return  !$(ACCOUNT).isDisplayed();
    }
}
