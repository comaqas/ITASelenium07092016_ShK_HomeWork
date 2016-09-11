package pages;

import com.codeborne.selenide.Condition;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class ShoppingCartPage {

    private static final By PRODUCT_QUANTITY = Locators.get("ProductQuantity");
    private static final By DELETE_ICON = Locators.get("DeleteIcon");
    private static final By EMPTY_CART_ALERT = Locators.get("EmptyCartAlert");
    private static final By CHECKOUT_BUTTON = Locators.get("CheckoutButton");
    private static final By AGREE_CHECKBOX = Locators.get("agreeCheckbox");
    private static final By PAY_BY_CHECK_BUTTON = Locators.get("payByCheckButton");
    private static final By SIGN_IN_CHEKOUT = Locators.get("SignInCheckOut");
    private static final By PROCESS_ADRESS_CHECKOUT = Locators.get("ProcessAddressCheckout");
    private static final By SUCCESS_ALERT = Locators.get("successAlert");
    private static final By ORDER_CONFIRMATION_BOX = Locators.get("orderConfirmationBox");
    private static final By ORDER_HISTORY_LINK = Locators.get("orderHistoryLink");

    public static void deleteFromCart() throws InterruptedException {

        $(DELETE_ICON).waitUntil(Condition.appear,4000).click();
        Thread.sleep(5000);
    }

    public static boolean isProductQuantityDisplayed() {

        return $(PRODUCT_QUANTITY).waitUntil(Condition.present, 3000).isDisplayed();
    }

    public static boolean isShoppingCartIsEmpty() {
        return $(EMPTY_CART_ALERT).waitUntil(Condition.present, 3000).isDisplayed();
    }

    public static void clickCheckoutButton() {
        $(CHECKOUT_BUTTON).waitUntil(Condition.present, 3000).click();

    }

    public static void clickSignInCheckout() {

        $(SIGN_IN_CHEKOUT).click();
    }

    public static void checkAgreeCheckBox() {

        $(AGREE_CHECKBOX).shouldBe(Condition.visible).click();

    }

    public static void clickPayByCheckButton() {

        $(PAY_BY_CHECK_BUTTON).click();
    }

    public static void clickProcessAddressCheckout() {
        $(PROCESS_ADRESS_CHECKOUT).click();
    }

    public static boolean isSuccessAlertPresent() {

        return $(SUCCESS_ALERT).isDisplayed();
    }

    public static String buyingAndGettingOrderNumberSignedIn() {

        clickCheckoutButton();
        clickProcessAddressCheckout();
        checkAgreeCheckBox();
        clickCheckoutButton();
        clickPayByCheckButton();
        clickProcessAddressCheckout();

        String orderConfirmationText = $(ORDER_CONFIRMATION_BOX).getText();
        String wordBeforeOrderNumber = "reference";
        int beginIndex = orderConfirmationText.indexOf(wordBeforeOrderNumber) + wordBeforeOrderNumber.length() + 1;
        int orderNumberLength = 9;
        int endIndex = beginIndex + orderNumberLength;
        String orderNumber = orderConfirmationText.substring(beginIndex, endIndex);

        return orderNumber;

    }


    public static void navigateToOrderHistoryPage() {

        $(ORDER_HISTORY_LINK).click();
    }


}
