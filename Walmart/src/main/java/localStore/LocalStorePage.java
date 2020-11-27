package localStore;

import common.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static localStore.localStorePageElements.*;

public class LocalStorePage extends WebAPI {
    @FindBy(how = How.XPATH, using = makeThisYourStore)
    public WebElement localStore;
    @FindBy(how = How.XPATH, using = findAnotherStore)
    public WebElement findStore;
    @FindBy(how = How.CSS, using = getFindAnotherStore)
    public WebElement getAnotherStore;
    @FindBy(how = How.CLASS_NAME, using = getMakeThisYourStore)
    public WebElement assertGetMakeThisYourStore;
    @FindBy(how = How.XPATH, using = findDirection)
    public WebElement direction;
    @FindBy(how = How.CSS, using = getDirectionSearchBox)
    public WebElement googleMaps2;
    @FindBy(how = How.CLASS_NAME, using = homeAddress)
    public WebElement homeStreetAddress;
    @FindBy(how = How.XPATH, using = callTheStore)
    public WebElement storePhone;
    @FindBy(how = How.CSS, using = openHoursBody)
    public WebElement hoursOpen;
    @FindBy(how = How.CSS, using = openHoursHeader)
    public WebElement headerHours;
    @FindBy(how = How.XPATH, using = coronaFeature)
    public WebElement corona;
    @FindBy(how = How.XPATH, using = coronaBannerNext)
    public WebElement clickNext;
    @FindBy(how = How.CSS, using = coronaBannerText)
    public WebElement clickText;
    @FindBy(how = How.XPATH, using = pharmacyDropDown)
    public WebElement dropdownPharmacy;
    @FindBy(how = How.ID, using = publicSearch)
    public WebElement search;
    @FindBy(how = How.XPATH, using = searchStart)
    public WebElement startSearch;
    @FindBy(how = How.XPATH, using = searchActual)
    public WebElement actualResult;
    @FindBy(how = How.XPATH, using = newsEventsLink)
    public WebElement newsElement;
    @FindBy(how = How.XPATH, using = facebookTextExpected)
    public WebElement fbExpected;
    @FindBy(how = How.XPATH, using = facebookTextActual)
    public WebElement fbActual;
    @FindBy(how = How.XPATH, using = REFILL_A_PRESCRIPTION)
    public WebElement actualPharmacyText;
    @FindBy(how = How.XPATH, using = footerWeeklyAd)
    public WebElement weeklyAd;
    @FindBy(how = How.CLASS_NAME, using = actualAdLinkText)
    public WebElement actualAdText;
    @FindBy(how = How.ID, using = emailSignupBoxID)
    public WebElement emailBox;
    @FindBy(how = How.XPATH, using = SIGN_UP)
    public WebElement signUp;
    @FindBy(how = How.XPATH, using = signUpActualEmail)
    public WebElement actualEmail;
    @FindBy(how = How.LINK_TEXT, using = digitalMuseumLinkText)
    public WebElement museumLink;
    @FindBy(how = How.TAG_NAME, using = museumTagName)
    public WebElement museumHeader;
    @FindBy(how = How.CSS, using = clickAppStoreSS)
    public WebElement appStore;
    @FindBy(how = How.XPATH, using = clickPlayStoreSS)
    public WebElement playStore;
    @FindBy(how = How.XPATH, using = searchAvailability)
    public WebElement streetAddress;
    @FindBy(how = How.XPATH, using = buttonCheckAddress)
    public WebElement checkAdd;
    @FindBy(how = How.LINK_TEXT, using = productRecall)
    public WebElement prodRecall;
    @FindBy(how = How.CSS, using = clickAccount)
    public WebElement clkAcct;
    @FindBy(how = How.XPATH, using = clickAccount2)
    public WebElement clkAcct2;
    @FindBy(how = How.XPATH, using = verifyClkAcct)
    public WebElement getVerifyAcct;
    @FindBy(how = How.CSS, using = feedbackFloater)
    public WebElement feedbackButton;
    @FindBy(how = How.XPATH, using = give5Stars)
    public WebElement giveStars;
    @FindBy(how = How.TAG_NAME, using = writeComment)
    public WebElement wrtComment;
    @FindBy(how = How.ID, using = submitReviewButton)
    public WebElement submitReview;
    @FindBy(how = How.XPATH, using = clickTellUs)
    public WebElement tellUs;
    @FindBy(how = How.ID, using = selectIssue)
    public WebElement selectIssueDropdown;
    @FindBy(how = How.ID, using = writeComplaint)
    public WebElement commentInput;
    @FindBy(how = How.XPATH, using = submitComplaint)
    public WebElement setComplaint;
    @FindBy(how = How.LINK_TEXT, using = careersPage)
    public WebElement gotoCareers;
    @FindBy(how = How.ID,using = searchID)
    public WebElement  searchCareers;
    @FindBy(how = How.XPATH,using = yellowSearchButton)
    public WebElement getSearchCareers;
    @FindBy(how = How.CSS,using = getCareerText)
    public WebElement careerSearch;

