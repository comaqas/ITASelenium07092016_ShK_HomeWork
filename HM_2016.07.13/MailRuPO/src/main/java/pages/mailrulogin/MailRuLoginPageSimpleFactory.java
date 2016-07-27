package pages.mailrulogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MailRuLoginPageSimpleFactory {

    @FindBy(id = "mailbox__login")
    private WebElement loginField ;
    @FindBy (id = "mailbox__password")
    private  WebElement passwordField;
    @FindBy (id = "mailbox__login__domain")
    private  WebElement domainField;
    @FindBy(css = ".w-mailbox__auth__button.w-mailbox__auth__button_inner")
    private  WebElement authButton;

    public void setLogin(String login){

        loginField.sendKeys(login);
    }

    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void setDomainField(String domain){

        Select select = new Select(domainField);
        select.selectByValue(domain);
    }

    public void authButton(){
        authButton.click();
    }




}


