package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by AT on 26.07.2016.
 */
public class RegistrationPage {

    public static By USERNAME = Locators.get("UserNameField");
    public static By EMAIL = Locators.get("UserEmailField");
    public static By PASSWORD = Locators.get("UserPasswordField");
    public static By PASSWORD_CONFIRMATION = Locators.get("UserPasswordConfirmationField");
    public static By FIRST_NAME = Locators.get("UserFirstNameField");
    public static By LAST_NAME = Locators.get("UserLastNameField");
    public static By CURRENT_POSITION = Locators.get("UserCurrentPositionField");
    public static By AGREE_CHECKBOX = Locators.get("UserAgreementCheckbox");
    public static By SUBMIT_BUTTON = Locators.get("SubmitButton");
    public static By COMPANY_DROPDOWN_LABEL = Locators.get("UserCompanyDropDownLabel");
    public static By COMPANY_DROPDOWN_INPUT = Locators.get("UserCompanyDropDownInput");
    public static By COMPANY_DROPDOWN_RESULT = Locators.get("UserCompanyDropDownResult");

    public static By USERNAME_ERROR_MESSAGE = Locators.get("UserNameErrorMessage");
    public static By USER_EMAIL_ERROR_MESSAGE = Locators.get("UserEmailErrorMessage");
    public static By USER_PASSWORD_ERROR_MESSAGE = Locators.get("UserPasswordErrorMessage");
    public static By USER_PASSWORD_CONFIRMATION_ERROR_MESSAGE = Locators.get("UserPasswordConfirmationErrorMessage");
    public static By USER_AGREE_ERROR_MESSAGE = Locators.get("UserAgreeErrorMessage");


    private static List<String> itCompanies = Arrays.asList("itransition", "issoft", "epam", "viber", "belhard");


    public static void setRegistrationForm(WebDriver driver) {

        String password = HelperRandomClass.getRandomPassword();

        driver.findElement(USERNAME).sendKeys(HelperRandomClass.getRandomUserName());
        driver.findElement(EMAIL).sendKeys(HelperRandomClass.getRandomEmail());
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys(password);
        driver.findElement(FIRST_NAME).sendKeys(HelperRandomClass.getRandomFirstName());
        driver.findElement(LAST_NAME).sendKeys(HelperRandomClass.getRandomLastName());
        driver.findElement(CURRENT_POSITION).sendKeys(HelperRandomClass.getRandomString());
        driver.findElement(AGREE_CHECKBOX).click();
        selectCompany(getRandomCompany(itCompanies),driver);
        driver.findElement(SUBMIT_BUTTON).click();

    }


    public static void setRegistrationFormIncorrect(WebDriver driver) {


        driver.findElement(USERNAME).sendKeys(HelperRandomClass.getRandomUserName()+".");
        driver.findElement(EMAIL).sendKeys(HelperRandomClass.getRandomEmail()+"@");
        driver.findElement(PASSWORD).sendKeys(HelperRandomClass.getRandomPassword());
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys(HelperRandomClass.getRandomPassword());
        driver.findElement(FIRST_NAME).sendKeys(HelperRandomClass.getRandomFirstName());
        driver.findElement(LAST_NAME).sendKeys(HelperRandomClass.getRandomLastName());
        driver.findElement(CURRENT_POSITION).sendKeys(HelperRandomClass.getRandomString());
        driver.findElement(AGREE_CHECKBOX).click();
        selectCompany(getRandomCompany(itCompanies),driver);
        driver.findElement(SUBMIT_BUTTON).click();



    }

    public static boolean isUsernameErrorMessageDisplayed(WebDriver driver) {



        return driver.findElement(USERNAME_ERROR_MESSAGE).isDisplayed();
    }

    public static boolean isUserEmailErrorMessageDisplayed(WebDriver driver){

        return driver.findElement(USER_EMAIL_ERROR_MESSAGE).isDisplayed();

    }

    public static boolean isUserPasswordMessageDisplayed(WebDriver driver) {

        return driver.findElement(USER_PASSWORD_ERROR_MESSAGE).isDisplayed();

    }

    public static boolean isUserPasswordConfirmationMessageDisplayed(WebDriver driver) {

        return driver.findElement(USER_PASSWORD_CONFIRMATION_ERROR_MESSAGE).isDisplayed();
    }


    public static boolean isUserAgreeErrorMessageDisplayed(WebDriver driver) {

        return driver.findElement(USER_AGREE_ERROR_MESSAGE).isDisplayed();
    }


    public static void selectCompany(String company, WebDriver driver) {

        driver.findElement(COMPANY_DROPDOWN_LABEL).click();
        driver.findElement(COMPANY_DROPDOWN_INPUT).sendKeys(company);
        driver.findElement(COMPANY_DROPDOWN_RESULT).click();
    }

    private static String getRandomCompany(List<String> list) {

        Random randomizer = new Random();

        return  list.get(randomizer.nextInt(list.size()));
    }


}
