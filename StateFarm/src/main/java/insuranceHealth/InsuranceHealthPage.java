package insuranceHealth;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static insuranceHealth.InsuranceWebPageElements.*;

public class InsuranceHealthPage extends WebAPI {

    public InsuranceHealthPage() {

    }

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


    public void loginInvalidCredentials(String someId,String somePassword){
        login.click();
        clearAndSendKeys(userId, someId);
        clearAndSendKeys(passwordInput, somePassword);
        loginAfterCredentials.click();
    }

    public void errorDisplaysForInvalidCred(){
        eleIsDisplayed(errorRecordNotFound);
    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void sendKeys(WebElement element, String email) {
        element.clear();
        element.sendKeys(email);
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

    public boolean eleIsDisplayed(WebElement element){
        element.isDisplayed();
        return true;
    }


}
