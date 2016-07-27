package dynamic;


import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mailruemailcalc.MailRuEmailPageDynamic;
import pages.mailrulogin.MailRuLoginPageDynamic;

public class MailRuDynamicTest extends TestBase {

    @Test
    public void loginTest() {
        MailRuLoginPageDynamic mailRuLoginPage = new MailRuLoginPageDynamic(driver);

        MailRuEmailPageDynamic mailRuEmailPageDynamic = new MailRuEmailPageDynamic(driver);


        String domain = "bk.ru";
        String login = "strong.zubovich";
        String password = "ZXCvbn123!";


        mailRuLoginPage.setLogin(login);
        mailRuLoginPage.setPassword(password);
        mailRuLoginPage.chooseDomain(domain);
        mailRuLoginPage.authButtonClick();


        mailRuEmailPageDynamic.chooseAllLetters();
        mailRuEmailPageDynamic.showAllLetters();
       Assert.assertTrue(mailRuEmailPageDynamic.isAuthSucced());
    }


}
