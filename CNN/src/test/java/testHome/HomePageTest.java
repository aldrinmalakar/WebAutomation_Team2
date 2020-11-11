package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homepage;
    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void CheckTitle(){
        homepage.CheckTitle();

    }


}
