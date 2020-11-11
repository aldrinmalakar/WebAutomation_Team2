package walmart_inside_homepage;

import common.WebAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static walmart_inside_homepage.SearchWebElementLocator.*;

public class SearchWebElement extends WebAPI{
    @FindBy( how = How.CSS,using =SearchBox)public WebElement  WalmartSearchBox;
    @FindBy( how = How.CSS,using =clickSearchButton)public WebElement  WalmartclickSearchButton;
    @FindBy( how = How.CSS,using =validedWebElement)public WebElement  WalmartvalidedWebElement;
    @FindBy( how = How.CSS,using =clickCart)public WebElement  WalmartclickCart;

public void walmartSearchproduct1(){
    WalmartSearchBox.sendKeys("shoes");
    WalmartclickSearchButton.click();
}
public void WalmartValidedSearchProduct1() {

    String expectedResult = "Shoes";
    String actualResult =  WalmartvalidedWebElement.getText();
    Assert.assertEquals(actualResult,expectedResult,"DoesNot match Test fail");
}

public void ClickWalmartAddToCart(){
    WalmartclickCart.click();


}



}