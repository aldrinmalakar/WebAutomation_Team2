package MORETEST;

import MOREPAGE.morePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class morePageTest extends WebAPI {
    morePage morepage ;
    @BeforeMethod
    public void getInit(){
        morepage= PageFactory.initElements(driver, morePage.class);
    }

//
//@BeforeMethod
//public void goToMorePage(){
//        driver.get(cnnURL);
//        clickByXpath();
//
//}







































}
