package pages;

import com.codeborne.selenide.Condition;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.HelperCLass.attachFile;


public class ContactUsPage {


    private static final By SUBJECT_HEADING = Locators.get("SubjectHeading");
    private static final By EMAIL_ADDRESS = Locators.get("EmailAddress");
    private static final By ORDER_REFERENCE = Locators.get("OrderReference");
    private static final By ATTACH_FILE = Locators.get("AttachFile");
    private static final By MESSAGE_AREA = Locators.get("MessageArea");
    private static final By CONTACT_US_CONFIRM = Locators.get("ContactUsConfirm");


    public static void setSubjectHeading( String email, String filePath,String  message) {
        $(SUBJECT_HEADING).waitUntil(Condition.present,3500).sendKeys("Webmaster");
        $(EMAIL_ADDRESS).setValue(email);
        attachFile( filePath, ATTACH_FILE);
        $(MESSAGE_AREA).setValue(message);
        $(CONTACT_US_CONFIRM).click();

    }


}

