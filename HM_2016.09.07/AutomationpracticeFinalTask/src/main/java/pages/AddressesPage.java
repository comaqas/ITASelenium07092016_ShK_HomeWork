package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class AddressesPage {

    private static final By ADD_NEW_ADDRESS_BUTTON = Locators.get("addNewAddressButton");
    private static final By ADDRESS = Locators.get("address");
    private static final By CITY = Locators.get("city");
    private static final By STATE  = Locators.get("state");
    private static final By POST_CODE = Locators.get("postCode");
    private static final By HOME_PHONE = Locators.get("homePhone");
    private static final By MOBILE_PHONE = Locators.get("mobilePhone");
    private static final By ADDRESS_TITLE = Locators.get("addressTitle");
    private static final By SAVE_BUTTON = Locators.get("saveButton");
    private static final By NEW_ADDRESS = Locators.get("newAddress");




    public static void addNewAddress(String addressTitle){

        String address = HelperRandomClass.getRandomString();
        String city = HelperRandomClass.getRandomString();
        String state= HelperRandomClass.getRandomState();
        String postCode = HelperRandomClass.getRandomPostCode();
        String homePhone = HelperRandomClass.getRandomPhoneNumber();
        String mobilePhone = HelperRandomClass.getRandomPhoneNumber();

        $(ADD_NEW_ADDRESS_BUTTON).click();
        $(ADDRESS).sendKeys(address);
        $(CITY).sendKeys(city);
        $(STATE).sendKeys(state);
        $(POST_CODE).sendKeys(postCode);
        $(HOME_PHONE).sendKeys(homePhone);
        $(MOBILE_PHONE).sendKeys(mobilePhone);
        $(ADDRESS_TITLE).clear();
        $(ADDRESS_TITLE).sendKeys(addressTitle);
        $(SAVE_BUTTON).click();


    }

    public static String getNewAddressTitle() {

        return $(NEW_ADDRESS).getText();
    }


}
