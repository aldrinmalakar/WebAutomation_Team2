package testInvestment;

import common.WebAPI;
import investments.InvestmentsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvestmentPageTest extends WebAPI {

    InvestmentsPage investments;

    @BeforeMethod
    public void getInit() {
        investments = PageFactory.initElements(driver, InvestmentsPage.class);
    }

    @Test(enabled = true)
    public void testInvestments() throws InterruptedException {
        investments.investmentCheck();
    }

    @Test(enabled = true)
    public void testInvestmentAndIRAsCheck() throws InterruptedException {
        investments.retirementPlanningCheck();
    }

    @Test(enabled = true)
    public void testTraditionalIRACheck() throws InterruptedException {
        investments.traditionalIRACheck();
    }


    @Test(enabled = true)
    public void testRothIRACheck() throws InterruptedException {
        investments.rothIRACheck();
    }

    @Test(enabled = true)
    public void testBusinessRetirementCheck() throws InterruptedException {
        investments.businessRetirementCheck();
    }

    @Test(enabled = true)
    public void testMutualFundsCheck() throws InterruptedException {
        investments.mutualFundsCheck();
    }

    @Test(enabled = true)
    public void testSelectingAFundCheck() throws InterruptedException {
        investments.selectingAFundCheck();
    }

    @Test(enabled = true)
    public void testBlackRockFundsCheck() throws InterruptedException {
        investments.blackRockFundsCheck();
    }

    @Test(enabled = true)
    public void testAmericanFundsCheck() throws InterruptedException {
        investments.americanFundsCheck();
    }

    @Test(enabled = true)
    public void testEducationalSavingsCheck() throws InterruptedException {
        investments.educationalSavingsCheck();
    }

    @Test(enabled = true)
    public void testCoverDellAccountsCheck() throws InterruptedException {
        investments.coverDellAccountsCheck();
    }

    @Test(enabled = true)
    public void testEstatePlanningCheck() throws InterruptedException {
        investments.estatePlanningCheck();
    }
    @Test(enabled = true)
    public void testTrustsCheck() throws InterruptedException {
        investments.trustsCheck();
    }

    @Test(enabled = true)
    public void testJointAccountsCheck() throws InterruptedException {
        investments.jointAccountsCheck();
    }

    @Test(enabled = true)
    public void testLifeInsuranceCheck() throws InterruptedException {
        investments.lifeInsuranceCheck();
    }

    @Test(enabled = false)
    public void testAnnuitiesCheck() throws InterruptedException {
        investments.annuitiesCheck();
    }

    @Test(enabled = false)
    public void testTheBasicsCheck() throws InterruptedException {
        investments.theBasicsCheck();
    }

    @Test(enabled = false)
    public void testGuaranteedIncomeCheck() throws InterruptedException {
        investments.guaranteedIncomeCheck();
    }

    @Test(enabled = false)
    public void testFutureIncomePlusCheck() throws InterruptedException {
        investments.futureIncomePlusCheck();
    }




}
