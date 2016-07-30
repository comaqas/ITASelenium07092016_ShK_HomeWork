package tests;

import blocks.NavigateBlock;
import core.TestBase;
import org.testng.annotations.Test;
import pages.CompaniesPageObject;
import pages.LentaPageObject;
import pages.SalariesPageObject;
import pages.VacanciesPageObject;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 28.07.2016.
 */
public class DevByTest extends TestBase {


    private NavigateBlock navigateBlock;
    //private WebDriver driver;
    private final LentaPageObject lentaPageObject = new LentaPageObject(driver);
    private final CompaniesPageObject companiesPageObject = new CompaniesPageObject(driver);
    private final SalariesPageObject salariesPageObject = new SalariesPageObject(driver);
    private final VacanciesPageObject vacanciesPageObject = new VacanciesPageObject(driver);


    @Test
    public void devBYHtmlTest() {


       // navigateBlock.lentaLinkClick();  вызов метода таким образом выкидывает NullPointerException
        lentaPageObject.lentaLinkClick();
        assertTrue(lentaPageObject.isLogoDisplayed(driver));
       lentaPageObject.companiesLinkClick();

        //navigateBlock.companiesLinkClick();
        assertTrue(companiesPageObject.isIsSoft(driver));
        companiesPageObject.salariesLinkClick();

        //navigateBlock.salariesLinkClick();
        assertTrue(salariesPageObject.isItSalaryTextDislpayed(driver));
        salariesPageObject.vacanciesLinkClick();
       // navigateBlock.vacanciesLinkClick();
        assertTrue(vacanciesPageObject.isSearchVacanciesTextDisplyed(driver));
    }
}
