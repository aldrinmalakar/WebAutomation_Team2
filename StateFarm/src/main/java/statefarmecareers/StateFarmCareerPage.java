package statefarmecareers;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utilities.DataReader;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static statefarmecareers.StateFarmCareerElements.*;

public class StateFarmCareerPage extends WebAPI {
    @FindBy(xpath = clickOnCareerLocator)
    public WebElement clickOnCareer;
    @FindBy(how = How.XPATH, using = getCareerLocatorActual)
    public WebElement getCareerActual;
    @FindBy(how = How.LINK_TEXT, using = clickOnJobsSignInLocator)
    public WebElement clickOnJobsSignIn;
    @FindBy(how = How.LINK_TEXT, using = clickCreateNewProfileLocator)
    public WebElement clickCreateNewProfile;
    @FindBy(how = How.CSS, using = sendFirsNameLocator)
    public WebElement sendFirsName;
    @FindBy(how = How.CSS, using = sendLastNameLocator)
    public WebElement sendLastName;
    @FindBy(how = How.CSS, using = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(how = How.CSS, using = sendConfirmEmailLocator)
    public WebElement sendConfirmEmail;
    @FindBy(how = How.CSS, using = sendPhoneLocator)
    public WebElement sendPhone;
    @FindBy(how = How.CSS, using = sendPasswordLocator)
    public WebElement sendPassword;
    @FindBy(how = How.CSS, using = sendConfirmPasswordLocator)
    public WebElement sendConfirmPassword;
    @FindBy(how = How.CSS, using = clickOnAgreeButtonLocator)
    public WebElement clickOnAgreeButton;
    @FindBy(how = How.XPATH, using = clickCreateProfileLocator)
    public WebElement clickCreateProfile;
    @FindBy(how = How.ID, using = validateWelcomeMessageLocator)
    public WebElement validateWelcomeMessage;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = clickOnWorkingHereLocator)
    public WebElement clickOnWorkingHere;
    @FindBy(how = How.LINK_TEXT, using = clickOnCareerHomeLocator)
    public WebElement clickOnCareerHome;
    @FindBy(how = How.XPATH, using = validateCareerHomeLocator)
    public WebElement validateCareerHome;
    @FindBy(how = How.LINK_TEXT, using = clickOnAboutUsLocator)
    public WebElement clickOnAboutUs;
    @FindBy(how = How.XPATH, using = clickOnBenefitsLocator)
    public WebElement clickOnBenefits;
    @FindBy(how = How.XPATH, using = clickOnLocationsLocator)
    public WebElement clickOnLocations;
    @FindBy(how = How.TAG_NAME, using = LocationLocators)
    public List<WebElement> LocationElements;

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

    ConnectToSqlDB connect = new ConnectToSqlDB();

    public void loginUsingConnectDB() throws Exception {
        List<String> firsName = connect.readDataBase("CreateProfile", "FirsName");
        List<String> lastName = connect.readDataBase("CreateProfile", "LastName");
        List<String> email = connect.readDataBase("CreateProfile", "Email");
        List<String> confirmEmail = connect.readDataBase("CreateProfile", "ConfirmEmail");
        List<String> phone = connect.readDataBase("CreateProfile", "Phone");
        List<String> password = connect.readDataBase("CreateProfile", "passwords");
        List<String> confirmPassword = connect.readDataBase("CreateProfile", "ConfrimPassword");
        JobSignInFunctionalityElements(firsName.get(0), lastName.get(0), email.get(0), confirmEmail.get(0)
                , phone.get(0), password.get(0), confirmPassword.get(0));
    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

    public void JobSignInFunctionalityElements(String FirstName, String LastName
            , String Email, String ConfirmEmail, String Phone
            , String Password, String ConfirmPassword) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        navigateToStateFarmCareerPage();
        clickOnJobsSignIn.click();
        clickCreateNewProfile.click();
        clearAndSendKeys(sendFirsName, FirstName);
        clearAndSendKeys(sendLastName, LastName);
        clearAndSendKeys(sendEmail, Email);
        clearAndSendKeys(sendConfirmEmail, ConfirmEmail);
        clearAndSendKeys(sendPhone, Phone);
        clearAndSendKeys(sendPassword, Password);
        clearAndSendKeys(sendConfirmPassword, ConfirmPassword);
        clickOnAgreeButton.click();
        clickCreateProfile.click();
    }

    public void validateJobSignInFunctionalityElements() throws InterruptedException {
        sleepFor(15);
        String expected = "Welcome, Riyad!";
        String actual = validateWelcomeMessage.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void validateJobSignInSQL() throws InterruptedException {
        sleepFor(15);
        String expected = "Welcome, Paulo!";
        String actual = validateWelcomeMessage.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void validateJobSignInDataProvider() throws InterruptedException {
        sleepFor(15);
        String expected = "Welcome, Paulo!";
        String actual = validateWelcomeMessage.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void validateJobSignInDataProvider2() throws InterruptedException {
        sleepFor(15);
        String expected = "Welcome, Leo!";
        String actual = validateWelcomeMessage.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void workingHereLinkElements() throws InterruptedException {
        navigateToStateFarmCareerPage();
        clickOnWorkingHere.click();
        clickOnCareerHome.click();
    }

    public void validateWorkingHereLinkElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Start A Career with the Good Neighbor";
        String actual = validateCareerHome.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void aboutUsLinkElements() throws InterruptedException {
        navigateToStateFarmCareerPage();
        clickOnWorkingHere.click();
        sleepFor(5);
        clickOnAboutUs.click();
    }

    public void validateAboutUsLinkElements() throws InterruptedException {
        sleepFor(5);
        String expected = "About Us | State Farm Careers";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void benefitsLinkElements() throws InterruptedException {
        navigateToStateFarmCareerPage();
        clickOnWorkingHere.click();
        sleepFor(5);
        clickOnBenefits.click();
    }

    public void validateBenefitsLinkElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Outstanding Employee Benefits - State Farm®";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void getListOfLocationsElements() throws InterruptedException {
        navigateToStateFarmCareerPage();
        clickOnWorkingHere.click();
        sleepFor(5);
        clickOnLocations.click();
//        String locationB = "";
        Iterator<WebElement> it = LocationElements.iterator();
        System.out.println("Total list are: " + LocationElements.size());
        while (it.hasNext()) {
            WebElement list = (WebElement) it.next();
//            locationB = it.next().getAttribute("id");
            System.out.println(list.getText() + "  Url Is " + list.getAttribute("id"));
//            System.out.println("---------------------" + locationB);
        }

    }

    public void validateGetListOfLocations() throws InterruptedException {
        sleepFor(5);
        String expected = "Job Locations - State Farm®";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }


}
