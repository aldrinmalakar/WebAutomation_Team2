package walmartmuseum;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static walmartmuseum.MuseumWebElements.*;

public class MuseumBase extends WebAPI {

    @FindBy(how = How.LINK_TEXT, using = navigateToMuseum)
    public WebElement clickOnNavigateToMuseum;

    @FindBy(how = How.XPATH, using = shoppingPage)
    public WebElement clickShoppingPage;
    @FindBy(how = How.XPATH, using = smileyProduct)
    public WebElement theSmileyProduct;
    @FindBy(how = How.LINK_TEXT, using = smileyImage)
    public WebElement clickOnSmileyImage;
    @FindBy(how = How.XPATH, using =clickONSmileyImage)
    public WebElement clickCloseImage;
    @FindBy(how = How.XPATH, using =SmileyAddToCart)
    public WebElement clickOnSmileyAddToCart;
    @FindBy(how = How.ID, using =checkCart)
    public WebElement clickOnCheckCart;
    @FindBy(how = How.XPATH, using =SecureFitMasks)
    public WebElement clickOnSecureFitMasks;
    @FindBy(how = How.XPATH, using =secureMaskImage)
    public WebElement clickOnFitMasksImage;
    @FindBy(how = How.XPATH, using =rotateSecureMaskImage)
    public WebElement clickOnRotateSecureFitMasks;
    @FindBy(how = How.XPATH, using =closeMaskImage)
    public WebElement clickOnCloseMaskImage;
    @FindBy(how = How.XPATH, using =actualForSecureMask)
    public WebElement validateSecureMask;
    @FindBy(how = How.XPATH, using =verifyMasksInCart)
    public WebElement clickOnVerifyMasksInCart;
    @FindBy(how = How.XPATH, using =clickOnCart)
    public WebElement verifyclickOnCart;
    @FindBy(how = How.XPATH, using =validateRemoveItems)
    public WebElement clickvalidateRemoveItems;
    @FindBy(how = How.XPATH, using =removeItem)
    public WebElement clickOnremoveItem;


    public void museumNavigation() throws InterruptedException {
        //museum navigation
        clickOnNavigateToMuseum.click();
        Thread.sleep(3000);
    }

    public void validateMuseumNavigation() throws InterruptedException {
        //validation
        Thread.sleep(3000);
        String expected = "The Walmart Museum";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Validation Failed ");
    }

    public void museumShopping() throws InterruptedException {
        //shopping
        clickShoppingPage.click();
        Thread.sleep(3000);
    }

    public void validateMuseumShopping() throws InterruptedException {
        //validate the page
        Thread.sleep(3000);
        String expected = "SparkShop | Official Walmart Branded Merchandise";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void desksSupplies() throws InterruptedException {
        //Desk supplies
        WebElement source = driver.findElement(By.xpath(deskSupplieMoseHover));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(DeskSupplieslink))).click();
    }
     public void validateDesksSupplies() throws InterruptedException {
         Thread.sleep(3000);
        String expected = "Desk Supplies | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void smileProduct() throws InterruptedException {
        //Smile face product
        theSmileyProduct.click();
        Thread.sleep(3000);
        clickOnSmileyImage.click();
        clickCloseImage.click();
        clickOnSmileyAddToCart.click();
        //verify cart
        clickOnCheckCart.click();
    }
    public void validateSmileProduct() throws InterruptedException {
        //validate desk supplies
        Thread.sleep(3000);
        String expected = "Cart | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }


    public void selectMasksFromAccessory() throws InterruptedException {
        Thread.sleep(3000);
        WebElement source = driver.findElement(By.xpath(MasksFromAccessory));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebElement source2 = driver.findElement(By.linkText(AccessoriesLink));
        Actions action2 = new Actions(driver);
        action2.moveToElement(source2).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(MasksLink))).click();
    }

    public void ValidateSelectMasksFromAccessory() throws InterruptedException {
        Thread.sleep(3000);
        String expected = "Masks | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void selectSecurefitMasks() throws InterruptedException {
        clickOnSecureFitMasks.click();
        Thread.sleep(3000);
        clickOnFitMasksImage.click();
        clickOnRotateSecureFitMasks.click();
        clickOnRotateSecureFitMasks.click();
        clickOnRotateSecureFitMasks.click();
        clickOnCloseMaskImage.click();
        Thread.sleep(3000);
    }

    public void validateSelectSecurefitMasks() throws InterruptedException {
        Thread.sleep(3000);
        String expected = "840196902661_quarter";
        String actual = validateSecureMask.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void verifyMasksInCart() throws InterruptedException {
        // verify cart
        Thread.sleep(3000);
        clickOnVerifyMasksInCart.click();
        verifyclickOnCart.click();
    }

    public void validateVerifyMasksInCart() throws InterruptedException {
        //validate cart
        Thread.sleep(3000);
        String expected = "Cart | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void removeItems() throws InterruptedException {
        clickOnremoveItem.click();
        Thread.sleep(5000);
    }
    public void validateRemoveItems() {
        String expected = "Cart | SparkShop";
        String actual = clickvalidateRemoveItems.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }
}
