package testBetterMoney;

import betterMoneyHabits.BetterMoney;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BetterMoneyTest extends WebAPI {
    BetterMoney betterMoney;
    @BeforeMethod
    public void gitInit(){betterMoney= PageFactory.initElements(driver, BetterMoney.class);}

    @Test(enabled = false)
    public void testMyPriorities() throws InterruptedException {
        betterMoney.myPrioritiesWithCredential();
        betterMoney.validateMyPrioritiesCredential();
    }


    @Test(enabled = false)
    public void testCredit() throws InterruptedException {
        betterMoney.creditWithCredential();
        betterMoney.validateCreditCredential();
    }
    @Test(enabled = false)
    public void testSingIN() throws InterruptedException {
        betterMoney.singINWithCredential();
        betterMoney.validateSingInCredential();
    }
    @Test(enabled = false)
    public void testEnrollInOnlineBanking() throws InterruptedException {
        betterMoney.enrollInOnlineBankingWithCredential();
        betterMoney.validateEnrollInOnlineBankingCredential();
    }
    @Test(enabled = false)
    public void testCredit1() throws InterruptedException {
        betterMoney.creditWithCredential1();
        betterMoney.validateCreditCredential1();
    }
    @Test(enabled = false)
    public void testCredit2() throws InterruptedException {
        betterMoney.creditWithCredential2();
        betterMoney.validateCreditCredential2();
    }
    @Test(enabled = false)
    public void testCredit3() throws InterruptedException {
        betterMoney.creditWithCredential3();
        betterMoney.validateCreditCredential3();
    }

    @Test(enabled = false)
    public void testCredit4() throws InterruptedException {
        betterMoney.creditWithCredential4();
        betterMoney.validateCreditCredential4();
    }
    @Test(enabled = false)
    public void testDebt() throws InterruptedException {
        betterMoney.debtWithCredential();
        betterMoney.validateDebtCredential();
    }
    @Test(enabled = false)
    public void testDebt1() throws InterruptedException {
        betterMoney.debtWithCredential1();
        betterMoney.validateDebtCredential1();
    }
    @Test(enabled = false)
    public void testDebt2() throws InterruptedException {
        betterMoney.debtWithCredential2();
        betterMoney.validateDebtCredential2();
    }
    @Test(enabled = false)
    public void testSavingAndBudgeting() throws InterruptedException {
        betterMoney.savingAndBudgetingWithCredential();
        betterMoney.validateSavingAndBudgetingCredential();
    }
    @Test(enabled = false)
    public void testHomeOwnership() throws InterruptedException {
        betterMoney.homeOwnershipWithCredential();
        betterMoney.validateHomeOwnershipCredential();
    }
    @Test(enabled = false)
    public void testAuto() throws InterruptedException {
        betterMoney.autoWithCredential();
        betterMoney.validateAutoCredential();
    }
    @Test(enabled = false)
    public void testRetirement() throws InterruptedException {
        betterMoney.retirementWithCredential();
        betterMoney.validateRetirementCredential();
    }
    @Test(enabled = false)
    public void testCollege() throws InterruptedException {
        betterMoney.collegeWithCredential();
        betterMoney.validateCollegeCredential();
    }
    @Test(enabled = false)
    public void testPrivacyAndSecurity() throws InterruptedException {
        betterMoney.privacyAndSecurityWithCredential();
        betterMoney.validatePrivacyAndSecurityCredential();
    }
    @Test(enabled = false)
    public void testPersonalBanking() throws InterruptedException {
        betterMoney.personalBankingWithCredential();
        betterMoney.validatePersonalBankingCredential();
    }
    @Test(enabled = false )
    public void testMenu() throws InterruptedException {
        betterMoney.menuWithCredential();
        betterMoney.validateMenuCredential();
    }
    @Test(enabled = true)
    public void testCreditCard() throws InterruptedException {
        betterMoney.SearchCreditCartWithCredential();
        betterMoney.validateSearchCreditCartCredential();
    }
}
