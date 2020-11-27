package cnnTech;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static cnnTech.techPageElements.*;

public class TechPage extends WebAPI {

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

    public void switchTab() {
        threadSleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void threadSleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void assertFailed(String actual, String expected) {
        Assert.assertEquals(actual, expected, "Test Failed");
    }

    public void assertURL(String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        assertFailed(actualURL, expectedURL);
        String url = driver.getCurrentUrl();
        System.out.println("************* Testing Redirection To Social Links *************");
        System.out.println("We have successfully opened: " + actualURL);
    }

    public void navigateToTestPage(String URL) {
        driver.get(URL);
    }

    public void assertHomePage() {
        assertURL(testHomeURL);
    }

    public void openLiveTV() {
        clickByCss(liveTVElement);
        sleepFor(2);
        clickByCss(liveTVPlayElement);
        sleepFor(2);
    }

    public void AssertOpenLiveTV(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed");
    }

    public void changeEdition() {
        clickById(editionChangeIDElement);
        clickByXpath(internationalEditionXpathElement);
        sleepFor(2);
    }

    public void AssertChangeEdition(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void openMenu() {
        clickByXpath(getMenuElement);
    }

    public void toolTipAfterHours() {
        openMenu();
    }

    public void assertToolTipAfterHours(String expected) {
        toolTipTitleXpathAssert(marketMoversElement, expected);
    }

    public void toolTipTitleXpathAssert(String xPathElement, String expected) {
        WebElement toolTip = driver.findElement(By.xpath(xPathElement));
        String actual = toolTip.getAttribute("title");
        Assert.assertEquals(actual, expected, "Test Failed. Tool Tip Text Does not math");
    }

    public void navigateToSuccess() {
        openMenu();
        clickOnElement(successPageFromMenuDropDownElement);
        sleepFor(2);
    }

    public void AssertNavigateToSuccess(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void navigateToMedia() {
        openMenu();
        clickOnElement(mediaPageFromMenuDropDownElement);
        sleepFor(2);
    }

    public void AssertNavigateToMedia(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void navigateToWeather() {
        openMenu();
        clickOnElement(weatherPageFromMenuDropDownElement);
        sleepFor(2);
    }

    public void AssertNavigateToWeather(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void navigateToCoupon() {
        openMenu();
        clickOnElement(couponPageFromMenuDropDownElement);
        sleepFor(2);
    }

    public void AssertNavigateToCoupon(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void searchCNN(String searchSendKeyString) {
        waitUntilClickAble(By.xpath(searchCNNXpathElement));
        clickByXpath(searchCNNXpathElement);
        sleepFor(1);
        //clickById(searchHeadIDElement);
        driver.findElement(By.id(searchHeadIDElement)).sendKeys(searchSendKeyString, Keys.ENTER);
        //typeById(searchHeadIDElement,searchSendKeyString);
        clickByXpath(searchSearchButtonCssElement);
        sleepFor(2);
        clickById(searchRadioWorldIDElement);
        sleepFor(2);

    }

    public void AssertSearchCNN(String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed: URL Is not as expected");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: URL Is not as expected");
    }

    public void navigateToNewsOne(String newsElement) {
        clickByXpath(newsElement);
        String currentURL = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        System.out.println("*************************TESTING NAVIGATION*************************");
        System.out.println("We navigated to " + currentURL + ",\nWhere the title of the page was: " + currentTitle);
        navigateBack();
        sleepFor(3);
    }

    public void assertNavigateToNewsOne() {
        assertURL(testHomeURL);
    }

    public void assertFBicon(String className) {
        WebElement icon = driver.findElement(By.xpath(className));
        Assert.assertTrue(icon.isDisplayed());

    }

    public void navigateToSocialPage(String xPath) {
        clickByXpath(xPath);
        switchTab();
    }

    public void signInWithIDAndPassword(String email, String password) {
        clickByXpath(signInButtonXpath);
        sleepFor(1);
        typeByXpath(signInEmailAddressXpath, email);
        typeByXpath(signInPasswordXpath,password);
        sleepFor(1);
        clickById(signInLogInButtonID);
        sleepFor(1);
        }

    public void assertErrorMessage(String expectedErrorMsg) {
        String actual = getTextById(signInFeedbackMessageID);
        Assert.assertEquals(actual,expectedErrorMsg,"Test Failed. Error Message did not match");
    }

    public void searchFor(String typeKeyword) {
        WebElement keyword = driver.findElement(By.id(footerSearchID));
        keyword.sendKeys(typeKeyword,Keys.ENTER);
        sleepFor(2);
    }

    public void assertSearchForKeyword(String expected) {
        String actual = getTextByXpath(searchResultXpath);
        Assert.assertEquals(actual,expected,"Test Failed. Search Result Is Not As Expected");

    }
}
