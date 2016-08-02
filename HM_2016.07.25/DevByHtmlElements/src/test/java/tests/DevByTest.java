package tests;

import blocks.NavigateBlock;
import core.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pages.CompaniesPageObject;
import pages.LentaPageObject;
import pages.SalariesPageObject;
import pages.VacanciesPageObject;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.io.File;
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


    @Test
    public void devBYHtmlTest() throws IOException {


        navigateBlock.lentaLinkClick();
        assertTrue(lentaPageObject.isLogoDisplayed(driver));
        File lentaScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(lentaScreen,new File("D:\\ATsilenium\\DevByHtmlElements\\src\\main\\resources\\scrennshoots\\lentaScreen.png"));


        navigateBlock.companiesLinkClick();
        assertTrue(companiesPageObject.isIsSoft(driver));
        File companiesScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(companiesScreen,new File("D:\\ATsilenium\\DevByHtmlElements\\src\\main\\resources\\scrennshoots\\companiesScreen.png"));


        navigateBlock.salariesLinkClick();
        assertTrue(salariesPageObject.isItSalaryTextDislpayed(driver));
        File salariesScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(salariesScreen,new File("D:\\ATsilenium\\DevByHtmlElements\\src\\main\\resources\\scrennshoots\\salariesScreen.png"));



        navigateBlock.vacanciesLinkClick();
        assertTrue(vacanciesPageObject.isSearchVacanciesTextDisplyed(driver));
        File vacanciesScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(vacanciesScreen,new File("D:\\ATsilenium\\DevByHtmlElements\\src\\main\\resources\\scrennshoots\\vacanciesScreen.png"));
    }
}
