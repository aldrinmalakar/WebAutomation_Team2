package testBoaSmallBusiness;

import boaSmallBusiness.SmallBusiness;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmallBusinessTest extends WebAPI {
   SmallBusiness smallBusiness;
   @BeforeMethod
    public void gitInit(){smallBusiness= PageFactory.initElements(driver,SmallBusiness.class); }
    @Test(enabled = true)
    public void checking() throws InterruptedException {
      smallBusiness.checkingWithCredential();
      smallBusiness.validateCheckingCredential();

    }
    @Test(enabled = false)
    public void  saving() throws InterruptedException {
       smallBusiness.savingWithCredential();
       smallBusiness.validateS
    }
    @Test(enabled = false)



    }



}
