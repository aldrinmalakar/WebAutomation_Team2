package statefarmTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import statefarmecareers.StateFarmCareerPage;

import java.util.concurrent.TimeUnit;

public class StateFarmCareerTest extends WebAPI {
    static StateFarmCareerPage stateFarmCareerPage;

    @BeforeMethod
    public void getInit() {
        stateFarmCareerPage = PageFactory.initElements(driver, StateFarmCareerPage.class);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void stateFarmHomePage() {
        stateFarmCareerPage.validateStateFarHomePage();
    }

    @Test
    public void TestStateFarmCareerPage() throws InterruptedException {
        stateFarmCareerPage.navigateToStateFarmCareerPage();
        stateFarmCareerPage.validateStateFarmCareerPage();
    }

    @Test
    public void JobSignInFunctionality() throws Exception {
        stateFarmCareerPage.loginUsingConnectDB();
        stateFarmCareerPage.validateJobSignInSQL();
    }

    @Test(dataProvider = "ExcelStateFarm", dataProviderClass = WebAPI.class)
    public void JobSignInUsingExcelDataProvider(String FirstName, String LastName
            , String Email, String ConfirmEmail, String Phone
            , String Password, String ConfirmPassword) throws Exception {
        stateFarmCareerPage.JobSignInFunctionalityElements(FirstName, LastName, Email, ConfirmEmail, Phone, Password, ConfirmPassword);
        stateFarmCareerPage.validateJobSignInDataProvider();
    }

    @Test(dataProvider = "TestData")
    public void JobSignInFunctionalityUsingExcel(String firstName, String lastName
            , String email, String confirmEmail, String phone
            , String password, String confirmPassword) throws Exception {
        stateFarmCareerPage.JobSignInFunctionalityElements(firstName, lastName, email, confirmEmail, phone, password, confirmPassword);
        stateFarmCareerPage.validateJobSignInDataProvider2();
    }

    @Test
    public void WorkingHereLink() throws Exception {
        stateFarmCareerPage.workingHereLinkElements();
        stateFarmCareerPage.validateWorkingHereLinkElements();
    }

    @Test
    public void AboutUsLink() throws Exception {
        stateFarmCareerPage.aboutUsLinkElements();
        stateFarmCareerPage.validateAboutUsLinkElements();
    }

    @Test
    public void benefitsLink() throws Exception {
        stateFarmCareerPage.benefitsLinkElements();
        stateFarmCareerPage.validateBenefitsLinkElements();
    }

    @Test
    public void getListOfLocations() throws Exception {
        stateFarmCareerPage.getListOfLocationsElements();
        stateFarmCareerPage.validateGetListOfLocations();
    }

    @DataProvider(name = "TestData")
    public static Object[][] dataProviderMethodGenerator() {
        Object[][] data = {{"Riyad", "Mahrez", "MahrezRiyad1@gmail.com", "MahrezRiyad1@gmail.com", "5087885522", "RiyadMa666!", "RiyadMa666!"}};
        return data;
    }

}
