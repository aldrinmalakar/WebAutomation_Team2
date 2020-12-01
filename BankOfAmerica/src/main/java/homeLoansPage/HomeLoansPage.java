package homeLoansPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homeLoansPage.HomeLoansWebElement.*;

public class HomeLoansPage extends WebAPI {

    Actions action=new Actions(driver);


    @FindBy(how = How.XPATH,using = homeLoansWebElement)
    public WebElement homeLoans;

    @FindBy(how = How.XPATH,using = webElementMortgages)
    public WebElement mortgages;

    @FindBy(how=How.XPATH,using=webElementFinance)
    public WebElement finance;

    @FindBy(how=How.XPATH,using=webElementHomeEquity)
    public WebElement homeEquity;

    @FindBy(how=How.XPATH,using=webElementFirstTimeHomeBuyer)
    public WebElement firstTimeHomeBuyer;

    @FindBy(how=How.XPATH,using=webElementFindAHome)
    public WebElement findAHome;

    @FindBy(how=How.XPATH,using=webElementManageYourLoan)
    public WebElement manageYourLoan;

    @FindBy(how=How.XPATH,using=webElementWealthManagement)
    public WebElement wealthManagement;

    @FindBy(how=How.XPATH,using=webElementMerrillLearnMore)
    public WebElement merrillLearnMore;

    @FindBy(how=How.XPATH,using=webElementBOALearnMore)
    public WebElement BOALearnMore;

    @FindBy(how=How.XPATH,using=webElementAboutUs)
    public WebElement aboutUs;

    @FindBy(how=How.XPATH,using=webElementWhoWeAre)
    public WebElement whoWeAre;

    @FindBy(how=How.XPATH,using=webElementWhatGuidesUs)
    public WebElement whatGuidesUS;

    @FindBy(how=How.XPATH,using=webElementPartneringLocally)
    public WebElement partneringLocally;

    @FindBy(how=How.XPATH,using=webElementNewsRoom)
    public WebElement newsRoom;

    @FindBy(how=How.XPATH,using=webElementInvestorRelations)
    public WebElement investorRelations;

    @FindBy(how=How.XPATH,using=webElementBOACareers)
    public WebElement BOACareers;

    @FindBy(how=How.XPATH,using=webElementSearchTab)
    public WebElement searchTab;

    @FindBy(how=How.XPATH,using=webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how=How.XPATH,using=webElementElementToSearch)
    public WebElement elementToSearch;

    @FindBy(how=How.XPATH,using=webElementSearchButton)
    public WebElement searchButton;


    public void homeLoansCheck() throws InterruptedException {
        homeLoans.click();
        Thread.sleep(5000);
    }

    public void mortgagesCheck() throws InterruptedException {
        mortgages.click();
        Thread.sleep(5000);
    }


    public void financeCheck() throws InterruptedException {
        finance.click();
        Thread.sleep(5000);
    }


    public void homeEquityCheck() throws InterruptedException {
        homeEquity.click();
        Thread.sleep(5000);
    }


    public void firstTimeHomeBuyerCheck() throws InterruptedException {
        firstTimeHomeBuyer.click();
        Thread.sleep(5000);
    }


    public void findAHomeCheck() throws InterruptedException {
        findAHome.click();
        Thread.sleep(5000);
    }


    public void manageYourLoanCheck() throws InterruptedException {
        manageYourLoan.click();
        Thread.sleep(5000);
    }


    public void wealthManagementCheck() throws InterruptedException {
        wealthManagement.click();
        Thread.sleep(5000);
    }


    public void merrillLearnMoreCheck() throws InterruptedException {
        merrillLearnMore.click();
        Thread.sleep(5000);
    }


    public void BOALearnMoreCheck() throws InterruptedException {
        BOALearnMore.click();
        Thread.sleep(5000);
    }


    public void aboutUsCheck() throws InterruptedException {
        aboutUs.click();
        Thread.sleep(5000);
    }


    public void whoWeAreCheck() throws InterruptedException {
        whoWeAre.click();
        Thread.sleep(5000);
    }


    public void whatGuidesUsCheck() throws InterruptedException {
        whatGuidesUS.click();
        Thread.sleep(5000);
    }


    public void partneringLocallyCheck() throws InterruptedException {
        partneringLocally.click();
        Thread.sleep(5000);
    }

    public void newsRoomUsCheck() throws InterruptedException {
        newsRoom.click();
        Thread.sleep(5000);
    }

    public void investorRelationsUsCheck() throws InterruptedException {
        investorRelations.click();
        Thread.sleep(5000);
    }

    public void BOACareersUsCheck() throws InterruptedException {
        BOACareers.click();
        Thread.sleep(5000);
    }

    public void searchTabUsCheck() throws InterruptedException {
        searchTab.click();
        searchBox.sendKeys(webElementElementToSearch);
        searchButton.click();
        Thread.sleep(5000);
    }








}
