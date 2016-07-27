package simpleafactory;

import core.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.mailruemailcalc.MailRuEmailPageSimpleFactory;
import pages.mailrulogin.MailRuLoginPageSimpleFactory;


public class MailRuSimpleFactoryTest extends TestBase {

    @Test
    public void mailRuSimpleFactoryTest(){


        String domain = "bk.ru";
        String login = "strong.zubovich";
        String password = "ZXCvbn123!";


        MailRuLoginPageSimpleFactory mailRuLoginPage = PageFactory.initElements(driver,MailRuLoginPageSimpleFactory.class);
        MailRuEmailPageSimpleFactory  mailRuPage = PageFactory.initElements(driver,MailRuEmailPageSimpleFactory.class);


        mailRuLoginPage.setLogin(login);
        mailRuLoginPage.setPasswordField(password);
        mailRuLoginPage.setDomainField(domain);
        mailRuLoginPage.authButton();


        mailRuPage.isAuthSucced();
        mailRuPage.chooseAllLetters();
        mailRuPage.showAllLettersCount();


    }

}
