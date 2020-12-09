package worldpage;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import static worldpage.WorldPageWebElements.*;

public class WorldPageHome extends WebAPI {



@FindBy(how = How.XPATH,using = WorldWebElement)
public WebElement checkWorld;
@FindBy(how =How.XPATH,using =TitleWebElement )
public WebElement chechWorldActualWebElement;



@FindBy(how =How.XPATH,using =AfricaWebElement )
public WebElement Africa;
@FindBy(how=How.CSS,using=AfricaTitleWebElement)
public WebElement testAfricaActualWebElement;


@FindBy(how=How.XPATH,using = AmericaWebElement)
public WebElement America;
@FindBy(how=How.CSS,using=AmericaTitleWebElement)
public WebElement testAmericaActualWebElement;


@FindBy(how=How.XPATH,using=AsiaWebElement)
public WebElement Asia;
@FindBy(how=How.XPATH,using=AsiaTitleWebElement)
public WebElement testAsiaActualWebElement;

@FindBy(how=How.XPATH,using=AustraliaWebElement)
public WebElement Australia;
@FindBy(how=How.XPATH,using = AustraliaTitleWebElement)
public WebElement testAustraliaActualWebElement;



@FindBy(how=How.XPATH,using = ChinaWebElement)
public WebElement China;
@FindBy(how=How.XPATH,using =ChinaTitleWebElement)
public WebElement testChinaActualWebElement;

@FindBy(how=How.XPATH,using=EuropeWebElement)
public WebElement Europe;
@FindBy(how=How.XPATH,using = EuropeTitleWebElement)
public WebElement testEuropeActualWebElement;

@FindBy(how = How.XPATH,using=IndiaWebElement)
public WebElement India;
@FindBy(how=How.XPATH,using=IndiaTitleWebElement)
public WebElement testIndiaActualWebElement;


@FindBy(how=How.XPATH,using=MiddleEastWebElement)
public WebElement MiddleEast;
@FindBy(how = How.XPATH,using = MiddleEastTitleWebElement)
public WebElement testMiddleEastActualWebElement;


@FindBy(how=How.XPATH,using = UnitedKingdomWebElement)
public WebElement UnitedKingdom;
@FindBy(how=How.XPATH,using = UnitedKingdomTitleWebElement)
public WebElement testUnitedKingdomActualWebElement;

@FindBy(how =How.CSS,using=InsideAfricaWebElement)
public WebElement InsideAfrica;
@FindBy(how=How.XPATH,using = InsideAfricaTitleWebElement)
public WebElement testInsideAfricaActualWebElement;

@FindBy(how=How.XPATH,using = AfricaAvantGardWebElement)
public WebElement AfricaAvantGard;
@FindBy(how=How.XPATH,using =AfricaAvantGardTitleWebElement )
public WebElement testAfricaAvantGard;




public void checkWorld() throws InterruptedException{
    checkWorld.click ();
Thread.sleep(5000);
}
public void validateCheckWorld(){
     String expectedText = "World";
      String actualText= chechWorldActualWebElement.getText();
   Assert.assertEquals( actualText,expectedText, "test fail: language setting not shows");}


   //2
    public void Africa() throws InterruptedException{
      checkWorld.click();
      Thread.sleep(5000);
      Africa.click();
          Thread.sleep(5000);

    }

public void validateTestAfrica(){
    String expectedText="Africa";
    String actualText= testAfricaActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test fail:language setting not shows");
}

//3
    public void America() throws  InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    America.click();
    Thread.sleep(5000);
}

public void validateTestAmerica(){
    String expectedText="America";
    String actualText=testAmericaActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test fail:language setting not shows");
}
//4
public void Asia() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    Asia.click();
}

public void validateTestAsia(){
  String expectedText="Asia";
  String actualText=testAsiaActualWebElement.getText();
  Assert.assertEquals(expectedText,actualText,"Test fail:language setting not shows");
}
//5
    public void Australia() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    Australia.click();
    }
public void validateTestAustralia(){
    String expectedText="Australia";
    String actualText=testAustraliaActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test fail:language setting not shows");
}

//6
    public void China() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    China.click();
    }
public void validateTestChina(){
    String expectedText="China";
    String actualText=testChinaActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test faild : language setting not shows");
}

//7
    public void Europe() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    Europe.click();
}
public void validateTestEurope(){
    String expectedText="Europe";
    String actualText=testEuropeActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test faild:language setting not shows");
}
//8

public void India() throws InterruptedException{

    checkWorld.click();
    Thread.sleep(5000);
    India.click();
}
public void validateTestIndia(){
    String expectedText="India";
    String actualText=testIndiaActualWebElement.getText();
    Assert.assertEquals(expectedText,actualText,"Test failed:language setting not shows");
}

//9
    public void MiddleEast() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    MiddleEast.click();

    }
public void validateTestMiddleEast(){
  String expectedText="Middle East" ;
  String actualText=testMiddleEastActualWebElement.getText();
  Assert.assertEquals(expectedText,actualText,"Test failed:language setting not shows");
}

//10

public void UnitedKingdom() throws InterruptedException{
    checkWorld.click();
    Thread.sleep(5000);
    UnitedKingdom.click();
}
public void validateTestUnitedKingdom(){

    String expectedText="United Kingdom";
    String actualText=testUnitedKingdomActualWebElement.getText();
    Assert.assertEquals(actualText,expectedText,"Test failed:language setting not shows");
}

//11
public void InsideAfrica()throws InterruptedException{
    checkWorld.click();
    Africa.click();
    Thread.sleep(5000);
    InsideAfrica.click();
    Thread.sleep(5000);

}
public void validateTestInsideAfrica(){
    String expectedText="Inside Africa";
    String actualText=testInsideAfricaActualWebElement.getText();
    Assert.assertEquals(actualText,expectedText,"test failed:language setting not shows");
}

//12
public void AfricaAvantGard()throws InterruptedException{

    checkWorld.click();
    Africa.click();
    Thread.sleep(5000);
    AfricaAvantGard.click();
}
public void validateTestAfricaAvantGard(){
    String expectedText="Africa Avant Gard";
    String actualText= testAfricaAvantGard.getText();
    Assert.assertEquals(expectedText,actualText,"Test failed :language setting not shows");
}









}










