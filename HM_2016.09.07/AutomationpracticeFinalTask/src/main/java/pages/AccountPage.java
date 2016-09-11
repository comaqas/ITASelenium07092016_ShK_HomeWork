package pages;

import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class AccountPage {

    private static final By ACCOUNT_PAGE_HEADING = Locators.get("AccountPageHeading");
    private static final By PERSONAL_INFORMATION_LINK = Locators.get("PersonalInformationLink");
    private static final By ADDRESSES_LINK = Locators.get("AddressesLink");


    public static boolean isAccountPageHeadingPresent(){

        return $(ACCOUNT_PAGE_HEADING).isDisplayed();
    }

    public static void navigateToPersonalInformationPage(){
        $(PERSONAL_INFORMATION_LINK).click();

    }

    public static void navigateToAddressPage(){

        $(ADDRESSES_LINK).click();
    }

}
