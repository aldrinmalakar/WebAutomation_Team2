package stateFarmHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static stateFarmHome.HomePageElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = selectProductQuoteID)
    public WebElement selectProductQuote;
    @FindBy(how = How.ID, using = searchBoxID)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = getIphoneAppCss)
    public WebElement getIphoneApp;
    @FindBy(how = How.CSS, using = getAndroidAppCss)
    public WebElement getAndroidApp;

    public void assertURL(String expected) {
        String actual = driver.
                getCurrentUrl();
        Assert.assertEquals(actual,
                expected,
                "Test Failed: Link is not as expected");
    }

    public void switchTab(int waitForSecond) {
        sleepFor(waitForSecond);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    public static void clearElementAndTypeThenEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).clear();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).clear();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).clear();
                }
                try {
                    driver.findElement(By.linkText(locator)).clear();
                } catch (Exception ex4) {
                    driver.findElement(By.tagName(locator)).clear();
                }
            }
        }
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
                try {
                    driver.findElement(By.linkText(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex4) {
                    driver.findElement(By.tagName(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
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
        typeByCss(findAgentZipcodeCss, zipcode);
        clickByCss(findAgentOkButtonCss);
    }

    public void assertFindAnAgent(String expectedZipcode) {
        WebElement zipBox = driver.findElement(By.id(assertFindAgentZipBoxID));
        String actual = zipBox.getAttribute("value");
        Assert.assertEquals(actual, expectedZipcode, "Test Failed");
    }

    public void findBrokenLinks(String homePage) {

        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> linktag = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it = linktag.iterator();

        while (it.hasNext()) {

            url = it.next().getAttribute("href");

            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(homePage)) {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void searchWithDataProvider(String value) {
        clickByXpath(searchHeaderXpath);
        searchBox.clear();
        searchBox.sendKeys(value, Keys.ENTER);
        sleepFor(2);

    }

    public void assertSearchWithDataProvider() {
        String expected = "Search";
        sleepFor(2);
        String actual = getTextByXpath(searchInResultXpath);
        Assert.assertEquals(actual, expected, "Test Failed");
    }

    public void getIphoneApp() {
       getIphoneApp.click();
        switchTab(3);
    }

    public void assertGetIphoneApp() {
        assertURL(getIphoneAppURL);
    }

    public void getAndroidApp() {
        getAndroidApp.click();
        switchTab(3);
    }

    public void assertGetAndroidApp() {
        assertURL(getAndroidAppURL);
    }

    public void getToReadMorePrivacy() {
        clickById(optCCPAReadmoreID);
        sleepFor(2);
    }

    public void assertReadMorePrivacy(String expected) {
        String actual = getTextByCss(assertPrivacyTextCSS);
    }

    public void SocialFacebookPage(String givenCss) {
        clickByCss(givenCss);
        switchTab(3);

    }

    public void assertSocialFacebookPage(String expected) {
        assertURL(expected);
    }

    public void seekHelpHeader(String givenXpath) {
        clickByXpath(helpHeaderXpath);
        clickByXpath(givenXpath);
    }

    public void assertSeekHelpHeader(String expectedURL) {
        sleepFor(1);
        assertURL(expectedURL);
    }
}

