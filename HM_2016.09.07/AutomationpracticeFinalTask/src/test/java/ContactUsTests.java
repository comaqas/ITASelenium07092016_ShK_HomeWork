import core.TestBase;
import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static elements.Header.contactUsClick;
import static pages.ContactUsPage.setSubjectHeading;


public class ContactUsTests extends TestBase {

    private static final By CONTACT_US_ALERT_SUCCES = Locators.get("ContactUsAlertSuccess");
    private static final By CONTACT_US_ALERT_MESSAGE_ERROR = Locators.get("ContactUsAlertMessageError");


    private String emailForContactUs = "kirill123@gmail.com";
    private String filePath = "Example.txt";
    private String succesAlert = "Your message has been successfully sent to our team.";
    private String messageErrorAlert = "The message cannot be blank.";
    private String nullMessage = null;
    private String message = HelperRandomClass.getRandomString();

    @Test
    public void contactUsFillTest() {

        contactUsClick();

        setSubjectHeading( emailForContactUs, filePath, message);

        Assert.assertEquals($(CONTACT_US_ALERT_SUCCES).getText(), succesAlert);

    }



    @Test
    public void contactUsErrorFillTest() {
        contactUsClick();

        setSubjectHeading( emailForContactUs, filePath, nullMessage);

        Assert.assertEquals($(CONTACT_US_ALERT_MESSAGE_ERROR).getText(), messageErrorAlert);
    }
}