    public void navigateToLocalStorePage() {
        driver.get(localStoreURL);
    }

    public void validateNavigateToLocalStorePage() {
        String expected = currentLocalStoreURL;
        int attempts = 0;
        String actual = "";
        while (attempts < 2) {
            try {
                actual = driver.getCurrentUrl();
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        Assert.assertEquals(actual, expected, "Failed: Did not navigate to the correct page.");
    }

    public void makeThisYourStore() {
        navigateToLocalStorePage();
        localStore.click();

    }

    public void validateMakeThisYourStore() {
        String expected = " #2010";
        String actual = assertGetMakeThisYourStore.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Page did not switch to local Store.");

    }

    public void findAnotherStore() {
        findStore.click();
    }

    public void validateFindAnotherStore() {
        String expected = "Nearby Stores";
        String actual = getAnotherStore.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Could not find nearby stores.");

    }

    public void getDirection() {
        direction.click();
    }

    public void validateGetDirection() {
        String expected = "Explore " + homeStreetAddress.getText();
        //Switching webDriver to new tab
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String actual = googleMaps2.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Google Maps was unavailable.");
        driver.close();
    }


    public void callTheStore() {
        storePhone.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

    }

    public void validateCallTheStore() {
        String expected = mainStorePhone;
        String actual = storePhone.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Element did not match.");
    }

    public void validateOpenHours() {
        String expected = hoursOpen.getText();
        String actual = headerHours.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Hours open did not Match.");
    }

    public void featureCorona() {
        corona.click();
    }

    public void validateFeatureCorona() {
        String expected = "https://corporate.walmart.com/here-for-you";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed: Corona feature is not available.");
    }

    public void bannerNext() {

        int attempts = 0;
        while (attempts < 3) {
            try {
                clickNext.click();

            } catch (Exception e) {
            }
            attempts++;
        }

    }

    public void validateBannerText() {
        String expected = coronaBannerExpected;
        String actual = clickText.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Banner not functional.");
    }

    public void pharmacyDropDown() {
        dropdownPharmacy.click();
    }

    public void validatePharmacyDropDown() {
        String expected = pharmacyChekText;
        String actual = actualPharmacyText.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Pharmacy text not identical.");

    }

    public void searchStore() {
        search.sendKeys(searchKey);
        startSearch.click();
    }

    public void validateSearchStore() {
        String expected = searchExpected;
        String actual = actualResult.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Could not locate results.");


    }


    public void newsEvents() {
        newsElement.click();
    }

    public void validateNewsEvents() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String expected = fbExpected.getText();
        String actual = fbActual.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Texts does not match. Bug Found.");

    }


    public void weeklyAdsCheck() {
        weeklyAd.click();
    }

    public void validateWeeklyAdsCheck() {
        String expected = expectedAdLinkText;
        String actual = actualAdText.getText();
        Assert.assertEquals(actual, expected, "Test Failed, Ad not loaded.");
    }

    public void signUpMethod() {
        emailBox.sendKeys(emailSignupText);
        try {
            signUp.click();
        } catch (Exception e) {
        }

    }

    public void validateSignupMethod() {
        String expected = emailSignupText;
        String actual = actualEmail.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Email does not match as provided.");
    }


    public void digitalMuseumCheck() {
        museumLink.click();

    }

    public void validateDigitalMuseumCheck() {
        String expected = expectedMuseumHeader;
        String actual = museumHeader.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Page does not show expected header.");
    }


    public void clickAppStore() {
        appStore.click();
    }

    public void validateAppStoreRedirection() {
        String expectedLink = expectedAppStoreURL;
        String expectedTitle = expectedAppStoreTitle;
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String actualLink = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualLink, expectedLink, "Test Failed: Did not redirect.");
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: Page Title is not as expected.");

    }

