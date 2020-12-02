package testBoaSmallBusiness;

import boaSmallBusiness.SmallBusiness;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class SmallBusinessTest extends WebAPI {
        SmallBusiness smallBusiness;

        @BeforeMethod
        public void gitInit() {
            smallBusiness = PageFactory.initElements(driver, SmallBusiness.class);
        }

        @Test(enabled = false)
        public void checking() throws InterruptedException {
            smallBusiness.checkingWithCredential();
            smallBusiness.validateCheckingCredential();

        }

        @Test(enabled = false)
        public void saving() throws InterruptedException {
            smallBusiness.savingWithCredential();
            smallBusiness.validateSavingCredential();
        }

        @Test(enabled = false)
        public void businessServices() throws InterruptedException {
            smallBusiness.businessServicesWithCredential();
            smallBusiness.validateBusinessServicesCredential();
        }

        @Test(enabled = false)
        public void creditCard() throws InterruptedException {
            smallBusiness.creditCardWithCredential();
            smallBusiness.validateCreditCardCredential();
        }

        @Test(enabled = false)
        public void lending() throws InterruptedException {
            smallBusiness.lendingWithCredential();
            smallBusiness.validateLendingCredential();
        }

        @Test(enabled = false)
        public void investing() throws InterruptedException {
            smallBusiness.investingWithCredential();
            smallBusiness.validateInvestingCredential();
        }

        @Test(enabled = false)
        public void learning() throws InterruptedException {
            smallBusiness.learningWithCredential();
            smallBusiness.validateLearningCredential();

        }

        @Test(enabled = false)
        public void contactUs() throws InterruptedException {
            smallBusiness.contactUsWithCredential();
            smallBusiness.validateContactUsCredential();
        }

        @Test(enabled = false)
        public void help() throws InterruptedException {
            smallBusiness.helpWithCredential();
            smallBusiness.validateHelpCredential();
        }

        @Test(enabled = false)
        public void smallBusinessCommunity() throws InterruptedException {
            smallBusiness.smallBusinessCommunityWithCredential();
            smallBusiness.validateSmallBusinessCredential();
        }

        @Test(enabled = false)
        public void checkingAccount() throws InterruptedException {
            smallBusiness.openCheckingAccountWithCredential();
            smallBusiness.validateOpenCheckingAccountCredential();
        }

        @Test(enabled = false)
        public void openAnAccount() throws InterruptedException {
            smallBusiness.openAnAccountWithCredential();
            smallBusiness.validateOpenAnAccountCredential();
        }

        @Test(enabled = false)
        public void enroll() throws InterruptedException {
            smallBusiness.enrollWithCredential();
            smallBusiness.validateEnrollCredential();
        }

        @Test(enabled = false)
        public void meetCashFlowMonitor() throws InterruptedException {
            smallBusiness.meetCashFlowMonitorWithCredential();
            smallBusiness.validateMeetCashFlowMonitorCredential();
        }

        @Test(enabled = false)
        public void savings1() throws InterruptedException {
            smallBusiness.savings1WithCredential();
            smallBusiness.validateSavings1Credential();
        }

        @Test(enabled = false)
        public void lending1() throws InterruptedException {
            smallBusiness.lending1WithCredential();
            smallBusiness.validateLending1Credential();
        }

        @Test(enabled = false)
        public void lending2() throws InterruptedException {
            smallBusiness.lending2WithCredential();
            smallBusiness.validateLending2Credential();
        }

        @Test(enabled = false)

        public void checking3() throws InterruptedException {
            smallBusiness.checking3WithCredential();
            smallBusiness.validateChecking3Credential();

        }

        @Test(enabled = false)
        public void checking4() throws InterruptedException {
            smallBusiness.checking4WithCredential();
            smallBusiness.validateChecking4Credential();

        }

        @Test(enabled = false)
        public void saving6() throws InterruptedException {
            smallBusiness.saving6WithCredential();
            smallBusiness.validateSaving6Credential();
        }

        @Test(enabled = true)
        public void savings7() throws InterruptedException {
            smallBusiness.savings7WithCredential();
            smallBusiness.validateSavings7Credential();
        }
    }