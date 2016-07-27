package pages.mailrulogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MailRuLoginPageFlow {


    private final By LOGIN_FIELD = By.id("mailbox__login");

    private final By PASSWORD_FIELD = By.id("mailbox__password");

    private final By DOMAIN_FIELD = By.id("mailbox__login__domain");

    private final By AUTH_BUTTON = By.cssSelector(".w-mailbox__auth__button.w-mailbox__auth__button_inner");

    private WebDriver driver;

    public MailRuLoginPageFlow(WebDriver driver) {
        this.driver = driver;

    }

    public MailRuLoginPageFlow setLogin(String login) {
        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.sendKeys(login);
        return this;
    }


    public MailRuLoginPageFlow setPassword(String password) {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys(password);
        return this;
    }

    public MailRuLoginPageFlow chooseDomain(String domain) {
        Select select = new Select(driver.findElement(DOMAIN_FIELD));
        select.selectByValue(domain);

        return this;
    }

    public  MailRuLoginPageFlow authButtonClick(){
        WebElement authButton = driver.findElement(AUTH_BUTTON);
        authButton.click();
        return  this;
    }
}
