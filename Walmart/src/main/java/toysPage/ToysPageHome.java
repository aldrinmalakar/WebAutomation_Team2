package toysPage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static toysPage.ToysPageWebElements.*;
public class ToysPageHome extends WebAPI {




    @FindBy(how = How.XPATH, using = ToysWebElement)
    public WebElement checkToys;
    @FindBy(how = How.CSS, using = TitleWebElement)
    public WebElement checkToysActualWebElement;

    @FindBy(how=How.XPATH,using = InfluencerToysWebElement)
    public WebElement InfluencerToys;
    @FindBy(how=How.XPATH,using = InfluencerToysTitleWebElement)
     public WebElement InfluencerToysActualWebElem;

    @FindBy(how=How.CSS,using = ToyCatalogWebElement)
    public WebElement ToyCatalog;
   @FindBy(how =How.XPATH,using = ToyCatalogTitleWbElement)
   public WebElement ToyCatalogActualWebElement;






//1
    public void checkToys() throws InterruptedException {
        checkToys.click();
        Thread.sleep(4000);
    }

    public void validateCheckToys() {
        String expectedText = "America’s Best Toy Shop";
        String actualText = checkToysActualWebElement.getText();
        Assert.assertEquals(actualText, expectedText, "Test fail:language setting not shows");
    }

//2
    public void InfluencerToys()throws InterruptedException{
        checkToys.click();
        Thread.sleep(4000);
        InfluencerToys.click();
        Thread.sleep(4000);
    }

public void validateInfluencerToys(){
        String expectedText="Social media stars' fave toys";
        String actualText=InfluencerToysActualWebElem.getText();
        Assert.assertEquals(actualText,expectedText,"Test fail:language setting not show");
    }

//3
public void ToyCatalog() throws InterruptedException{
   checkToys.click();
   Thread.sleep(4000);
   ToyCatalog.click();
   Thread.sleep(4000);
}
public void validateToyCatalog(){
        String expectedText="Our toy catalog is here!";
        String actualText=ToyCatalogActualWebElement.getText();
        Assert.assertEquals(actualText,expectedText,"Test fail : language setting not show");

    }

}



















