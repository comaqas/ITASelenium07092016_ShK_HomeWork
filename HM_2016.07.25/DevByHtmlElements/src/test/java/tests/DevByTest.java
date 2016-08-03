package tests;

import blocks.NavigateBlock;
import core.TestBase;
import helpers.HelperClass;
import org.testng.annotations.Test;
import pages.CompaniesPageObject;
import pages.LentaPageObject;
import pages.SalariesPageObject;
import pages.VacanciesPageObject;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 28.07.2016.
 */
public class DevByTest extends TestBase {
    public DevByTest(){
        HtmlElementLoader.populatePageObject(this,driver);
    }
    private  NavigateBlock navigateBlock;


    private final LentaPageObject lentaPageObject = new LentaPageObject(driver);
    private final CompaniesPageObject companiesPageObject = new CompaniesPageObject(driver);
    private final SalariesPageObject salariesPageObject = new SalariesPageObject(driver);
    private final VacanciesPageObject vacanciesPageObject = new VacanciesPageObject(driver);

    private  String lentaScreen="lentaScreen";
    private  String companiesScreen="companiesScreen";
    private  String salariesScreen="salariesScreen";
    private  String vacanciesScreen="vacanciesScreen";

    @Test
    public void devBYHtmlTest() throws IOException {


        navigateBlock.lentaLinkClick();
        assertTrue(lentaPageObject.isLogoDisplayed(driver));
        HelperClass.takeScreenShoot(driver,lentaScreen);

        navigateBlock.companiesLinkClick();
        assertTrue(companiesPageObject.isIsSoft(driver));
        HelperClass.takeScreenShoot(driver,companiesScreen);


        navigateBlock.salariesLinkClick();
        assertTrue(salariesPageObject.isItSalaryTextDislpayed(driver));
        HelperClass.takeScreenShoot(driver,salariesScreen);



        navigateBlock.vacanciesLinkClick();
        assertTrue(vacanciesPageObject.isSearchVacanciesTextDisplyed(driver));
        HelperClass.takeScreenShoot(driver,vacanciesScreen);
        ;
    }
}
