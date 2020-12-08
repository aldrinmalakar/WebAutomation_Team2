package walmartmuseum;

import com.mysql.cj.MysqlConnection;
import common.WebAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import javax.swing.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static walmartmuseum.MuseumWebElements.*;

public class MuseumBase extends WebAPI {

    @FindBy(how = How.XPATH, using = clickOnLanguageLocator)
    public WebElement clickOnLanguage;
    @FindBy(how = How.XPATH, using = vSpanishLanguageLocator)
    public WebElement vSpanishLanguage;
    @FindBy(xpath = clickOnEspenLanguage)
    public WebElement OnEspenLanguage;
    @FindBy(xpath = clickOnEnglishLanguage)
    public WebElement clickEnglishLanguage;
    @FindBy(xpath = timeLineFunctionLocator)
    public WebElement clickOnTimeLineFunction;
    @FindBy(xpath = shopPageFunctionLocator)
    public WebElement shopPageFunction;

    public void validateMuseumNavigation() throws InterruptedException {
        //validation
        String expected = "The Walmart Museum";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Validation Failed ");
    }

    public void EspañolLanguageFunction() throws InterruptedException {
//        clickOnLanguage.click();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnLanguage).perform();
        driver.findElement(By.xpath(SpanishLanguageLocator));
        OnEspenLanguage.click();

    }

    public void validateEspañolLanguageFunction() throws InterruptedException {
        sleepFor(10);
        String expected = "Bienvenido a Walmart Museum";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void backToEnglishLanguageFunction() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(clickOnLanguage).perform();
        driver.findElement(By.xpath(SpanishLanguageLocator));
        clickEnglishLanguage.click();

    }

