package pages;

import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class OrderHistoryPage  {

    private static final By LAST_ORDER = Locators.get("lastOrder");


    public static String getLastOrderNumber(){

        return $(LAST_ORDER).getText();
    }

}
