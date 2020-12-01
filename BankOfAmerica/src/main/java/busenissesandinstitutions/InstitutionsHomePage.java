package busenissesandinstitutions;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import static busenissesandinstitutions.InstitutionsHomePageWebElements.*;


public class InstitutionsHomePage extends WebAPI {


    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions;
    @FindBy(how = How.XPATH, using = BusinessesAndInstitutionsActualTestWebElements)
    public WebElement scheduleAppointmentWebElements;


    public void BusinessesAndInstitutions() throws InterruptedException {
        BusinessesAndInstitutions.click();
        Thread.sleep(3000);
    }
    public void validateBusinessesAndInstitutions(){
        String expectedResult="Global Banking & Markets";
        String actualResult=scheduleAppointmentWebElements.getText();
        //String actualResult=driver.findElement(By.xpath(scheduleAppointmentsActualTestWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions1;
    @FindBy(how = How.ID, using = inspectSearchBoxWebElements)
    public WebElement inspectSearchBox;
    @FindBy(how = How.XPATH, using = inspectSearchBoxActualResultWebElements)
    public WebElement inspectSearchBoxWeb;


    @Test(enabled = false)
    public void inspectSearchBox() throws InterruptedException {
        BusinessesAndInstitutions1.click();
        Thread.sleep(3000);
        inspectSearchBox.click();
        Thread.sleep(3000);
    }
    public void validateInspectSearchBox(){
        String expectedResult="";
        String actualResult=inspectSearchBoxWeb.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions2;
    @FindBy(how = How.ID, using = inspectSearchBox1WebElements)
    public WebElement inspectSearchBox1;
    @FindBy(how = How.CSS, using = fraudSearchBox1sWebElements)
    public WebElement fraudSearchBox1s;
    @FindBy(how = How.XPATH, using = fraudSearchBox1sActualResultWebElements)
    public WebElement fraudSearchBox1sActualWebElements;
    //3

    public void searchBox1() throws InterruptedException {
        BusinessesAndInstitutions2.click();
        Thread.sleep(3000);
        inspectSearchBox1.sendKeys(SearchFraud);
        Thread.sleep(3000);
        fraudSearchBox1s.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.id(inspectSearchBox1WebElements)).sendKeys(SearchFraud);
//        driver.findElement(By.cssSelector(fraudSearchBox1sWebElements)).click();
    }
    public void validateSearchBox1(){
        String expectedResult="Fraud";
        String actualResult=fraudSearchBox1sActualWebElements.getText();
      //  String actualResult=driver.findElement(By.xpath(fraudSearchBox1sActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //4

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions3;
    @FindBy(how = How.ID, using = inspectSearchBox1WebElements)
    public WebElement inspectSearchBox2;
    @FindBy(how = How.XPATH, using = clearFraudWebElements)
    public WebElement clearFraud;
    @FindBy(how = How.XPATH, using = clearFraudActualResultWebElements)
    public WebElement clearFraudActualWebElements;

    public void clearFraud() throws InterruptedException {
        BusinessesAndInstitutions3.click();
        Thread.sleep(3000);
        inspectSearchBox2.sendKeys(SearchFraud);
        Thread.sleep(3000);
        clearFraud.clear();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.id(inspectSearchBox1WebElements)).sendKeys(SearchFraud);
//        driver.findElement(By.xpath(clearFraudWebElements)).clear();
    }
    public void validateClearFraud(){
        //  validate
        String expectedResult="";
        String actualResult=clearFraudActualWebElements.getText();
        //String actualResult=driver.findElement(By.xpath(clearFraudActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //5

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions4;
    @FindBy(how = How.ID, using = searchBox2WebElements)
    public WebElement searchBox2Web;
    @FindBy(how = How.CSS, using = searchBox2GlobalMarketWebElements)
    public WebElement searchBox2GlobalMarket;
    @FindBy(how = How.XPATH, using = searchBox2ActualResultWebElements)
    public WebElement searchBox2ActWebElements;

    public void validateSearchBox2() throws InterruptedException {
        BusinessesAndInstitutions4.click();
        Thread.sleep(3000);
        searchBox2Web.sendKeys(SearchGlobalMarket);
        Thread.sleep(3000);
        searchBox2GlobalMarket.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.id(searchBox2WebElements)).sendKeys(SearchGlobalMarket);
//        driver.findElement(By.cssSelector(searchBox2GlobalMarketWebElements)).click();
    }
    public void validateValidateSearchBox2(){
        String expectedResult="Global+Market";
        String actualResult=searchBox2ActWebElements.getText();
       // String actualResult=driver.findElement(By.xpath(searchBox2ActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //6

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions5;
    @FindBy(how = How.ID, using = searchBox2WebElements)
    public WebElement searchBox3Web;
    @FindBy(how = How.CSS, using = searchBoxESGWebElements)
    public WebElement searchBoxESG;
    @FindBy(how = How.XPATH, using = searchBoxESGActualResultWebElements)
    public WebElement searchBoxESGtWebElements;

    public void searchBox3() throws InterruptedException {
        BusinessesAndInstitutions5.click();
        Thread.sleep(3000);
        searchBox3Web.sendKeys(SearchESG);
        Thread.sleep(3000);
        searchBoxESG.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.id(searchBox2WebElements)).sendKeys(SearchESG);
//        driver.findElement(By.cssSelector(searchBoxESGWebElements)).click();
    }
    public void validateSearchBox3(){
        //validate
        String expectedResult="ESG";
        String actualResult=searchBoxESGtWebElements.getText();
       // String actualResult=driver.findElement(By.xpath(searchBoxESGActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //7
    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions6;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrack;
    @FindBy(how = How.XPATH, using = menuTrackActualResultWebElements)
    public WebElement menuTrackActualWebElements;

    public void humberGurMenu() throws InterruptedException {
        BusinessesAndInstitutions6.click();
        Thread.sleep(3000);
        menuTrack.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(menuTrackWebElements)).click();
    }
    public void validateHumberGurMenu(){
        String expectedResult="";
        String actualResult=menuTrackActualWebElements.getText();
       // String actualResult=driver.findElement(By.xpath(menuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //8

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions7;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrackWeb1;
    @FindBy(how = How.XPATH, using = closeMenuTrackWebElements)
    public WebElement closeMenuTrack;
    @FindBy(how = How.XPATH, using = closeMenuTrackActualResultWebElements)
    public WebElement closeMenuTrackActualWebElements;

    public void closeHumberGurMenu() throws InterruptedException {
        BusinessesAndInstitutions7.click();
        Thread.sleep(3000);
        menuTrackWeb1.click();
        Thread.sleep(3000);
        closeMenuTrack.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(menuTrackWebElements)).click();
//        driver.findElement(By.xpath(closeMenuTrackWebElements)).click();
    }
        public void validateCloseHumberGurMenu(){
        String expectedResult="";
        String actualResult=closeMenuTrackActualWebElements.getText();
       // String actualResult=driver.findElement(By.xpath(closeMenuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //9
    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions8;
    @FindBy(how = How.CSS, using = BankOfAmericaWebElements)
    public WebElement BankOfAmerica;
    @FindBy(how = How.XPATH, using = BankOfAmericaActualResultWebElements)
    public WebElement BankOfAmericaAWebElements;

    public void bankOfAmericaCom() throws InterruptedException {
        BusinessesAndInstitutions8.click();
        Thread.sleep(3000);
        BankOfAmerica.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(BankOfAmericaWebElements)).click();
    }
    public void validateBankOfAmericaCom(){
        String expectedResult="";
        String actualResult=BankOfAmericaAWebElements.getText();
       // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions9;
    @FindBy(how = How.CSS, using = clientLogInWebElements)
    public WebElement clientLogIn;
    @FindBy(how = How.CSS, using = clientLogInPrimePortalWebElements)
    public WebElement clientLogInPrimePortal;
    @FindBy(how = How.XPATH, using = clientLogInActualResultWebElements)
    public WebElement clientLogInActualWebElements;
//10
    public void clientLogIn() throws InterruptedException {
        BusinessesAndInstitutions9.click();
        Thread.sleep(3000);
        clientLogIn.click();
        Thread.sleep(3000);
        clientLogInPrimePortal.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(BankOfAmericaWebElements)).click();
    }
    public void validateClientLogIn(){
        String expectedResult="Client Login";
        String actualResult=clientLogInActualWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions10;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrackWeb;
    @FindBy(how = How.XPATH, using = caseStudiesWebElements)
    public WebElement caseStudies;
    @FindBy(how = How.XPATH, using = caseStudiesActualResultWebElements)
    public WebElement caseStudiesActWebElements;

    //11
    public void caseStudies() throws InterruptedException {
        BusinessesAndInstitutions10.click();
        Thread.sleep(3000);
        menuTrackWeb.click();
        Thread.sleep(3000);
        caseStudies.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(BankOfAmericaWebElements)).click();
    }
    public void validateCaseStudies(){
        String expectedResult="bofamlcasestudies";
        String actualResult=caseStudiesActWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions11;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrackWebA;
    @FindBy(how = How.XPATH, using = inspectAboutWebElements)
    public WebElement inspectAbout;
    @FindBy(how = How.XPATH, using = inspectAboutMouseHoverWebElements)
    public WebElement inspectAboutMouseHover;
    @FindBy(how = How.XPATH, using = validateAboutActualResultWebElements)
    public WebElement validateAboutWebElements;

    //12
    public void inspectAbout() throws InterruptedException {
        BusinessesAndInstitutions11.click();
        Thread.sleep(3000);
        menuTrackWebA.click();
        Thread.sleep(3000);
        inspectAbout.click();
        Thread.sleep(3000);
        inspectAboutMouseHover.click();
        Thread.sleep(3000);
    }
    public void validateInspectAbout(){
        String expectedResult="Experience Matters";
        String actualResult=validateAboutWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions12;
    @FindBy(how = How.XPATH, using = inspectCareersWebElements)
    public WebElement inspectCareers;
    @FindBy(how = How.TAG_NAME, using = inspectCareersActualResultWebElements)
    public WebElement inspectCareersAWebElements;

    //13
    public void inspectCareers() throws InterruptedException {
        BusinessesAndInstitutions12.click();
        Thread.sleep(3000);
        inspectCareers.click();
        Thread.sleep(3000);
    }
    public void validateInspectCareers(){
        String expectedResult="Career Opportunities Across the Globe";
        String actualResult=inspectCareersAWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions13;
    @FindBy(how = How.CSS, using = inspectSeeDetailsWebElements)
    public WebElement inspectSeeDetails;
    @FindBy(how = How.XPATH, using = inspectSeeDetailWebElements)
    public WebElement inspectSeeDetail;
    @FindBy(how = How.XPATH, using = inspectSeeDetailsActualResultWebElements)
    public WebElement inspectSeeDetailsAWebElements;
//14
    public void inspectSeeDetails() throws InterruptedException {
        BusinessesAndInstitutions13.click();
        Thread.sleep(3000);
        inspectSeeDetails.click();
        Thread.sleep(3000);
        inspectSeeDetail.click();
        Thread.sleep(3000);
    }
    public void validateSeeDetails(){
        String expectedResult="Proporcionamos asistencia adicional";
        String actualResult=inspectSeeDetailsAWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions14;
    @FindBy(how = How.CSS, using = inspectFormCRSWebElements)
    public WebElement inspectFormCRS;
    @FindBy(how = How.XPATH, using = clickSaveFormCRSWebElements)
    public WebElement clickSaveFormCRS;
    @FindBy(how = How.XPATH, using = inspectFormCRSActualResultWebElements)
    public WebElement inspectFormCRSActWebElements;
    //15
    public void inspectSaveFormCRS() throws InterruptedException {
        BusinessesAndInstitutions14.click();
        Thread.sleep(3000);
        inspectFormCRS.click();
        Thread.sleep(3000);
        clickSaveFormCRS.click();
        Thread.sleep(3000);
    }
    public void validateSaveFormCRS(){
        String expectedResult="Regulation Best Interest – Form CRS (Customer Relationship Summary)";
        String actualResult=inspectFormCRSActWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions15;
    @FindBy(how = How.CSS, using = inspectBrokerCheckWebElements)
    public WebElement inspectBrokerCheck;
    @FindBy(how = How.XPATH, using = inspectBrokerCheckContinueWebElements)
    public WebElement inspectBrokerCheckContinue;
    @FindBy(how = How.XPATH, using = ContinueActualResultWebElements)
    public WebElement ContinueWebElements;
    //16
    public void inspectBrokerCheck() throws InterruptedException {
        BusinessesAndInstitutions15.click();
        Thread.sleep(3000);
        inspectBrokerCheck.click();
        Thread.sleep(3000);
        inspectBrokerCheckContinue.click();
        Thread.sleep(3000);
    }
    public void validateBrokerCheck(){
        String expectedResult="";
        String actualResult=ContinueWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions16;
    @FindBy(how = How.XPATH, using = inspectContactUsWebElements)
    public WebElement inspectContactUs;
    @FindBy(how = How.TAG_NAME, using = ContactUsActualResultWebElements)
    public WebElement ContactUsActWebElements;

    //17
    public void inspectContactUs() throws InterruptedException {
        BusinessesAndInstitutions16.click();
        Thread.sleep(3000);
        inspectContactUs.click();
        Thread.sleep(3000);
    }
    public void validateContactUs(){
        String expectedResult="Contact Us";
        String actualResult=ContactUsActWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions17;
    @FindBy(how = How.XPATH, using = inspectContactUsWebElements)
    public WebElement inspectContactUsWeb;
    @FindBy(how = How.XPATH, using = inspectDropDownListWebElements)
    public WebElement inspectDropDownList;
    @FindBy(how = How.XPATH, using = inspectDropDownList1WebElements)
    public WebElement inspectDropDownList1;

    //18
    public void inspectDropDawnList() throws InterruptedException {
        BusinessesAndInstitutions17.click();
        Thread.sleep(3000);
        inspectContactUsWeb.click();
        Thread.sleep(3000);
        inspectDropDownList.click();
        Thread.sleep(3000);
        inspectDropDownList1.click();
        Thread.sleep(3000);
    }
    public void validateDropDawnList(){
//        String expectedResult="Global Banking & Markets";
//        String actualResult=validateDropDownListActualWebElements.getText();
//        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
//        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions18;
    @FindBy(how = How.CSS, using = inspectMarketInsightsWebElements)
    public WebElement inspectMarketInsights;
    @FindBy(how = How.XPATH, using = validateMarketInsightsActualResultWebElements)
    public WebElement validateMarketInsightsWebElements;

    //19
    public void inspectMarketInsights() throws InterruptedException {
        BusinessesAndInstitutions18.click();
        Thread.sleep(3000);
        inspectMarketInsights.click();
        Thread.sleep(3000);
    }
    public void validateMarketInsights(){
        String expectedResult="Market Insights";
        String actualResult=validateMarketInsightsWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions19;
    @FindBy(how = How.CSS, using = inspectMarketInsightsWebElements)
    public WebElement inspectMarketInsight;
    @FindBy(how = How.XPATH, using = inspectSaveButtonWebElements)
    public WebElement inspectSaveButton;
    @FindBy(how = How.XPATH, using = validateSaveButtonActualResultWebElements)
    public WebElement validateSaveButtonActualWebElements;

    //20
    public void inspectSaveButton() throws InterruptedException {
        BusinessesAndInstitutions19.click();
        Thread.sleep(3000);
        inspectMarketInsight.click();
        Thread.sleep(3000);
        inspectSaveButton.click();
        Thread.sleep(3000);
    }
    public void validateSaveButton(){
        String expectedResult="Save";
        String actualResult=validateSaveButtonActualWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions20;
    @FindBy(how = How.CSS, using = inspectMarketInsightsWebElements)
    public WebElement inspectMarketInsightW;
    @FindBy(how = How.CSS, using = inspectShareButtonWebElements)
    public WebElement inspectShareButton;
    @FindBy(how = How.XPATH, using = validateShareButtonActualResultWebElements)
    public WebElement validateShareButtonActualResult;

    //21
    public void inspectShareButton() throws InterruptedException {
        BusinessesAndInstitutions20.click();
        Thread.sleep(3000);
        inspectMarketInsightW.click();
        Thread.sleep(3000);
        inspectShareButton.click();
        Thread.sleep(3000);
    }
    public void validateShareButton(){
        String expectedResult="Share:";
        String actualResult=validateShareButtonActualResult.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }



    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions21;
    @FindBy(how = How.CSS, using = inspectMarketInsightsWebElements)
    public WebElement inspectMarketInsightWe;
    @FindBy(how = How.CSS, using = inspectPrintButtonWebElements)
    public WebElement inspectPrintButton;
    @FindBy(how = How.XPATH, using = validatePrintButtonActualResultWebElements)
    public WebElement validatePrintButtonActualResult;

    //22
    public void inspectPrintButton() throws InterruptedException {
        BusinessesAndInstitutions21.click();
        Thread.sleep(3000);
        inspectMarketInsightWe.click();
        Thread.sleep(3000);
        inspectPrintButton.click();
        Thread.sleep(3000);
    }
    public void validatePrintButton(){
        String expectedResult="Print";
        String actualResult=validatePrintButtonActualResult.getText();
        // String actualResult=driver.findElement(By.xpath(BankOfAmericaActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

//23
    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions22;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrackWeb2;
    @FindBy(how = How.XPATH, using = inspectCheckBoxWebElements)
    public WebElement inspectCheckBox;
    @FindBy(how = How.XPATH, using = inspectSelectBoxWebElements)
    public WebElement inspectSelectBox;
    @FindBy(how = How.XPATH, using = validateSelectBoxActualResultWebElements)
    public WebElement validateSelectBoxActualWebElements;

    public void inspectSelectBox() throws InterruptedException {
        BusinessesAndInstitutions22.click();
        Thread.sleep(3000);
        menuTrackWeb2.click();
        Thread.sleep(3000);
        inspectCheckBox.click();
        Thread.sleep(3000);
        inspectSelectBox.click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(BusinessesAndInstitutionsWebElements)).click();
//        driver.findElement(By.cssSelector(menuTrackWebElements)).click();
//        driver.findElement(By.xpath(closeMenuTrackWebElements)).click();
    }
    public void validateSelectBox(){
        String expectedResult="Global Research";
        String actualResult=validateSelectBoxActualWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(closeMenuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    //24
    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions23;
    @FindBy(how = How.CSS, using = menuTrackWebElements)
    public WebElement menuTrackWeb3;
    @FindBy(how = How.XPATH, using = inspectCheckBoxWebElements)
    public WebElement inspectCheckBox1;
    @FindBy(how = How.XPATH, using = inspectSelectBox1WebElements)
    public WebElement inspectSelectBox1Web;
    @FindBy(how = How.XPATH, using = validateSelectBox1ActualResultWebElements)
    public WebElement validateSelectBox1WebElements;

    public void inspectSelectBox1() throws InterruptedException {
        BusinessesAndInstitutions23.click();
        Thread.sleep(3000);
        menuTrackWeb3.click();
        Thread.sleep(3000);
        inspectCheckBox1.click();
        Thread.sleep(3000);
        inspectSelectBox1Web.click();
        Thread.sleep(3000);

    }
    public void validateSelectBox1(){
        String expectedResult="Business Banking";
        String actualResult=validateSelectBox1WebElements.getText();
        // String actualResult=driver.findElement(By.xpath(closeMenuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    //25
    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions24;
    @FindBy(how = How.XPATH, using = inspectClientLogInWebElements)
    public WebElement inspectClientLogIn;
    @FindBy(how = How.CSS, using = selectYourLogInWebElements)
    public WebElement selectYourLogIn;
    @FindBy(how = How.XPATH, using = validateChoseYourLogInActualResultWebElements)
    public WebElement validateChoseYourLogInAcWebElements;

    public void SelectYourLogIn() throws InterruptedException {
        BusinessesAndInstitutions24.click();
        Thread.sleep(3000);
        inspectClientLogIn.click();
        Thread.sleep(3000);
        selectYourLogIn.click();
        Thread.sleep(3000);
    }
    public void validateSelectYourLogIn(){
        String expectedResult="SELECT YOUR LOG IN";
        String actualResult=validateChoseYourLogInAcWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(closeMenuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = inspectCheckBoxSaveOnlineIdWebElements)
    public WebElement inspectCheckBoxSaveOnlineId;
    @FindBy(how = How.XPATH, using = validateCheckBoxIdActualResultWebElements)
    public WebElement validateCheckBoxIdWebElements;

    public void checkBoxId() throws InterruptedException {
        inspectCheckBoxSaveOnlineId.click();
        Thread.sleep(3000);
    }
    public void validateCheckBoxId(){
        String expectedResult=  " Save Online ID";
        String actualResult=validateCheckBoxIdWebElements.getText();
        // String actualResult=driver.findElement(By.xpath(closeMenuTrackActualResultWebElements)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = BusinessesAndInstitutionsWebElements)
    public WebElement BusinessesAndInstitutions25;
    @FindBy(how = How.CSS, using = playVideoWebElements)
    public WebElement playVideo;
    @FindBy(how = How.XPATH, using = playVideContinueWebElements)
    public WebElement playVideContinue;
    @FindBy(how = How.XPATH, using = validatePlayVideoActualResultWebElements)
    public WebElement validatePlayVideoActWebElements;

    public void playVideo() throws InterruptedException {
        BusinessesAndInstitutions25.click();
        Thread.sleep(3000);
        playVideo.click();
        Thread.sleep(3000);
        playVideContinue.click();
        Thread.sleep(3000);
    }
    public void validateOpenAccount(){
        String expectedResult=  "";
        String actualResult=validatePlayVideoActWebElements.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }



















}