    public void validateBackToEnglishLanguageFunction() throws InterruptedException {
        sleepFor(10);
        String expected = "The Walmart Museum";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void timeLineFunctionElements() throws InterruptedException {
        clickOnTimeLineFunction.click();
    }

    public void validateTimeLineFunction() throws InterruptedException {
        sleepFor(10);
        String expected = "Timeline";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void shopPageFunctionElements() throws InterruptedException {
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        sleepFor(30);
        shopPageFunction.click();
//        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofSeconds(2))
//                .withMessage("Time out after 30 seconds")
//                .ignoring(NoSuchElementException.class);
        driver.findElement(By.xpath("//*[@id='menu-item-1834']"));
    }

    public void validateShopPageFunction() throws InterruptedException {
        sleepFor(10);
        String expected = "SparkShop | Official Walmart Branded Merchandise";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = visitFunctionPageLocator)
    public WebElement visitFunctionPage;
    @FindBy(xpath = validateVisitFunctionPageLocator)
    public WebElement validateVisitFunctionPage;

    public void visitFunctionPageElements() throws InterruptedException {
        visitFunctionPage.click();
    }

    public void validateVisitFunctionPage() throws InterruptedException {
        sleepFor(10);
        String expected = "Experience the story of Walmart.";
        String actual = validateVisitFunctionPage.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = eventsFunctionPageLocator)
    public WebElement eventsFunctionPage;
    @FindBy(xpath = validateEventsFunctionPageLocator)
    public WebElement validateEventsFunctionPage;

    public void eventsFunctionPageElements() throws InterruptedException {
        eventsFunctionPage.click();
    }

    public void validateEventsFunctionPage() throws InterruptedException {
        sleepFor(10);
        String expected = "Join in on all the fun.";
        String actual = validateEventsFunctionPage.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = NorthMainFunctionPageLocator)
    public WebElement NorthMainFunctionPage;

    public void NorthMainFunctionPageElements() throws InterruptedException {
        NorthMainFunctionPage.click();
    }

    public void validateNorthMainFunctionPage() throws InterruptedException {
        sleepFor(10);
        String expected = "105NorthMain";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = searchFunctionsLocator)
    public WebElement searchFunctions;
    @FindBy(xpath = SendSearchFunctionsLocator)
    public WebElement SendSearchFunctions;
    @FindBy(xpath = clickSearchButtonLocator)
    public WebElement clickSearchButton;
    @FindBy(xpath = validateSearchActualLocator)
    public WebElement validateSearchActual;

    public void searchFunctionalitiesElements() throws InterruptedException {
        searchFunctions.click();
        sleepFor(10);
        SendSearchFunctions.sendKeys("Project");
        clickSearchButton.click();
    }

    public void validateSearchFunctionalities() throws InterruptedException {
        sleepFor(10);
        String expected = "The Walmart Oral History Project";
        String actual = validateSearchActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = searchInvalidElementsLocator)
    public WebElement searchInvalidElements;

    public void searchInvalidElements() throws InterruptedException {
        searchFunctions.click();
        sleepFor(10);
        SendSearchFunctions.sendKeys("0000");
        clickSearchButton.click();
    }

    public void validateSearchInvalidElements() throws InterruptedException {
        sleepFor(10);
        String expected = "No results found";
        String actual = searchInvalidElements.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void ScrollToExploreFunction() throws InterruptedException {
        timeLineFunctionElements();
        sleepFor(10);
        Actions action = new Actions(driver);
        WebElement clickOnScrollElement = driver.findElement(By.xpath(clickOnScrollLocators));
        action.moveToElement(clickOnScrollElement).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", clickOnScrollElement);

    }

    public void validateScrollToExploreFunction() throws InterruptedException {
        sleepFor(10);
        String expected = "";
        String actual = searchInvalidElements.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = validateReserveTourActual)
    public WebElement ReserveTourActual;

    public void reserveATourVisitElements() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(visitFunctionPage).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ClickOnReserveTourLocator))).click();
    }

    public void validateReserveATourVisitElements() throws InterruptedException {
        sleepFor(10);
//        handleNewTab(driver);
        windowAndTabs();
        String expected = "Schedule Walmart Museum Admission (30m)";
        String actual = ReserveTourActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(linkText = clickOnSignupButtonLocator)
    public WebElement clickOnSignupButton;
    @FindBy(css = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(css = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(css = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(xpath = submitButtonLocator)
    public WebElement submitButton;
    @FindBy(css = subscribeActualLocator)
    public WebElement subscribeActual;

    //ready for test
    public void subscribeMuseumElements() throws InterruptedException {
        visitFunctionPageElements();
        sleepFor(10);
        clickOnSignupButton.click();
        windowAndTabs();
        sleepFor(10);
        sendEmail.sendKeys("familly_90@gmail.com");
        sendFirstName.sendKeys("Riyad");
        sendLastName.sendKeys("Mahrez");
        submitButton.click();

    }

    //ready for test
    public void validateSubscribeMuseumElements() throws InterruptedException {
        sleepFor(10);
        String expected = "Confirm Humanity";
        String actual = subscribeActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = clickOnTheDayLocator)
    public WebElement clickOnTheDay;
    @FindBy(xpath = clickOnTheTimeLocator)
    public WebElement clickOnTheTime;
    @FindBy(css = sendEmailLocators)
    public WebElement sendEmailElement;
    @FindBy(xpath = continueAsGuestLocators)
    public WebElement continueAsGuest;
    @FindBy(css = sendFirstNameLocators)
    public WebElement sendFirstNameElement;
    @FindBy(css = sendLastNameLocators)
    public WebElement sendLastNameElement;
    @FindBy(css = sendPhoneNumLocators)
    public WebElement sendPhoneNum;
    @FindBy(xpath = clickOnNextLocators)
    public WebElement clickOnNext;
    @FindBy(className = validateAdmissionLocator)
    public WebElement validateAdmission;

    //ready for test
    public void scheduleAdmissionElements() throws InterruptedException {
        reserveATourVisitElements();
        windowAndTabs();
        sleepFor(5);
        clickOnTheDay.click();
        clickOnTheTime.click();


        List<WebElement> box = continueAsGuest.findElements(By.name("continue-as-guest"));// why block , because there is some matching element with locator we don't want it to be checked
        System.out.println("Total checkboxes are: " + box.size());
        for (WebElement boxes : box) {
            WebDriverWait wait = new WebDriverWait(driver, 8);
            wait.until(ExpectedConditions.elementToBeClickable(boxes)).click();
            boxes.click();
        }
        sendEmailElement.sendKeys("kramou@gmail.com");
        sendFirstNameElement.sendKeys("Riyad");
        sendLastNameElement.sendKeys("Mahrez");
        sendPhoneNum.sendKeys("9177711245");
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnNext)).click();
        sleepFor(5);
        driver.findElement(By.cssSelector("#field -et5qp-0")).sendKeys(Keys.ENTER);
//        driver.findElement(By.cssSelector("#field-et5qp-0")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-thor[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
//        wait.until(ExpectedConditions.elementToBeClickable(clickOnNext)).click();
    }

    public void validateScheduleAdmissionElements() throws InterruptedException {
        sleepFor(5);
        String expected = "This booking is not confirmed yet. To confirm, click on the \"Confirm\" button.";
        String actual = validateAdmission.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void DesksSuppliesElements() throws InterruptedException {
        shopPageFunctionElements();
        WebElement source = driver.findElement(By.xpath("//*[@id='menu-item-1834']"));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Desk Supplies"))).click();
    }

    public void validateDesksSuppliesElements() throws InterruptedException {
        sleepFor(10);
        String expected = "Desk Supplies | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    @FindBy(xpath = actualItemValidationLocators)
    public WebElement actualItemValidation;

    public void smileItemElements() throws InterruptedException {
        DesksSuppliesElements();
        driver.findElement(By.xpath("//h2[contains(text(),'Sticker Decal – Smiley')]")).click();
        sleepFor(5);
        driver.findElement(By.cssSelector(".images > a.woocommerce-product-gallery__trigger:nth-child(1)")).click();
        driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        //
        driver.findElement(By.id("wpmenucartli")).click();
    }

    public void validateSmileItemElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Sticker Decal - Smiley";
        String actual = actualItemValidation.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void selectMasksFromAccessory() throws InterruptedException {
        shopPageFunctionElements();
        WebElement source = driver.findElement(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebElement source2 = driver.findElement(By.linkText("Accessories"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(source2).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Masks"))).click();
    }

    public void validateMasksFromAccessory() throws InterruptedException {
        sleepFor(5);
        String expected = "Masks | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void SelectMasksItemsElements() throws InterruptedException {
        selectMasksFromAccessory();
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id='post-1772886']/div/div/ul/li/a/span[1]")).click();
        driver.findElement(By.className("woocommerce-product-gallery__trigger")).click();
        driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        driver.findElement(By.id("wpmenucartli")).click();
    }

    public void validateSelectMasksItems() throws InterruptedException {
        sleepFor(5);
        String expected = "Cart | SparkShop";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void removeItemsElements() throws InterruptedException {
        SelectMasksItemsElements();
        sleepFor(10);
        driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
    }

    public void validateRemoveItems() throws InterruptedException {
        sleepFor(5);
        String expected = "Your cart is currently empty.";
        String actual = driver.findElement(By.xpath("//*[@id='post-65']/div/div/div/p")).getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void sparkShopElements() throws InterruptedException {
        shopPageFunctionElements();
        WebElement source = driver.findElement(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[2]"))).click();
    }

    public void validateSparkShopElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Your cart is currently empty.";
        String actual = driver.findElement(By.xpath("//*[@id='post-65']/div/div/div/p")).getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void scrollingUpAndDownElements() throws InterruptedException {
        shopPageFunctionElements();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        sleepFor(5);
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".et-pb-icon.et-visible:nth-child(2)"))).click();

    }

    public void validateScrollingUpAndDown() throws InterruptedException {
        sleepFor(5);
        String expected = "SparkShop | Official Walmart Branded Merchandise";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");


    }

}
