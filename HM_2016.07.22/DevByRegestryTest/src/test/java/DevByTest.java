import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import settings.TestBase;

/**
 * Created by user on 01.08.2016.
 */
public class DevByTest extends TestBase {

    @Test
    public void regestryTest(){


        
        MainPage.clickRegistrationLink(driver);
        RegistrationPage.setRegistrationFormIncorrect(driver);

        Assert.assertTrue(RegistrationPage.isUsernameErrorMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USERNAME_ERROR_MESSAGE)
                .getText(),"* Минимум 2 символа(ов)\n* Запрещены специальные символы");

        Assert.assertTrue(RegistrationPage.isUserPasswordConfirmationMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USER_PASSWORD_CONFIRMATION_ERROR_MESSAGE).getText(),"* Поля не совпадают");

        Assert.assertTrue(RegistrationPage.isUserAgreeErrorMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USER_AGREE_ERROR_MESSAGE).getText(),"* Необходимо отметить");


    }


}
