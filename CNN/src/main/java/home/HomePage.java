package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageLocators.Cnn;
import static home.HomePageLocators.*;

public class HomePage extends WebAPI {
   // @FindBy( how = How.XPATH,using =Cnn)public WebElement SearchBox;

    public void CheckTitle(){
        String actualResult="Cnn";
        String expectedResult=driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult,"TestFailed Does Not Match");








}
}
