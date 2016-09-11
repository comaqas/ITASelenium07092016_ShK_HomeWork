import core.TestBase;
import elements.Header;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by user on 11.09.2016.
 */
public class AccountTests extends TestBase {
    String userEmail = "kirill.shishko.9214@mail.ru";
    String userPassword = "jerk14__";
    String newAddressTitle = "NEW ADDRESS " + HelperRandomClass.getRandomPostCode();
    String name = "Kirill";
    String lastName = "Shishko";


    @Test
    public void addNewAddressTest() throws InterruptedException {


        Header.clickSignInLink();
        LoginPage.loginAs(userEmail, userPassword);
        AccountPage.navigateToAddressPage();
        AddressesPage.addNewAddress(newAddressTitle);
        Assert.assertEquals(AddressesPage.getNewAddressTitle(), newAddressTitle);

    }


    @Test
    public void assertPersonalInformationTest() {


        Header.clickSignInLink();
        LoginPage.loginAs(userEmail, userPassword);
        AccountPage.navigateToPersonalInformationPage();
        Assert.assertEquals(PersonalInformationPage.getName(), name, "Names don't match!");
        Assert.assertEquals(PersonalInformationPage.getLastName(), lastName, "Last names don't match!");


    }

    @Test
    public void assertSignOutTest() {
        Header.clickSignInLink();
        LoginPage.loginAs(userEmail,userPassword);
        Assert.assertTrue(MainPage.isUserSignedIn());
        Header.clickSignOutLink();
        Assert.assertTrue(MainPage.isUserSignedOut());
    }

}
