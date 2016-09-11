import core.TestBase;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.Listener;


@Listeners(Listener.class)
public class SignUpForNewsletterTests extends TestBase {


    @Test
    public void signUpForNewsletterTest(){

        String email = HelperRandomClass.getRandomEmail();

        MainPage.setNewsletterInput(email);
        Assert.assertTrue(MainPage.isNewsletterSuccessAlertPresent());

    }




}
