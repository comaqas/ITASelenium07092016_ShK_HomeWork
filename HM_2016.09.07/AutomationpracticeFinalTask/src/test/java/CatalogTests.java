import core.TestBase;
import elements.Header;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.TShirtsPage;
import utils.Listener;


@Listeners(Listener.class)
public class CatalogTests extends TestBase {

    @Test
    public void tShirtsPresentTest(){

        Header.tShirtPageClick();
        Assert.assertTrue(TShirtsPage.isTShirtPresentOnPage());

    }
}
