package testWorldpage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import worldpage.WorldPageHome;

public class WorldPageTest extends WebAPI {
    WorldPageHome worldPageHome;

    @BeforeMethod
    public void getInit() {worldPageHome= PageFactory.initElements(driver,WorldPageHome.class);}

//1
@Test(enabled = false)
    public void checkWorld() throws InterruptedException{

    worldPageHome.checkWorld();
    Thread.sleep(5000);
   worldPageHome.validateCheckWorld();

}

//2
@Test(enabled = false)
    public void testAfrica()throws InterruptedException{
    worldPageHome.Africa();
    Thread.sleep(5000);
    worldPageHome.validateTestAfrica();
}
//3
@Test(enabled = false )
    public void testAmerica() throws InterruptedException{
    worldPageHome.America();
    Thread.sleep(5000);
    worldPageHome.validateTestAmerica();
}


//4
    @Test(enabled = false)
    public void testAsia()throws InterruptedException{
    worldPageHome.Asia();
    Thread.sleep(5000);
    worldPageHome.validateTestAsia();
    }

//5
    @Test(enabled = false)
    public void testAustralia() throws InterruptedException{
    worldPageHome.Australia();
    Thread.sleep(5000);
    worldPageHome.validateTestAustralia();
    }
//6
    @Test(enabled = false)
    public void testChina()throws InterruptedException{
    worldPageHome.China();
    Thread.sleep(5000);
    worldPageHome.validateTestChina();
    }
//7
    @Test(enabled = false)
    public void testEurope() throws InterruptedException{
        worldPageHome.Europe();
        Thread.sleep(5000);
        worldPageHome.validateTestEurope();
    }

    //8
    @Test(enabled = false)
    public void testIndia() throws InterruptedException{
        worldPageHome.India();
        Thread.sleep(5000);
        worldPageHome.validateTestIndia();
    }
//9
@Test(enabled = false)
    public void testMiddleEast()throws InterruptedException{
        worldPageHome.MiddleEast();
        Thread.sleep(5000);
        worldPageHome.validateTestMiddleEast();
}
//10
    @Test(enabled = false)
    public void testUnitedKingdom() throws InterruptedException{

        worldPageHome.UnitedKingdom();
        Thread.sleep(5000);
        worldPageHome.validateTestUnitedKingdom();
    }

//11
    @Test(enabled = false)
    public void testInsideAfrica()throws InterruptedException{
        worldPageHome.InsideAfrica();
        Thread.sleep(5000);
        worldPageHome.validateTestInsideAfrica();
    }
//12
    @Test(enabled = true)
    public void testAfricaAvantGard()throws InterruptedException{
        worldPageHome.AfricaAvantGard();
        Thread.sleep(5000);
        worldPageHome.validateTestAfricaAvantGard();
    }








}








