package cnnStyle;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static cnnStyle.StyleElement.*;

public class Style extends WebAPI {
    @FindBy(xpath = styleWebElement)public WebElement style;
    @FindBy(xpath =  willAntiMicrobialFashionWebElement)public  WebElement  willAntiMicrobialFashion;
    @FindBy(xpath = style1WebElement)public WebElement style1;

    public void willAntiMicrobialFashionWithCredential() throws InterruptedException {
        style.click();
        Thread.sleep(3000);
        willAntiMicrobialFashion.click();
        Thread.sleep(3000);
        style1.click();
        Thread.sleep(3000);
    }
    public void validateWillAntiMicrobialFashionCredential(){
        String expectedTitle="LeAnn Rimes shares 'unabashedly honest' photos of her psoriasis - CNN Style";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }

}
