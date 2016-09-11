import core.TestBase;
import elements.Header;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import utils.Listener;

import static pages.RegistryPage.completeRegistryFormByEntering;


@Listeners(Listener.class)
public class RegisterTests extends TestBase {

    String firstname = HelperRandomClass.getRandomName();
    String lastname = HelperRandomClass.getRandomName();
    String password = HelperRandomClass.getPassword();
    String day = HelperRandomClass.getRandomDay();
    String month = HelperRandomClass.getRandomMonth();
    String year = HelperRandomClass.getRandomYear();
    String companyName = HelperRandomClass.getRandomString();
    String address = HelperRandomClass.getRandomString();
    String state = HelperRandomClass.getRandomState();
    String mobileNumber = HelperRandomClass.getRandomPhoneNumber();
    String city = HelperRandomClass.getRandomString();
    String code = HelperRandomClass.getRandomPostCode();
    String alias = "ADDRESS " + HelperRandomClass.getRandomString();



    @Test
    public void registrationTest() throws InterruptedException {

        Header.clickSignInLink();
        LoginPage.setEmailCreateField();
        LoginPage.clickCreateAccount();
        completeRegistryFormByEntering(firstname, lastname, password, day,
                month, year, companyName, address, city,
                state, code, mobileNumber, alias);
        Assert.assertTrue(AccountPage.isAccountPageHeadingPresent());

    }
}
