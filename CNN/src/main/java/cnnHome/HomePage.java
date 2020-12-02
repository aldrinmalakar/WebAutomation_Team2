package cnnHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static cnnHome.HomePageElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = sportWebElement) public WebElement sport;
    @FindBy(className = NBAWebElement) public WebElement NBA;

    public void sportWithCredential() throws InterruptedException {
        sport.click();
        Thread.sleep(5000);
        NBA.click();
        Thread.sleep(5000);

    }
    public void validateSportCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="NBA | Bleacher Report | Latest News, Rumors, Scores and Highlights";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }


}
