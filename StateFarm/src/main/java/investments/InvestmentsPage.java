package investments;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static investments.InvestmentsPageWebElements.*;

public class InvestmentsPage extends WebAPI {

    Actions action=new Actions(driver);

    @FindBy(how = How.XPATH,using = webElementInvestment)
    public WebElement investment;

    @FindBy(how = How.XPATH,using = webElementInvestmentAndIRAs)
    public WebElement investmentAndIRAs;

    @FindBy(how=How.XPATH,using=webElementRetirementPlanning)
    public WebElement retirementPlanning;

    @FindBy(how=How.XPATH,using=webElementTraditionalIRA)
    public WebElement traditionalIRA;

    @FindBy(how=How.XPATH,using=webElementRothIRA)
    public WebElement rothIRA;

    @FindBy(how=How.XPATH,using=webElementBusinessRetirement)
    public WebElement businessRetirement;

    @FindBy(how=How.XPATH,using=webElementMutualFunds)
    public WebElement mutualFunds;

    @FindBy(how=How.XPATH,using=webElementSelectingAFund)
    public WebElement selectingAFund;

    @FindBy(how=How.XPATH,using=webElementBlackRockFunds)
    public WebElement blackRockFunds;

    @FindBy(how=How.XPATH,using=webElementAmericanFunds)
    public WebElement americanFunds;

    @FindBy(how=How.XPATH,using=webElementEducationalSavings)
    public WebElement educationalSavings;

    @FindBy(how=How.XPATH,using=webElementCoverDellAccounts)
    public WebElement coverDellAccounts;

    @FindBy(how=How.XPATH,using=webElementEstatePlanning)
    public WebElement estatePlanning;

    @FindBy(how=How.XPATH,using=webElementTrusts)
    public WebElement trusts;

    @FindBy(how=How.XPATH,using=webElementJointAccounts)
    public WebElement jointAccounts;

    @FindBy(how=How.XPATH,using=webElementLifeInsurance)
    public WebElement lifeInsurance;

    @FindBy(how=How.XPATH,using=webElementAnnuities)
    public WebElement annuities;

    @FindBy(how=How.XPATH,using=webElementTheBasics)
    public WebElement theBasics;

    @FindBy(how=How.XPATH,using=webElementGuaranteedIncome)
    public WebElement guaranteedIncome;

    @FindBy(how=How.XPATH,using=webElementFutureIncomePlus)
    public WebElement futureIncomePlus;




//Action

    public void investmentCheck() throws InterruptedException {
        investment.click();
        Thread.sleep(5000);
    }
    public void investmentAndIRAsCheck() throws InterruptedException {
        investment.click();
        investmentAndIRAs.click();
        Thread.sleep(5000);
    }
    public void retirementPlanningCheck() throws InterruptedException {
        investment.click();
        retirementPlanning.click();
        Thread.sleep(5000);
    }
    public void traditionalIRACheck() throws InterruptedException {
        investment.click();
        traditionalIRA.click();
        Thread.sleep(5000);
    }
    public void rothIRACheck() throws InterruptedException {
        investment.click();
        rothIRA.click();
        Thread.sleep(5000);
    } public void businessRetirementCheck() throws InterruptedException {
        investment.click();
        businessRetirement.click();
        Thread.sleep(5000);
    }
    public void mutualFundsCheck() throws InterruptedException {
        investment.click();
        mutualFunds.click();
        Thread.sleep(5000);
    }
    public void selectingAFundCheck() throws InterruptedException {
        investment.click();
        selectingAFund.click();
        Thread.sleep(5000);
    }
    public void blackRockFundsCheck() throws InterruptedException {
        investment.click();
        blackRockFunds.click();
        Thread.sleep(5000);
    }
    public void americanFundsCheck() throws InterruptedException {
        investment.click();
        americanFunds.click();
        Thread.sleep(5000);
    }
    public void educationalSavingsCheck() throws InterruptedException {
        investment.click();
        educationalSavings.click();
        Thread.sleep(5000);
    }
    public void coverDellAccountsCheck() throws InterruptedException {
        investment.click();
        coverDellAccounts.click();
        Thread.sleep(5000);
    }
    public void estatePlanningCheck() throws InterruptedException {
        investment.click();
        estatePlanning.click();
        Thread.sleep(5000);
    }
    public void trustsCheck() throws InterruptedException {
        investment.click();
        trusts.click();
        Thread.sleep(5000);
    }
    public void jointAccountsCheck() throws InterruptedException {
        investment.click();
        jointAccounts.click();
        Thread.sleep(5000);
    }
    public void lifeInsuranceCheck() throws InterruptedException {
        investment.click();
        lifeInsurance.click();
        Thread.sleep(5000);
    }
    public void annuitiesCheck() throws InterruptedException {
        investment.click();
        annuities.click();
        Thread.sleep(5000);
    }
    public void theBasicsCheck() throws InterruptedException {
        investment.click();
        theBasics.click();
        Thread.sleep(5000);
    }
    public void guaranteedIncomeCheck() throws InterruptedException {
        investment.click();
        guaranteedIncome.click();
        Thread.sleep(5000);
    }
    public void futureIncomePlusCheck() throws InterruptedException {
        investment.click();
        futureIncomePlus.click();
        Thread.sleep(5000);
    }





}
