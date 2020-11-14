package bankofamerica;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static bankofamerica.BOALocators.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BOAHmePage extends WebAPI {

    @FindBy(how = How.CSS, using = LocationsLocator)
    public WebElement Locations;
    @FindBy(how = How.XPATH, using = newYorkLocator)
    public WebElement searchKey;
    @FindBy(how = How.ID, using = clickOnnSearchButtonLocator)
    public WebElement clickOnnSearchButton;
    @FindBy(how = How.XPATH, using = AlbanyLocator)
    public WebElement Albany;
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
    @FindBy(how = How.CLASS_NAME, using = searchLocationUsingMapLocator)
    public WebElement searchLocationUsingMap;
    @FindBy(how = How.CSS, using = validateMapSearchLocator)
    public WebElement validateMapSearch;
    @FindBy(how = How.XPATH, using = validateLocationInMapLocator)
    public WebElement validateLocationInMap;
    @FindBy(how = How.XPATH, using = SearchLocationByFiltersLocator)
    public WebElement SearchLocationByFilters;
    @FindBy(how = How.XPATH, using = validateSearchLocationByFiltersLocator)
    public WebElement validateSearchLocationByFilters;


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
        for (int i = 0 ;i <checklist.size();i++){
            if (checklist.get(i).getAttribute("id").equalsIgnoreCase(element)){
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

    public void validateOpenFilterFunctions(){
        String expected = "Filter Results";
        String actual = filterValidation.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }

    public void closeFilterFunctions() throws InterruptedException {
        Locations.click();
        clickOnFilter.click();
        CloseFilter .click();
    }

    public void newYorkInSearchBox() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        searchKey.click();
        searchKey.sendKeys("New York");
        clickOnnSearchButton.click();
//        Albany.click();
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
    public void searchLocationUsingMap() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        searchKey.click();
        searchKey.sendKeys("Miami");
        clickOnnSearchButton.click();
        driver.switchTo().frame(0);
        iframeHandle(searchLocationUsingMap);
        searchLocationUsingMap.click();
    }
    public void validateSearchLocationUsingMap() throws InterruptedException {
        String expected = "Key Biscayne";
        String actual =validateMapSearch.getText();
        Assert.assertEquals(actual, expected, "Failed Test ");
    }
    public void validateLocationInMap() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Locations.click();
        searchKey.click();
        searchKey.sendKeys("Miami");
        clickOnnSearchButton.click();

    }
}