package statefarmTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
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
    public void TestManageJobAlerts() throws InterruptedException {
        stateFarmCareerPage.manageJobAlertsElements();
        stateFarmCareerPage.validateManageJobAlerts();
    }
}