    public void clickPlayStore() {
        playStore.click();
    }

    public void validatePlayStoreRedirection() {
        String expectedLink = expectedPlayStoreURL;
        String expectedTitle = expectedPlayStoreTitle;
        //Switching to a new tab
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        String actualLink = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualLink, expectedLink, "Test Failed: Did not redirect.");
        Assert.assertEquals(actualTitle, expectedTitle, "Test Failed: Page Title is not as expected.");
    }

    @FindBy(how = How.LINK_TEXT, using = clickWalmartPlus)
    public WebElement walmartPlus;

    public void clickWalmartPlus() {
        walmartPlus.click();
    }

    public void validateWalmartPlus() {
        String expected = expectedWPlusURL;
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed, URL provided does not match.");
    }

    public void searchAvailability(String zipcode) {
        streetAddress.sendKeys(zipcode);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        streetAddress.sendKeys(Keys.ARROW_DOWN);
        streetAddress.sendKeys(Keys.ENTER);
        checkAdd.click();
    }

    public void navigateToProductRecall() {
        prodRecall.click();
    }

    public void validateProdRecall(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed: Page did not redirect. ");
    }

    public void clickAccount() {
        clkAcct.click();
        clkAcct2.click();
    }

    public void validateClickAccount(String expected) {
        String actual = getVerifyAcct.getText();
        Assert.assertEquals(actual, expected, "Test Failed.");
    }

    @FindBy(how = How.XPATH, using = trackOrder)
    public WebElement trkOrder;
    @FindBy(how = How.TAG_NAME, using = trackHeader)
    public WebElement trkHdr;

    public void clickTrackOrder() {
        clkAcct.click();
        trkOrder.click();
    }

    public void validateTrackOrder(String expectedURL, String expectedHeader) {
        String actualURL = driver.getCurrentUrl();
        String actualHeader = trkHdr.getText();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed");
        Assert.assertEquals(actualHeader, expectedHeader, "Test Failed");
    }


    public void feedbackMethod() {
        feedbackButton.click();
        giveStars.click();
        wrtComment.sendKeys("Test comment for practice");
        submitReview.click();
    }

    public void clickTellUs() {
        tellUs.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(selectIssueDropdown);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        select.selectByVisibleText("Missing/incorrect store service(s) information");

        commentInput.sendKeys("Testing This Box For Reference. ");
        setComplaint.click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @FindBy(how = How.CSS, using = thankyouText)
    public WebElement getThankyouText;

    public void validateComplaintSubmission(String expected) {
        String actual = getThankyouText.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Provided Text Does not Match");

    }

    @FindBy(how = How.XPATH, using = copyrightActual)
    public WebElement getCopyright;

    public void getCopyRightText(String expected) {
        String actual = getCopyright.getText();
        Assert.assertEquals(actual, expected, "Test Failed.");

    }


    public void navigateToCareers() {
        gotoCareers.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException ex) {
        }
        searchCareers.sendKeys("cashier");
        getSearchCareers.click();

    }


    public void assertCareerSearch(String expected) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actual = careerSearch.getText();
        Assert.assertEquals(actual,expected,"Test Failed.");
    }
    public void findBrokenLinks(String localStoreURL) {

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

            if (!url.startsWith(localStoreURL)) {
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
}
