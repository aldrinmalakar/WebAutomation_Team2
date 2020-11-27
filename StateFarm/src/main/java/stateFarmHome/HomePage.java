package stateFarmHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static stateFarmHome.HomePageElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = selectProductQuoteID)
    public WebElement selectProductQuote;

    public void assertURL(String expected) {
        String actual = driver.
                getCurrentUrl();
        Assert.assertEquals(actual,
                expected,
                "Test Failed: Link is not as expected");
    }

    public void assertHomepageURL(String homePageURL) {
        assertURL(homePageURL);
    }

    public void dropdownNavigation(String ddSelector, String ddLink) {
        clickByCss(ddSelector);
        clickByCss(ddLink);
    }

    public void assertDropDown(String expectedURL) {
        assertURL(expectedURL);
    }

    public void getQuotesDropDown(String insuranceProduct, String zipcode) {
        clickByCss(getQuoteCss);
        Select select = new Select(selectProductQuote);
        select.selectByVisibleText(insuranceProduct);
        typeById(zipcodeBoxID, zipcode);

        clickById(getQuoteStartButtonID);

    }

    public void assertGetQuotesDropDown(String expected) {
        WebElement zipcodeBoxAssert = driver.findElement(By
                .id(assertZipcodeBoxID));
        String actual = zipcodeBoxAssert.
                getAttribute("value");
        Assert.assertEquals(actual,
                expected,
                "Test Failed: Search for zipcode didn't match");
    }

    public void assertLogoEmbededLink(String expected) {
        WebElement logoLink = driver.findElement(By.cssSelector(logoCssElement));
        String actual = logoLink.getAttribute("href");
    }

    public void loginFunctionality(String username, String password) {
        clickByCss(loginElementCss);
        typeById(loginUserIDElementsID, username);
        typeById(loginPasswordElementID, password);
        clickByXpath(loginOKButtonElementXpath);
    }

    public void changeLanguage() {
        clickByXpath(espanolXpath);
    }

    public void assertChangeLanguage() {
        assertURL(espanolURL);
    }

    public void findAnAgent(String zipcode) {
        typeByCss(findAgentZipcodeCss,zipcode);
        clickByCss(findAgentOkButtonCss);
    }

    public void assertFindAnAgent(String expectedZipcode) {
        WebElement zipBox = driver.findElement(By.id(assertFindAgentZipBoxID));
        String actual = zipBox.getAttribute("value");
        Assert.assertEquals(actual,expectedZipcode,"Test Failed");
    }
}
