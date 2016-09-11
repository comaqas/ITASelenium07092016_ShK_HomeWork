package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class Utils {

    @Attachment(value = "{0}", type = "image/png")
    public static byte[] makeScreenshot(String name) {

        return ((TakesScreenshot) TestBaseF.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
