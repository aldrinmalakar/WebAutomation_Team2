package testHome;

import MOREPAGE.morePage;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends WebAPI {



    HomePage home ;
    @BeforeMethod
    public void getInit(){
        home= PageFactory.initElements(driver, HomePage.class);
    }





}
