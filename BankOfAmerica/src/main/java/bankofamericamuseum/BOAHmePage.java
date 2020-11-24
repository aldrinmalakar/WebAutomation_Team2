package bankofamericamuseum;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static bankofamericamuseum.BOALocators.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BOAHmePage extends WebAPI {
    //location home page
    @FindBy(how = How.CSS, using = LocationsLocator)
    public WebElement Locations;
    // search location
    @FindBy(how = How.XPATH, using = newYorkLocator)
    public WebElement searchKey;
    @FindBy(how = How.ID, using = clickOnnSearchButtonLocator)
    public WebElement clickOnnSearchButton;
    @FindBy(how = How.CSS, using = AlbanyLocatorActual)
    public WebElement AlbanyActual;
    //open filter functions
    @FindBy(how = How.LINK_TEXT, using = clickOnFilterLocator)
    public WebElement clickOnFilter;
    @FindBy(how = How.CSS, using = filterActual)
    public WebElement filterValidation;
    @FindBy(how = How.CLASS_NAME, using = clickOnCloseFilterLocator)
    public WebElement CloseFilter;
    // location by state
    @FindBy(how = How.XPATH, using = clickOnLocationByStateLocator)
    public WebElement clickOnLocationByState;
    @FindBy(how = How.CSS, using = clickOnLocationMassachusettsLocator)
    public WebElement clickOnLocationMassachusetts;
    @FindBy(how = How.XPATH, using = validateOnLocationMassachusettsLocator)
    public WebElement validateOnLocationMassachusetts;
    // check Near MeButton
    @FindBy(how = How.ID, using = clickCheckNearMeButtonLocation)
    public WebElement clickCheckNearMeButton;
    @FindBy(how = How.ID, using = validateCheckNearMeButtonLocation)
    public WebElement validateCheckNearMeButton;
    // Search Location By Filters
    @FindBy(how = How.XPATH, using = SearchLocationByFiltersLocator)
    public WebElement SearchLocationByFilters;
    @FindBy(how = How.XPATH, using = validateSearchLocationByFiltersLocator)
    public WebElement validateSearchLocationByFilters;
    ////////MerrillHomePage
    @FindBy(how = How.XPATH, using = MerrillHomePageLocator)
    public WebElement NavigateToMerrillHomePage;
    //video
    @FindBy(how = How.XPATH, using = PlayVideoMerrillLocator)
    public WebElement playVideoMerrill;
    @FindBy(how = How.XPATH, using = PlayVideoMerrillActual)
    public WebElement validatePlayVideo;
    //guide advisor
    @FindBy(how = How.XPATH, using = guideAdviserLocator)
    public WebElement guideAdviser;
    @FindBy(how = How.XPATH, using = validateGuideAdvisorActual)
    public WebElement validateGuideAdvisor;
    @FindBy(how = How.CLASS_NAME, using = chatBoxFunctionLocator)
    public WebElement clickchatBoxFunctionElement;
    @FindBy(how = How.CLASS_NAME, using = chatBoxFunctionActual)
    public WebElement actualChatBoxFunction;
    @FindBy(how = How.XPATH, using = closeChatBoxFunctionActual)
    public WebElement closeChatBoxFunction;

    @FindBy(how = How.XPATH, using = clickOnMessageBoxLocator)
    public WebElement clickOnMessageBox;
    @FindBy(how = How.XPATH, using = clickOnMessageBoxLocatorclass)
    public WebElement clickOnMessageBoxclass;
    @FindBy(how = How.XPATH, using = clickOnButtonMessageBoxLocator)
    public WebElement clickOnButtonMessageBox;
    @FindBy(how = How.XPATH, using = validateMessageBoxLocator)
    public WebElement validateMessageBoxActual;
    @FindBy(how = How.XPATH, using = clickOnTryItOUtLocator)
    public WebElement clickOnTryItOUt;
    @FindBy(how = How.XPATH, using = clickOnCostOfDeptLocator)
    public WebElement clickOnCostOfDept;
    @FindBy(how = How.XPATH, using = sendTotalAmountLocator)
    public WebElement sendTotalAmount;
    @FindBy(how = How.XPATH, using = loanPaymentLocator)
    public WebElement loanPayment;
    @FindBy(how = How.XPATH, using = mainSliderRateLocator)
    public WebElement mainSliderRate;
    @FindBy(how = How.XPATH, using = SliderRateLocator)
    public WebElement SliderRate;


    public void validateBOAHomePage() {
        String expected = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void navigateToLocationPage() {

        Locations.click();
    }

    public void validateLocationPage() {
        String expected = "Bank of America Financial Centers and ATMs";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void openFilterFunctions() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        clickOnFilter.click();
    }

    public void searchLocationUsingFilters() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        clickOnFilter.click();
        String element = "spid4511";
        List<WebElement> checklist = driver.findElements(By.xpath("//*[@id='spid4511']"));
        System.out.println(checklist.size());
        for (int i = 0; i < checklist.size(); i++) {
            if (checklist.get(i).getAttribute("id").equalsIgnoreCase(element)) {
                checklist.get(i).click();
                break;
            }
        }
        SearchLocationByFilters.click();
    }

    public void validateSearchLocationByFilters() {
        String expected = "1";
        String actual = validateSearchLocationByFilters.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void validateOpenFilterFunctions() {
        String expected = "Filter Results";
        String actual = filterValidation.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void closeFilterFunctions() throws InterruptedException {
        Locations.click();
        clickOnFilter.click();
        CloseFilter.click();
    }

    public void newYorkInSearchBox() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        searchKey.click();
        searchKey.sendKeys("New York");
        clickOnnSearchButton.click();
    }

    public void validateNewYorkInSearchBox() throws InterruptedException {
        String expected = "Financial centers and ATMs in New York";
        String actual = AlbanyActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void searchLocationByState() throws InterruptedException {
        Locations.click();
        clickOnLocationByState.click();
        clickOnLocationMassachusetts.click();
    }

    public void validateSearchLocationByState() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String expected = "Financial centers and ATMs in Massachusetts";
        String actual = validateOnLocationMassachusetts.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void checkNearMeButton() throws InterruptedException {
        Locations.click();
        clickCheckNearMeButton.click();
    }

    public void validateCheckNearMeButton() throws InterruptedException {
        String expected = "Search near me";
        String actual = validateCheckNearMeButton.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void validateLocationInMap() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        searchKey.click();
        searchKey.sendKeys("Miami");
        clickOnnSearchButton.click();
    }

    public void merrillHomePage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
    }

    public void validateMerrillHomePage() throws InterruptedException {
        String expected = "Merrill Edge - Online Investing, Trading, Brokerage and Advice";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void playVideoMerrillElement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
        playVideoMerrill.click();
    }

    public void validatePlayVideoMerrill() throws InterruptedException {
        String expected = "";
        String actual = validatePlayVideo.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void merrillGuideAdviserElement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
        WebElement source = driver.findElement(By.xpath(guideAdviserLocator));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav2_col2WhyEdge"))).click();
    }

    public void validateMerrillGuideAdviserElement() throws InterruptedException {
        String expected = "MERRILL GUIDED INVESTING™";
        String actual = validateGuideAdvisor.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void chatBoxFunctionElement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
        Actions action = new Actions(driver);
        action.moveToElement(clickchatBoxFunctionElement).click();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnMessageBoxLocator))).click();
        closeChatBoxFunction.click();
    }

    public void validateChatBoxFunction() throws InterruptedException {
        String expected = "Chat";
        String actual = clickchatBoxFunctionElement.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void ButtonMessageBoxElements() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
        Actions action = new Actions(driver);
        action.moveToElement(clickchatBoxFunctionElement).click();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnMessageBoxLocator))).click();
        clickOnMessageBoxclass.sendKeys("Hi");

    }

    public void validateButtonMessageBox() throws InterruptedException {
        String expected = "Barbara Ann";
        String actual = validateMessageBoxActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void calculateCostOfDebtElements() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        NavigateToMerrillHomePage.click();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnTryItOUt).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='l2IE_CMS']/div/ul/li[3]/a"))).click();
        waitTimeExplicit(clickOnCostOfDeptLocator);
        clickOnCostOfDept.click();
    }

    public void validateCalculateCostOfDebt() throws InterruptedException {
        String expected = "Cost of Debt Calculator from Merrill Edge";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void CostOfDebtElements() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        calculateCostOfDebtElements();
        Thread.sleep(10);
        driver.switchTo().defaultContent();
        waitTimeExplicit(sendTotalAmountLocator);
//        Actions action = new Actions(driver);
//        action.contextClick(sendTotalAmount).sendKeys("50000");
//        sendTotalAmount.sendKeys("50000");
        driver.switchTo().frame(0);
        Select select = new Select(loanPayment);
        select.selectByValue("1");
//        driver.switchTo().frame(0);
////        WebElement mainslider = driver.findElement(By.xpath("//*[@id=\"js-scale-quiz__question-1\"]/div[2]/div/span"));
//        int width = mainSliderRate.getSize().width / 2;
//        //sliding there is a method called dragAndDrop
////        WebElement slider = driver.findElement(By.xpath("//*[@id=\"js-scale-quiz__question-1\"]/div[2]/div/div[3]/button"));
//        new Actions(driver).dragAndDropBy(SliderRate, width, 0).perform();
    }

    public void validateCostOfDebt() throws InterruptedException {
        String expected = "Cost of Debt Calculator from Merrill Edge";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }


}