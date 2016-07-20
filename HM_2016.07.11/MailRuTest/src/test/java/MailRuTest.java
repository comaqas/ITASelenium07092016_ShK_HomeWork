import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 20.07.2016.
 */
public class MailRuTest {

    @Test
    public void mailRuTest() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://mail.ru/");


        WebElement login = driver.findElement(By.cssSelector("#mailbox__login"));

        login.sendKeys("strong.zubovich");

        WebElement password = driver.findElement(By.cssSelector("#mailbox__password"));
        password.sendKeys("ZXCvbn123!");


        WebElement loginDomain = driver.findElement(By.id("mailbox__login__domain"));
        loginDomain.click();
        WebElement bkRu = driver.findElement(By.xpath("//option[@value=\"bk.ru\"]"));

        bkRu.click();

        login.submit();
        List<WebElement> allMails = driver.findElements(By.xpath("//div[@class=\"b-datalist__item__body\"]//div[@class=\"b-checkbox__box\"]"));

        System.out.println(allMails.size() + "bla");


        for (WebElement allMail : allMails) {

            allMail.click();

        }

        WebElement nextMailPage = driver.findElement(By.cssSelector(".b-toolbar__btn.b-toolbar__btn_last.js-shortcut"));
        nextMailPage.click();

        WebElement allLettersCheckBox = driver.findElement(By.xpath("//div[@class='b-toolbar__group']/div[1]"));
        allLettersCheckBox.click();
        WebElement allLettersSelect = driver.findElement(By.xpath("//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']"));
        allLettersSelect.click();
        WebElement allInboxLettersLocs = driver.findElement(By.xpath("//a[@class='pseudo-link']"));
        allInboxLettersLocs.click();


        WebElement selectedLettersCountText = driver.findElement(By.xpath(".//div[@class='b-announcement__text']"));

        String text = selectedLettersCountText.getText();

        String letters = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                letters += ch;
            }


        }
        System.out.println("There are " + letters + "inbox letters.");


    }
}
