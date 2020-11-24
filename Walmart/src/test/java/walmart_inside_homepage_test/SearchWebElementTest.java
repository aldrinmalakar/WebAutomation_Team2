package walmart_inside_homepage_test;

import common.WebAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmart_inside_homepage.SearchWebElement;

public class SearchWebElementTest extends WebAPI {
    SearchWebElement searchWebElement;

    @BeforeMethod
    public void getInit() {
        searchWebElement = PageFactory.initElements(driver, SearchWebElement.class);
    }

    @Test(enabled = false)
    public void walmartSearchproduct1() {
        walmartSearchproduct1();

    }


    @Test(enabled = false)
    public void WalmartValidedSearchproduct1() {
        searchWebElement.WalmartValidedSearchProduct1();
    }


    @Test(enabled = false)
    public void ClickWalmartAddToCart() {
        searchWebElement.ClickWalmartAddToCart();

    }


}





