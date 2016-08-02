package blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by user on 27.07.2016.
 */

@Name("DevByNavigateBlock")
@Block(@FindBy(css = ".dev-container.header-nav"))
public class NavigateBlock extends HtmlElement {

    @Name("LentaLink")
    @FindBy(css = "a[href=\"https://dev.by/lenta\"]")
    private Link lentaLink;

    @Name("CompaniesLink")
    @FindBy(css = "a[href=\"https://companies.dev.by/\"]")
    private Link companiesLink;

    @Name("VacanciesLink")
    @FindBy(css = "a[href=\"https://jobs.dev.by/\"]")
    private Link vacanciesLink;

    @Name("Salaries Link")
    @FindBy(css = "a[href=\"https://salaries.dev.by/\"]")
    private Link salariesLink;


    public void lentaLinkClick() {
        lentaLink.click();
    }

    public void companiesLinkClick() {
         companiesLink.click();
    }

    public void vacanciesLinkClick() {
        vacanciesLink.click();
    }

    public void salariesLinkClick() {
        salariesLink.click();
    }

}
