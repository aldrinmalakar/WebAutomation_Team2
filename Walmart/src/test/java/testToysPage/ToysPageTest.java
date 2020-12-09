package testToysPage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import toysPage.ToysPageHome;

public class ToysPageTest extends WebAPI {
   ToysPageHome toysPage;
  @BeforeMethod
  public void getInit(){toysPage= PageFactory.initElements(driver,ToysPageHome.class); }



//1
@Test(enabled = true)
    public void checkToys() throws InterruptedException{
      toysPage.checkToys();
      toysPage.validateCheckToys();
  }



//2
    @Test(enabled = false)
    public void InfluencerToys()throws InterruptedException{

      toysPage.InfluencerToys();
      toysPage.validateInfluencerToys();
    }

//3
    @Test(enabled = false)
    public void ToyCatalog() throws InterruptedException{
      toysPage.ToyCatalog();
      toysPage.validateToyCatalog();
    }

//4



}
