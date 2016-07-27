package statictest;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mailruemailcalc.MailRuEmailPageStatic;
import pages.mailrulogin.MailRuLoginPageStatic;


public class MailRuStaticTest extends TestBase {
    @Test
    public  void mailRuStaticTest() {
        String domain = "bk.ru";
        String login = "strong.zubovich";
        String password = "ZXCvbn123!";

        MailRuLoginPageStatic.setLogin(driver,login );
        MailRuLoginPageStatic.setPassword(driver,password);
        MailRuLoginPageStatic.chooseDomain(driver,domain);
        MailRuLoginPageStatic.authButtonClick(driver);

        Assert.assertTrue(MailRuEmailPageStatic.isAuthSucced(driver));
        MailRuEmailPageStatic.chooseAllLetters(driver);
        MailRuEmailPageStatic.showAllLetters(driver);

    }
}