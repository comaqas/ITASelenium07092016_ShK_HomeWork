package pages.mailrulogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MailRuLoginPageDynamic {

    private final By LOGIN_FIELD = By.id("mailbox__login");

    private final By PASSWORD_FIELD = By.id("mailbox__password");

    private final By AUTH_BUTTON = By.cssSelector(".w-mailbox__auth__button.w-mailbox__auth__button_inner");

    private final By BKRU = By.cssSelector("#mailbox__login__domain>option[value=\"bk.ru\"]");

    private final By MAILRU = By.xpath("//option[@value=\"mail.ru\"]");

    private final By INBOXRU = By.xpath("//option[@value=\"inbox.ru\"]");

    private WebDriver driver;

    public MailRuLoginPageDynamic(WebDriver driver) {

        this.driver = driver;
    }

    public void setLogin(String login) {

        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.sendKeys(login);


    }

    public void setPassword(String password) {

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);

    }

    public void chooseDomain(String domain) {


        WebElement domainChoice;
        switch (domain) {

            case "bk.ru":
                domainChoice = driver.findElement(BKRU);
                domainChoice.click();
                break;
            case "mail.ru":
                domainChoice = driver.findElement(MAILRU);
                domainChoice.click();
                break;
            case "inbox.ru":
                domainChoice = driver.findElement(INBOXRU);
                domainChoice.click();
            default:
                throw new IllegalArgumentException("Invalid mail domain" + domain);
        }
    }

    public void authButtonClick() {
        WebElement authButton = driver.findElement(AUTH_BUTTON);
        authButton.click();

    }


}
