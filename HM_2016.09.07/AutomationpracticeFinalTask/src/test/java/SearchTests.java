import core.TestBase;
import elements.Header;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SearchResultPage;
import pages.ShoppingCartPage;
import utils.Listener;


@Listeners(Listener.class)
public class SearchTests extends TestBase {

    String searchItem = "Blouse";
    @Test
    public void searchTest() {


        Header.searchFor(searchItem);
        Assert.assertTrue(SearchResultPage.isSearchItemDisplayed(searchItem));
    }
    @Test
    public void deleteItemFromShoppingCartTest() throws InterruptedException {


        Header.searchFor(searchItem);
        SearchResultPage.addToCart();
        SearchResultPage.continueShopping();
        Header.clickCart();
        Assert.assertTrue(ShoppingCartPage.isProductQuantityDisplayed());
        ShoppingCartPage.deleteFromCart();
        Assert.assertTrue(ShoppingCartPage.isShoppingCartIsEmpty());

    }


}
