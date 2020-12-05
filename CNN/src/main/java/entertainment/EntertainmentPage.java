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

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static entertainment.EntertainmentPageElements.*;

import utilities.WriteExcelFile;
import utilities.WriteExcelFile.*;

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
    @FindBy(how = How.XPATH, using = invalidEmailErrorMessage)
    public WebElement invalidEmailError;

    @FindBy(how = How.CSS, using = loginButton)
    public WebElement login;

    @FindBy(how = How.CSS, using = copyRight)
    public WebElement copyRightText;

    @FindBy(how = How.XPATH, using = closeLoginWindow)
    public WebElement closeLogin;

    @FindBy(how = How.CLASS_NAME, using = allCategories)
    public List<WebElement> allCat;

    @FindBy(how = How.CLASS_NAME, using = copyRightDisplay)
    public WebElement copyRightDis;

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    List<String> allCategoriesList = new ArrayList<>();


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

    public void signInUsingInvalidCredentials() throws InterruptedException {
        ReadExcel.readExcelString(ReadExcel.getFileName(), 1, emails, passwords);
        for (int i = 1; i < emails.size(); i++) {
            userIconF.click();
            clearAndSendKeys(email, emails.get(i));
            clearAndSendKeys(password, passwords.get(i));
            login.click();
            sleepFor(3);
            if
            (isDisplayed(invalidEmailError) == true) {
                closeLogin.click();
            }
        }
    }

    public boolean isDisplayed(WebElement element) {
        element.isDisplayed();
        return true;
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

    public void allCategoriesAreDisplayed() {
        for (WebElement allcategories : allCat) {
            String categories = allcategories.getText();
            allCategoriesList.add(categories);
        }
        ListIterator<String> iterator = allCategoriesList.listIterator(0);
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }

    public void checkAllcategories() {

    }

    public void scrollDownPageUsingRobot() {
        Robot bot = null;
        try {
            bot = new Robot();
        } catch (Exception failed) {
            System.err.println("Failed instantiating Robot: " + failed);
        }
        int mask = InputEvent.BUTTON1_DOWN_MASK;
        bot.mouseMove(100, 100);
        bot.mousePress(mask);
        bot.mouseRelease(mask);
    }

    public void checkIfCopyRightDisplayed(){
        eleDisplayed(copyRightDis);
    }

    public void mouseClickRobotToNavigate(){

    }

    public boolean eleDisplayed(WebElement element){
        element.isDisplayed();
       return true;
    }


    public void rightClickOpenNewTab(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }





}




