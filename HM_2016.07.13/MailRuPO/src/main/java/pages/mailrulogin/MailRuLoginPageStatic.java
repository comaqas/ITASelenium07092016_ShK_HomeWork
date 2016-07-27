package pages.mailrulogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MailRuLoginPageStatic {


    private static final By LOGIN_FIELD = By.id("mailbox__login");

    private static final By PASSWORD_FIELD = By.id("mailbox__password");

    private static final By DOMAIN_FIELD = By.id("mailbox__login__domain");

    private static final By AUTH_BUTTON = By.cssSelector(".w-mailbox__auth__button.w-mailbox__auth__button_inner");


    public static void setLogin(WebDriver driver, String login) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.sendKeys(login);


    }

    public static void setPassword(WebDriver driver, String password) {

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);

    }

    public static void chooseDomain(WebDriver driver, String domain) {


        Select select = new Select(driver.findElement(DOMAIN_FIELD));
        select.selectByValue(domain);

    }

    public static void authButtonClick(WebDriver driver) {
        WebElement authButton = driver.findElement(AUTH_BUTTON);
        authButton.click();

    }


}
