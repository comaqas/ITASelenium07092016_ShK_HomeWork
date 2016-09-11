package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage {


    private static final By EMAIL_CREATE_FIELD = Locators.get("EmailCreateField");
    private static final By CREATE_ACCOUNT_BUTTON = Locators.get("CreateAccountButton");
    private static final By USER_EMAIL_FIELD = Locators.get("UserEmailField");
    private static final By USER_PASSWORD_FIELD = Locators.get("UserPasswordField");
    private static final By SIGN_IN_BUTTON = Locators.get("SignInButton");
    private static final By ERROR_MESSAGE = Locators.get("ErrorMessage");

    public static void setEmailCreateField() {

        String email = HelperRandomClass.getRandomEmail();
       $(EMAIL_CREATE_FIELD).sendKeys(email);
    }

    public static void clickCreateAccount(){

        $(CREATE_ACCOUNT_BUTTON).click();
    }


    public static void loginAs( String email, String password)  {

        $(USER_EMAIL_FIELD).sendKeys(email);
        $(USER_PASSWORD_FIELD).sendKeys(password);
        $(SIGN_IN_BUTTON).click();

    }


    public static String getErrorMessageText(){
        return $(ERROR_MESSAGE).getText();
    }

}
