package statefarmTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import statefarmecareers.StateFarmCareerPage;

public class StateFarmCareerTest extends WebAPI {

    static StateFarmCareerPage stateFarmCareerPage;

    @BeforeMethod
    public void getInit() {
        stateFarmCareerPage = PageFactory.initElements(driver, StateFarmCareerPage.class);
    }

//    @Test
//    public void stateFarmHomePage() {
//        stateFarmCareerPage.validateStateFarHomePage();
//    }
//    @Test
//    public void TestStateFarmCareerPage() {
//        stateFarmCareerPage.navigateToStateFarmCareerPage();
//        stateFarmCareerPage.validateStateFarmCareerPage();
//    }

    @Test
    public void TestManageJobAlerts() throws InterruptedException {
        stateFarmCareerPage.manageJobAlertsElements();
//        stateFarmCareerPage.validateManageJobAlerts();
    }
}
