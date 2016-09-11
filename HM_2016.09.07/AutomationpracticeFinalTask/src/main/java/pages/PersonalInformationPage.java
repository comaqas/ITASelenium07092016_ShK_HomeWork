package pages;

import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class PersonalInformationPage {


    private static final By FIRST_NAME = Locators.get("firstName");
    private static final By LAST_NAME = Locators.get("lastName");

    public static String getName() {

        return $(FIRST_NAME).getAttribute("value");
    }

    public static String getLastName() {

        return $(LAST_NAME).getAttribute("value");
    }

}
