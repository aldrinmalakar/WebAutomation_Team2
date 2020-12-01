package entertainment;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utilities.ReadExcel;
import utilities.ReadExcel.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static entertainment.EntertainmentPageElements.*;

public class EntertainmentPage extends WebAPI {

    @FindBy(how = How.XPATH, using = entertainmentTabHeader)
    public WebElement entertainmentTab;

    @FindBy(how = How.XPATH, using = starsOnHeader)
    public WebElement starsHeader;

    @FindBy(how = How.XPATH, using = topStories)
    public WebElement topStoriesButton;

    @FindBy(how = How.XPATH, using = searchMagnifierOption)
    public WebElement searchMagnifier;

    @FindBy(how = How.XPATH, using = searchBarInput)
    public WebElement searchBar;

    @FindBy(how = How.XPATH, using = userIconForLogin)
    public WebElement userIconF;

    @FindBy(how = How.XPATH, using = emailInput)
    public WebElement email;

    @FindBy(how = How.XPATH, using = passwordInput)
    public WebElement password;

    @FindBy(how = How.CSS, using = loginButton)
    public WebElement login;

    @FindBy(how = How.CSS, using = copyRight)
    public WebElement copyRightText;

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();


    public void navigateToEntertainment() {
        entertainmentTab.click();
    }

    public void searchEntertainmentsPage(String searchTerm) {
        searchMagnifier.click();
        searchBar.click();
        clearAndSendKeys(searchBar, searchTerm);

    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void signInUsingInvalidCredentials() {
        userIconF.click();
        ReadExcel.readExcelString(ReadExcel.getFileName(), 1, emails, passwords);
        for (int i = 1; i < emails.size(); i++) {
            clearAndSendKeys(email, emails.get(i));
            clearAndSendKeys(password, passwords.get(i));
            login.click();
            email.clear();
            password.clear();

        }
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

            if (!url.startsWith(homepageUrl)) {
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

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", copyRightText);
    }

    public void validateScrollDown() {
        boolean elemDisplayed = copyRightText.isDisplayed();
        Assert.assertTrue(elemDisplayed, "Failed: Element not displayed");
    }


}



