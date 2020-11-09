package testHome;

import common.WebAPI;
import home.taxePage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class taxePageTest extends WebAPI{

    @Test(enabled = true)
    public void checktaxePageTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle="Walmart tax exempt";
        Assert.assertEquals(actualTitle,expectedTitle,"fail");
    }
























}
