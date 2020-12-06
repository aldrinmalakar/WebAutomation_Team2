package insuranceHealth;

import com.google.common.base.Joiner;
import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static utilities.ReadExcel.*;
import static insuranceHealth.InsuranceWebPageElements.*;

public class InsuranceHealthPage extends WebAPI {

    public InsuranceHealthPage() {

    }

    public static List<Integer> firstColumn = new ArrayList<>();
    public static List<String> secondColumn = new ArrayList<>();
    public static List<String> actualUrl = new ArrayList<>();


    @FindBy(how = How.XPATH, using = emailBox)
    public WebElement emailBoxKey;
    @FindBy(how = How.XPATH, using = passwordBoxWal)
    public WebElement password;

    @FindBy(how = How.XPATH, using = loginButton)
    public WebElement login;

    @FindBy(how = How.CSS, using = userIdBox)
    public WebElement userId;

    @FindBy(how = How.CSS, using = passwordBOx)
    public WebElement passwordInput;
    @FindBy(how = How.XPATH, using = loginAfterCredentialsBox)
    public WebElement loginAfterCredentials;

    @FindBy(how = How.XPATH, using = errorRecordNotFoundMessage)
    public WebElement errorRecordNotFound;

    @FindBy(how = How.XPATH, using = findAnAgentNear)
    public WebElement findAnAgent;

    @FindBy(how = How.XPATH, using = enterZipCodeBox)
    public WebElement enterZipCode;

    @FindBy(how = How.XPATH, using = findAgentZipCodeEntered)
    public WebElement findAgentZipEntered;

    @FindBy(how = How.XPATH, using = helpButton)
    public WebElement help;

    @FindBy(how = How.XPATH, using = espanolButton)
    public WebElement espanol;

    @FindBy(how = How.XPATH, using = copyRightText)
    public WebElement copyRight;

    @FindBy(how = How.XPATH, using = payABillButton)
    public WebElement payABill;

    @FindBy(how = How.XPATH, using = enterPhoneNumberBox)
    public WebElement enterPhoneNumber;

    @FindBy(how = How.XPATH, using = enterDOBBox)
    public WebElement enterDOB;

    @FindBy(how = How.XPATH, using = payNowButton)
    public WebElement payNow;

    @FindBy(how = How.XPATH, using = errorMessageForCorrect)
    public WebElement errorMessageBill;

    @FindBy(how = How.XPATH, using = stateFarmLogoPic)
    public WebElement stateFarmLogo;

    @FindBy(how = How.XPATH, using = facebookNavigation)
    public WebElement facebookNav;

    @FindBy(how = How.XPATH, using = goPaperless)
    public WebElement goPaperlessOption;

    @FindBy(how = How.XPATH, using = goPaperlessTextEx)
    public WebElement goPaperlessText;

    @FindBy(how = How.TAG_NAME, using = "a")
    public List<WebElement> linkTags;

    @FindBy(how = How.CLASS_NAME, using = headersList)
    public List<WebElement> headers;

    ConnectToSqlDB connect = new ConnectToSqlDB();


    public void loginInvalidCredentials(String someId, String somePassword) {
        login.click();
        clearAndSendKeys(userId, someId);
        clearAndSendKeys(passwordInput, somePassword);
        loginAfterCredentials.click();
    }

    public void errorDisplaysForInvalidCred() {
        eleIsDisplayed(errorRecordNotFound);
    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void clearAndSendKeysInteger(WebElement element, int number) {
        element.clear();
        element.sendKeys();
    }

    public void findBrokenLinks() {
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

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

    public boolean eleIsDisplayed(WebElement element) {
        element.isDisplayed();
        return true;
    }

    public void findAgentWithZipCode(WebElement element) throws InterruptedException {
        readExcelFile(getFileName(), 0, firstColumn, secondColumn);
        for (int i = 0; i < firstColumn.size(); i++) {
            findAnAgent.click();
            sleepFor(2);
            element.sendKeys(String.valueOf(firstColumn.get(i)));
            findAgentZipEntered.click();
            sleepFor(3);
            String currentUrl = driver.getCurrentUrl();
            actualUrl.add(currentUrl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(homePage);
        }
    }

    public void validateUrlForZipCode() {
        for (int i = 0; i < secondColumn.size(); i++) {
            equalAssertion(actualUrl.get(i), secondColumn.get(i));
        }
    }

    public void equalAssertion(String actual, String expected) {
        Assert.assertEquals(actual, expected, "Failed");
    }

    public void changeLanguageToSpanish() {
        espanol.click();
    }

    public void checkSpanishTitle() {
        equalAssertion(getTitleGeneric(), spanishTitleExpected);
    }

    public String getTitleGeneric() {
        String title = driver.getTitle();
        return title;
    }

    public void navigatingBackToEnglish() {
        changeLanguageToSpanish();
        driver.navigate().refresh();
        driver.navigate().back();
    }

    public void checkEnglishLanguage() {
        equalAssertion(getTitleGeneric(), englishTitleExpected);
    }

    public void scrollDownToCopyright() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollHeight();");
    }

    public void copyRightsDisplayed() {
        eleIsDisplayed(copyRight);
    }

    public void payABillWithInvalidCredentials(String phone, String dob) {
        payABill.click();
        clearAndSendKeys(enterPhoneNumber, phone);
        clearAndSendKeys(enterDOB, dob);
        payNow.click();
    }

    public void checkForInformationError() {
        eleIsDisplayed(errorMessageBill);
    }

    public void stateFarmLogo() {
        stateFarmLogo.click();
    }

    public void checkLogoNavigatesToHome() {
        equalAssertion(englishTitleExpected, getTitleGeneric());
    }

    public void facebookNavigatesNewTab() {
        facebookNav.click();
    }

    public void validateNewTabFacebook() {
        nextTabHandle();
        equalAssertion(getTitleGeneric(), facebookTitleEx);
    }

    public void nextTabHandle() {
        String currentTabHandle = driver.getWindowHandle();
        String newTabHandle = driver.getWindowHandles()
                .stream()
                .filter(handle -> !handle.equals(currentTabHandle))
                .findFirst()
                .get();
        driver.switchTo().window(newTabHandle);
    }

    public void goPaperLess() {
        goPaperlessOption.click();
    }

    public void goPaperlessText() {
        eleIsDisplayed(goPaperlessText);
    }

    public void connectToDB() throws Exception {
        List<String> phone = connect.readDataBase("testStateFarmData", "phoneNumber");
        List<String> dob = connect.readDataBase("testStateFarmData", "dob");
        payABillWithInvalidCredentials(phone.get(0), dob.get(0));
    }

    public void getListOfLinks() {
        String url = "";
        Iterator<WebElement> it = linkTags.iterator();
        while (it.hasNext()) {
            url = it.next().getAttribute("href");
            connect.insertDataFromStringToSqlTable(url, "dep", "link");
            System.out.println(url);
        }

    }

    public void listOfHeaders() {
        String headerName = "";
        List <String> header = new ArrayList<>();
        Iterator<WebElement> it = headers.iterator();
        while (it.hasNext()) {
            headerName = it.next().getText();
            header.add(headerName);
            connect.insertDataFromArrayListToSqlTable(header, "headersList", "headersList");
        }
    }


}
