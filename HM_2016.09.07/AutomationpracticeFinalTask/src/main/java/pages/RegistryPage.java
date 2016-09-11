package pages;

import com.codeborne.selenide.Condition;
import helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class RegistryPage {


    private static final By MALE_RADIOBUTTON = Locators.get("MaleRadiobutton");
    private static final By FEMALE_RADIOBUTTON = Locators.get("FemaleRadiobutton");
    private static final By FIRST_NAME_INPUT = Locators.get("CustomerFirstnameField");
    private static final By LAST_NAME_INPUT = Locators.get("CustomerLastnameField");
    private static final By PASSWORD_FIELD = Locators.get("PasswordField");
    private static final By DAY_OF_BIRTH = Locators.get("DayBirth");
    private static final By MONTH_OF_BIRTH = Locators.get("MonthBirth");
    private static final By YEAR_OF_BIRTH = Locators.get("YearBirth");
    private static final By COMPANY_FIELD = Locators.get("CompanyField");
    private static final By ADDRESS_FIELD = Locators.get("AddressField");
    private static final By CITY_FIELD = Locators.get("CityField");
    private static final By STATE_SELECT = Locators.get("StateSelect");
    private static final By POST_CODE_FIELD = Locators.get("PostCodeField");
    private static final By MOBILE_PHONE_FIELD = Locators.get("MobileField");
    private static final By ADDRESS_ALIAS = Locators.get("AddressAlias");
    private static final By REGISTER_BUTTON = Locators.get("RegisterButton");


    public static void completeRegistryFormByEntering(String firstname, String lastname, String password, String day,
                                                      String month, String year, String companyName, String address, String city,
                                                      String state, String code, String mobileNumber, String alias) {


        $(MALE_RADIOBUTTON).click();


        $(FIRST_NAME_INPUT).sendKeys(firstname);

        $(LAST_NAME_INPUT).sendKeys(lastname);

        $(PASSWORD_FIELD).sendKeys(password);

        $(DAY_OF_BIRTH).sendKeys(day);

        $(MONTH_OF_BIRTH).sendKeys(month);

        $(YEAR_OF_BIRTH).waitUntil(Condition.present, 5000).sendKeys(year);

        $(COMPANY_FIELD).sendKeys(companyName);

        $(ADDRESS_FIELD).sendKeys(address);

        $(CITY_FIELD).sendKeys(city);

        $(STATE_SELECT).sendKeys(state);

        $(POST_CODE_FIELD).sendKeys(code);

        $(MOBILE_PHONE_FIELD).sendKeys(mobileNumber);

        $(ADDRESS_ALIAS).sendKeys(alias);

        $(REGISTER_BUTTON).click();


    }


}
