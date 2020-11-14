package MOREPAGE;
import org.openqa.selenium.support.FindBy;
import common.WebAPI;

import static MOREPAGE.morePageLocators.*;

public class morePage extends WebAPI {

   public void cnnTitleValidation(){
       String expectedCnnTitle="Breaking News, Latest News and Videos - CNN";
       String actualCnnTitle =driver.getTitle();
   }
}
