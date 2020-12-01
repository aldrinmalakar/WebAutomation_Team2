package statefarmecareers;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static statefarmecareers.StateFarmCareerElements.*;
public class StateFarmCareerPage extends WebAPI {
    @FindBy(xpath = clickOnCareerLocator)
    public WebElement clickOnCareer;
    @FindBy(how = How.XPATH, using = getCareerLocatorActual)
    public WebElement getCareerActual;
    @FindBy(how = How .XPATH, using = clickJobAlertsLocator)
    public WebElement clickJobAlerts;
    @FindBy(how = How.XPATH, using = sendFirstNameLocator)
    public WebElement sendFirstName;
    @FindBy(how = How.NAME, using = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(how = How.NAME, using = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(how = How.NAME, using = clickCheckBoxLocator)
    public WebElement clickCheckBox;
    @FindBy(how = How.NAME, using = clickSaveLocator)
    public WebElement clickSave;
    @FindBy(how = How.XPATH, using = validateCreateAccountLocator)
    public WebElement validateCreateAccount;
    public void validateStateFarHomePage() {
        String expected = "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void navigateToStateFarmCareerPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        clickOnCareer.click();
    }

    public void validateStateFarmCareerPage() {
        String expected = "CAREERS";
        String actual = getCareerActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void manageJobAlertsElements() throws InterruptedException {
        navigateToStateFarmCareerPage();
        sleepFor(5);
        clickJobAlerts.click();
        sleepFor(5);
        Actions action = new Actions(driver);
        action.moveToElement(sendFirstName).perform();
        sendFirstName.sendKeys("Alaeddine");
        sendLastName.sendKeys("Kramou");
        sendEmail.sendKeys("kramon@gmail.com");
        clickCheckBox.click();
        clickSave.click();
    }

    public void validateManageJobAlerts() {
        String expected = "Thank you. This message confirms that we've received your information. ";
        String actual = validateCreateAccount.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }
}
