package blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by user on 27.07.2016.
 */

@Name("DevByNavigateBlock")
@Block(@FindBy(css=".dev-container.header-nav"))
public class NavigateBlock  extends HtmlElement{

    @FindBy(css = "a[href=\"https://dev.by/lenta\"]")
    WebElement lentaLink;
    @FindBy(css = "a[href=\"https://companies.dev.by/\"]")
    WebElement companiesLink;
    @FindBy(css = "a[href=\"https://jobs.dev.by/\"]")
    WebElement vacanciesLink;
    @FindBy(css = "a[href=\"https://salaries.dev.by/\"]")
    WebElement salariesLink;


    public void lentaLinkClick(){
        lentaLink.click();
    }

    public void companiesLinkClick(){
        companiesLink.click();
    }

    public void vacanciesLinkClick(){
        vacanciesLink.click();
    }

    public void salariesLinkClick(){
        salariesLink.click();
    }

}
