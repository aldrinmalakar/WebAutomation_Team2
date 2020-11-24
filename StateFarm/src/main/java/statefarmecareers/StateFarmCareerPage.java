package statefarmecareers;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static statefarmecareers.StateFarmCareerElements.*;

public class StateFarmCareerPage extends WebAPI {

    @FindBy(xpath = clickOnCareerLocator)
    public WebElement clickOnCareer;
    //    @FindBy(how = How.CSS, using = clickOnCareerLocator)
    //    public WebElement clickOnCareer;
    @FindBy(how = How.XPATH, using = getCareerLocatorActual)
    public WebElement getCareerActual;
    //Job Alerts Locator
    @FindBy(how = How .XPATH, using = clickJobAlertsLocator)
    public WebElement clickJobAlerts;
    @FindBy(how = How.ID, using = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(how = How.CSS, using = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(how = How.CSS, using = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(how = How.CSS, using = clickCheckBoxLocator)
    public WebElement clickCheckBox;
    @FindBy(how = How.CSS, using = clickSaveLocator)
    public WebElement clickSave;

    public void validateStateFarHomePage() {
        String expected = "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void navigateToStateFarmCareerPage() {
        Actions action = new Actions(driver);
        action.moveToElement(clickOnCareer).click();
    }

    public void validateStateFarmCareerPage() {

        String expected = "CAREERS";
        String actual = getCareerActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void manageJobAlertsElements() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(clickOnCareer).build().perform();
//        clickOnCareer.click();
//        sleepFor(5);
//        action.moveToElement(clickJobAlerts).click();
//        clickJobAlerts.click();
//        sendFirstName.sendKeys("Alaeddine");
//        sendLastName.sendKeys("Kramou");
//        sendEmail.sendKeys("kramon@gmail.com");
//        clickCheckBox.click();
//        clickSave.click();
    }

    public void validateManageJobAlerts() {
        String expected = "STATE FARM® CAREERS";
        String actual = getCareerActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }
}
