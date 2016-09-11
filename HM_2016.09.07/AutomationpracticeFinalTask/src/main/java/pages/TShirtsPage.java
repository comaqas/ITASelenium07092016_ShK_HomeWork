package pages;

import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class TShirtsPage {

    private static final By T_SHIRT = Locators.get("tShirt");

    public static boolean isTShirtPresentOnPage(){

        return  $(T_SHIRT).isDisplayed();
    }


}
