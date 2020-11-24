package cnnTech;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static cnnTech.techPageElements.*;

public class TechPage extends WebAPI {
    public void switchTab() {
        threadSleep(2000);
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
    }

    public void navigateToTestPage(String URL) {
        driver.get(URL);
    }

    public void assertHomePage() {
        assertURL(testHomeURL);
    }
    public void openLiveTV(){
        clickByCss(liveTVElement);
        sleepFor(2);
        clickByCss(liveTVPlayElement);
        sleepFor(2);
    }

    public void AssertOpenLiveTV(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected,"Test Failed");
    }

    public void changeEdition() {
    }

    public void AssertChangeEdition() {
    }
}
