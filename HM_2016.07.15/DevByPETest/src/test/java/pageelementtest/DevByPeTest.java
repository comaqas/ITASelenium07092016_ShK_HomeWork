package pageelementtest;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageelement.HeadPageElement;
import pageobject.CompaniesPageObject;
import pageobject.LentaPageObject;
import pageobject.SalariesPageObject;
import pageobject.VacanciesPageObject;

/**
 * Created by user on 27.07.2016.
 */
public class DevByPeTest extends TestBase {
    @Test
    public void devByTest() {
        CompaniesPageObject companiesPage = new CompaniesPageObject(driver);
        HeadPageElement.lentaClick(driver);
        Assert.assertTrue(LentaPageObject.isLogoDisplayed(driver));
        HeadPageElement.companiesClick(driver);
        Assert.assertTrue(companiesPage.isIsSoft());
        HeadPageElement.salariesClick(driver);
        Assert.assertTrue(SalariesPageObject.isItSalaryTextDislpayed(driver));
        HeadPageElement.vacanciesClick(driver);
        Assert.assertTrue(VacanciesPageObject.isSearchVacanciesTextDisplyed(driver));

    }
}
