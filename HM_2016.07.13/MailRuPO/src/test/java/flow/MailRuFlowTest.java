package flow;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mailruemailcalc.MailRuEmailPageFlow;
import pages.mailrulogin.MailRuLoginPageFlow;

/**
 * Created by user on 26.07.2016.
 */
public class MailRuFlowTest extends TestBase {
    @Test
    public void  mailRuFlowTest() {
        MailRuLoginPageFlow loginPage = new MailRuLoginPageFlow(driver);

        MailRuEmailPageFlow emailPage = new MailRuEmailPageFlow(driver);

        String domain = "bk.ru";
        String login = "strong.zubovich";
        String password = "ZXCvbn123!";

        loginPage
                .setLogin(login)
                .setPassword(password)
                .chooseDomain(domain)
                .authButtonClick();

        emailPage
                .chooseAllLetters()
                .showAllLetters();



    }
}
