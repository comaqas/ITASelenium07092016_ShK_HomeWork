import core.TestBase;
import elements.Header;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.Listener;


@Listeners(Listener.class)
public class ShoppingTests extends TestBase {


    String userEmail = "kirill.shishko.9214@mail.ru";
    String userPassword = "jerk14__";
    String orderNumber;
    String searchItem = "Dress";

    @Test
    public void shoppingTest() {

        Header.clickSignInLink();
        LoginPage.loginAs(userEmail,userPassword);
        Header.searchFor(searchItem);
        SearchResultPage.addToCart();
        SearchResultPage.proceedToCheckout();
        orderNumber = ShoppingCartPage.buyingAndGettingOrderNumberSignedIn();
        ShoppingCartPage.navigateToOrderHistoryPage();
        Assert.assertEquals(OrderHistoryPage.getLastOrderNumber() , orderNumber);


    }
}
