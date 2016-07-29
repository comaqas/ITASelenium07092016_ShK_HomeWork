package tests;

import blocks.NavigateBlock;
import core.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompaniesPageObject;
import pages.LentaPageObject;
import pages.SalariesPageObject;
import pages.VacanciesPageObject;

/**
 * Created by user on 28.07.2016.
 */
public class DevByTest extends TestBase{


    private NavigateBlock navigateBlock;
    private WebDriver driver;
    private  final LentaPageObject lentaPageObject = new LentaPageObject(driver);
    private  final CompaniesPageObject companiesPageObject = new CompaniesPageObject(driver);
    private  final SalariesPageObject salariesPageObject = new SalariesPageObject(driver);
    private  final VacanciesPageObject vacanciesPageObject = new VacanciesPageObject(driver);

    @Test
    public  void devBYHtmlTest() {


        navigateBlock.lentaLinkClick();
        Assert.assertTrue(lentaPageObject.isLogoDisplayed(driver));
        navigateBlock.companiesLinkClick();
        Assert.assertTrue(companiesPageObject.isIsSoft(driver));
        navigateBlock.salariesLinkClick();
        Assert.assertTrue(salariesPageObject.isItSalaryTextDislpayed(driver));
        navigateBlock.vacanciesLinkClick();
        Assert.assertTrue(vacanciesPageObject.isSearchVacanciesTextDisplyed(driver));
}
}
