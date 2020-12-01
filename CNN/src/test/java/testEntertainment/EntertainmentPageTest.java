package testEntertainment;

import common.WebAPI;
import entertainment.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ReadExcel;

public class EntertainmentPageTest extends WebAPI {

    EntertainmentPage entertainmentPage;

    @BeforeMethod
    public void getInit() {
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        entertainmentPage.navigateToEntertainment();
    }

    @Test
    public void entertainmentPage() {
        entertainmentPage.navigateToEntertainment();
    }

    @DataProvider(name = "SearchEntertainment")
    public <List> Object[] terms() {

        Object[] data = new Object[6];

        data[0] = "Movies";
        data[1] = "Media";
        data[2] = "Stars";
        data[3] = "Screen";
        data[4] = "Culture";
        data[5] = "Binge";

        return data;
    }

    @Test(dataProvider = "SearchEntertainment")
    public void searchBarResults(String data) {
        entertainmentPage.searchEntertainmentsPage(data);

    }

    @Test//13
    public void testSignInInvalidCred(){
        entertainmentPage.signInUsingInvalidCredentials();
    }

    @Test//14
    public void testBrokenLinks(){
        entertainmentPage.findBrokenLinks();
    }

    @Test//15
    public void testScrollDown() {
        entertainmentPage.scrollDown();
        entertainmentPage.validateScrollDown();
    }






}
