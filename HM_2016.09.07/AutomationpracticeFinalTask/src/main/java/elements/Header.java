package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 11.09.2016.
 */
public class Header {

    private static final By CONTACT_US_LINK = Locators.get("ContactUsLink");
    private static final By CART_PAGE_LINK = Locators.get("CartPageLink");
    private static final By SIGN_IN_LINK = Locators.get("SignInLink");
    private static final By SEARCH_FIELD = Locators.get("SearchField");
    private static final By T_SHIRT_PAGE_LINK = Locators.get("TShirtPageLink");
    private  static  final By SIGN_OUT_LINK = Locators.get("SignOutLink");

    public static void contactUsClick() {

        $(CONTACT_US_LINK).click();
    }

    public  static  void  clickSignOutLink(){
        $(SIGN_OUT_LINK).click();
    }
    public static void clickSignInLink() {
        $(SIGN_IN_LINK).waitUntil(Condition.present,4000).click();
    }

    public static void clickCart() {
        $(CART_PAGE_LINK).click();
    }

    public static void searchFor(String searchItem) {

        SelenideElement searchField = $(SEARCH_FIELD);
        searchField.sendKeys(searchItem);
        searchField.submit();

    }

    public static void tShirtPageClick() {

        $(T_SHIRT_PAGE_LINK).click();
    }
}
