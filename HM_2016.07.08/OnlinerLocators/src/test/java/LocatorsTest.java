import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 12.07.2016.
 */
public class LocatorsTest {

        @Test
        public void onlinerLocators(){
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.get("http://onliner.by/");

            WebElement catalogOnliner = driver.findElement(By.xpath("//a[@href=\"http://catalog.onliner.by/\"]/span[@class=\"b-main-navigation__text\"]"));
            catalogOnliner.click();

                WebElement catalogMobileButton = driver.findElement(By.xpath(".//li[@class=\"catalog-bar__item\"]/a[@href=\"http://catalog.onliner.by/mobile\"]"));
            catalogMobileButton.click();

             WebElement  chooseSamsungProducer = driver.findElement(By.xpath("//li//input[@value=\"samsung\"]"));
                chooseSamsungProducer.click();
                WebElement  chooseHtcProducer = driver.findElement(By.xpath("//li//input[@value=\"htc\"]"));
                    chooseHtcProducer.click();


                WebElement  minPriceInput = driver.findElement(By.cssSelector(".schema-filter__number-input_price[placeholder='от']"));

                minPriceInput.sendKeys("300");

                WebElement  maxPriceInput = driver.findElement(By.xpath(".//*[@id='schema-filter']/div[1]/div[2]/div[2]/div/div[2]/input"));
                maxPriceInput.sendKeys("530");

            WebElement productionData  = driver.findElement(By.xpath("//span[text()=\"2015\"]/..//input[@name=\"filter-number-range__birthday\"]"));
                productionData.click();

            WebElement displaySize = driver.findElement(By.xpath("//span[text()='5 - 5.5\"']/..//span[@class=\"i-checkbox\"]"));

            displaySize.click();//span[text()='5 - 5.5"']/..//span[@class="i-checkbox"]


    }
    //span[text()='5 - 5.5"']/..//input[@name="filter-number-range__mob_displaydiag"]

}
