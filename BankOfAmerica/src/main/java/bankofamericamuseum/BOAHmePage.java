package bankofamericamuseum;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ReadExcel;

import static bankofamericamuseum.BOALocators.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BOAHmePage extends WebAPI {
    @FindBy(how = How.CSS, using = LocationsLocator)
    public WebElement Locations;
    @FindBy(how = How.XPATH, using = newYorkLocator)
    public WebElement searchKey;
    @FindBy(how = How.ID, using = clickOnnSearchButtonLocator)
    public WebElement clickOnnSearchButton;
    @FindBy(how = How.CSS, using = AlbanyLocatorActual)
    public WebElement AlbanyActual;
    @FindBy(how = How.LINK_TEXT, using = clickOnFilterLocator)
    public WebElement clickOnFilter;
    @FindBy(how = How.CSS, using = filterActual)
    public WebElement filterValidation;
    @FindBy(how = How.CLASS_NAME, using = clickOnCloseFilterLocator)
    public WebElement CloseFilter;
    @FindBy(how = How.XPATH, using = clickOnLocationByStateLocator)
    public WebElement clickOnLocationByState;
    @FindBy(how = How.CSS, using = clickOnLocationMassachusettsLocator)
    public WebElement clickOnLocationMassachusetts;
    @FindBy(how = How.XPATH, using = validateOnLocationMassachusettsLocator)
    public WebElement validateOnLocationMassachusetts;
    @FindBy(how = How.ID, using = clickCheckNearMeButtonLocation)
    public WebElement clickCheckNearMeButton;
    @FindBy(how = How.ID, using = validateCheckNearMeButtonLocation)
    public WebElement validateCheckNearMeButton;
    @FindBy(how = How.XPATH, using = SearchLocationByFiltersLocator)
    public WebElement SearchLocationByFilters;
    @FindBy(how = How.XPATH, using = validateSearchLocationByFiltersLocator)
    public WebElement validateSearchLocationByFilters;
    @FindBy(how = How.XPATH, using = MerrillHomePageLocator)
    public WebElement NavigateToMerrillHomePage;
    @FindBy(how = How.XPATH, using = PlayVideoMerrillLocator)
    public WebElement playVideoMerrill;
    @FindBy(how = How.XPATH, using = PlayVideoMerrillActual)
    public WebElement validatePlayVideo;
    @FindBy(how = How.XPATH, using = guideAdviserLocator)
    public WebElement guideAdviser;
    @FindBy(how = How.XPATH, using = validateGuideAdvisorActual)
    public WebElement validateGuideAdvisor;
    @FindBy(how = How.CLASS_NAME, using = chatBoxFunctionLocator)
    public WebElement clickchatBoxFunctionElement;
    @FindBy(how = How.XPATH, using = closeChatBoxFunctionActual)
    public WebElement closeChatBoxFunction;
    @FindBy(how = How.XPATH, using = clickOnMessageBoxLocator)
    public WebElement clickOnMessageBox;
    @FindBy(how = How.XPATH, using = clickOnMessageBoxLocatorclass)
    public WebElement clickOnMessageBoxclass;
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
    @FindBy(how = How.ID, using = clickOnResearchLocator)
    public WebElement clickOnResearch;
    @FindBy(how = How.XPATH, using = SNDLActualLocator)
    public WebElement SNDLActual;
    @FindBy(how = How.XPATH, using = iframeHandlingLocator)
    public WebElement iframeHandling;
    @FindBy(how = How.TAG_NAME, using = linkLocator)
    public List<WebElement> linkTags;
    @FindBy(how = How.CLASS_NAME, using = desktopListLocator)
    public List<WebElement> desktopList;
    @FindBy(how = How.XPATH, using = submitLocator)
    public WebElement submit;
    @FindBy(how = How.CSS, using = OnlineIDLocator)
    public WebElement OnlineID;
    @FindBy(how = How.CSS, using = PassCodeLocator)
    public WebElement PassCode;
    @FindBy(how = How.CSS, using = SignINLocator)
    public WebElement SignIN;
    @FindBy(how = How.XPATH, using = validateLoginLocator)
    public WebElement validateLogin;

    public void validateBOAHomePage() {
        String expected = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void navigateToLocationPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");
        sleepFor(6);
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
        navigateToLocationPage();
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
        navigateToLocationPage();
        sleepFor(5);
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
        sleepFor(3);
        merrillHomePage();
        playVideoMerrill.click();
    }

    public void validatePlayVideoMerrill() throws InterruptedException {
        String expected = "";
        String actual = validatePlayVideo.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void merrillGuideAdviserElement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        sleepFor(3);
        merrillHomePage();
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
        sleepFor(3);
        merrillHomePage();
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
        sleepFor(3);
        merrillHomePage();
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
        sleepFor(3);
        merrillHomePage();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnTryItOUt).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='l2IE_CMS']/div/ul/li[3]/a"))).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        iframeHandle(iframeHandling);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", sendTotalAmount);
        sendTotalAmount.sendKeys("5000");
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", loanPayment);
        loanPayment.isSelected();
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", SliderRate);
        int width = mainSliderRate.getSize().width / 2;
        new Actions(driver).dragAndDropBy(SliderRate, width, 0).perform();
        JavascriptExecutor executor4 = (JavascriptExecutor) driver;
        executor4.executeScript("arguments[0].click();", submit);
        submit.click();
    }

    public void validateCostOfDebt() throws InterruptedException {
        sleepFor(6);
        String expected = "Cost of Debt Calculator from Merrill Edge";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void getPriceFromTableElements() throws InterruptedException {
        sleepFor(5);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        sleepFor(3);
        merrillHomePage();
        Actions action = new Actions(driver);
        action.moveToElement(clickOnResearch).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Stock Research"))).click();
        String volume = "SNDL";
        System.out.println();
        List<WebElement> volumes = driver.findElements(By.xpath("//table[@class='align-r txt-s']/tbody/tr/td[1]"));
        List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='align-r txt-s']/tbody/tr[3]"));
        for (int i = 0; i < volumes.size(); ++i) {
            if (volume.equals(volumes.get(i).getText()))
                System.out.println(volumes.get(i).getText() + "....." + currentPrice.get(i).getText());
        }
    }

    public void desktopListElements() {
        String headerName = "";
        List<String> header = new ArrayList<>();
        Iterator<WebElement> it = desktopList.iterator();
        while (it.hasNext()) {
            headerName = it.next().getText();
            header.add(headerName);
            connect.insertDataFromArrayListToSqlTable(header, "desktop", "desktop_List");
        }
    }

    public void getListOfLinks() {
        String url = "";
        Iterator<WebElement> it = linkTags.iterator();
        while (it.hasNext()) {
            url = it.next().getAttribute("href");
            connect.insertDataFromStringToSqlTable(url, "BOA", "links");
            System.out.println(url);
        }

    }

    public void validateTable() throws InterruptedException {
        sleepFor(5);
        String expected = "-10.54";
        String actual = SNDLActual.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void loginFunctionalities(String UserID, String Password) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        clearAndSendKeys(OnlineID, UserID);
//        OnlineID.sendKeys(UserID);
        clearAndSendKeys(PassCode, Password);
//        PassCode.sendKeys(Password);
        SignIN.click();
    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void validateLoginFunctionalities() throws InterruptedException {
        sleepFor(5);
        String expected = "The Online ID or Passcode you entered does not match our records. You have 1 more try remaining.\n" +
                "Please try again or click Forgot ID/Passcode\n" +
                "\n" +
                "Having problems signing in or resetting your Passcode? If you’re using a password manager or your browser has stored credentials that are no longer valid, deleting your stored credentials should enable you to access your account. Learn more";
        String actual = validateLogin.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    ConnectToSqlDB connect = new ConnectToSqlDB();
    public void loginUsingConnectDB() throws Exception {
        List<String> username = connect.readDataBase("Login", "username");
        List<String> password = connect.readDataBase("Login", "password");
        loginFunctionalities(username.get(0), password.get(0));
    }

    public void validateLoginUsingConnectDB() throws Exception {
        sleepFor(5);
        String expected = "The Online ID or Passcode you entered does not match our records. You have 1 more try remaining.\n" +
                "Please try again or click Forgot ID/Passcode\n" +
                "\n" +
                "Having problems signing in or resetting your Passcode? If you’re using a password manager or your browser has stored credentials that are no longer valid, deleting your stored credentials should enable you to access your account. Learn more";
        String actual = validateLogin.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }


}