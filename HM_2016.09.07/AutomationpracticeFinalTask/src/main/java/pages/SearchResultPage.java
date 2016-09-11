package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import helpers.Locators;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SearchResultPage {

    private static final By ADD_TO_CART_BUTTON = Locators.get("AddToCartButton");
    private static final By ADD_TO_CART_BUTTON_2 = Locators.get("AddToCartButton2");
    private static final By PROCEED_TO_CHECKOUT = Locators.get("ProceedToCheckout");
    private static final By SEARCH_RESULTS = Locators.get("SearchResultsName");
    private static final By CONTINUE_SHOPPING = Locators.get("ContinueShopping");


    public static boolean isSearchItemDisplayed(String searchItem) {

        return $(SEARCH_RESULTS).getAttribute("title").contains(searchItem);
    }


    public static void addToCart() {

        List<SelenideElement> searchResults = $$(SEARCH_RESULTS);

        int productIndex = searchResults.size() - 1;
        SelenideElement randomItem = searchResults.get((int)Math.random()*(productIndex));
        randomItem.click();
        $(ADD_TO_CART_BUTTON_2).shouldBe(Condition.visible).click();



    }

    public static void proceedToCheckout() {

        $(PROCEED_TO_CHECKOUT).click();
    }

    public static void continueShopping() {
        $(CONTINUE_SHOPPING).click();
    }


}
