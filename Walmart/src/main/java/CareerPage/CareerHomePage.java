package CareerPage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static CareerPage.CareerPageWebElements.*;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class CareerHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = searchButton)
    public WebElement searchSpace;
    @FindBy(how = How.XPATH, using = searchButtonsumbit)
    public WebElement searchKey;
    @FindBy(how = How.XPATH, using = careerValidationWord)
    public WebElement careerWord;

    public void SearchBoxCareer() {
        searchSpace.sendKeys(searchkeyword);
        searchKey.submit();
    }

    public void validateSearchBoxCareer() {
        String expextedText = "Careers";
        String actualText = careerWord.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = searchBoxDropDown)
    public WebElement dropDown;
    @FindBy(how = How.XPATH, using = storesNClubs)
    public WebElement storesNClub;
    @FindBy(how = How.XPATH, using = typeInTypeSearchBox)
    public WebElement searchtype;
    @FindBy(how = How.XPATH, using = searchButtonCarrerPage)
    public WebElement searchCareer;
    @FindBy(how = How.XPATH, using = customerServiceValidateWord)
    public WebElement validatecusotmer;

    public void SearchJobs() {
        driver.get(walmartCareerUrl);
        dropDown.submit();
        storesNClub.submit();
        searchtype.sendKeys(searchCareerPage);
        searchCareer.click();
    }

    public void ValidateSearchJobs() {
        String expectedText = "Find the right job for you.";
        String actualText = validatecusotmer.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = samsClubJobs)
    public WebElement samsJob;
    @FindBy(how = How.CSS, using = samsClubJobsValidateWord)
    public WebElement validatesamsjob;

    public void CareerPageSamsJob() {
        driver.get(walmartCareerUrl);
        samsJob.click();
    }

    public void ValidateCareerPageSamsJob() {
        String expectedText = "Sam’s Club Jobs";
        String actualText = validatesamsjob.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = samsManagement)
    public WebElement managementSams;
    @FindBy(how = How.XPATH, using = samsManagementValidateWord)
    public WebElement validatesamsManagementValidateWord;

    public void CareerPageSamsManagement() {
        driver.get(walmartCareerUrl);
        managementSams.click();
    }

    public void ValidateCareerPageSamsManagement() {
        String expectedText = "Sam’s Club Management Jobs";
        String actualText = validatesamsManagementValidateWord.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }


    @FindBy(how = How.XPATH, using = walmartManagement)
    public WebElement managementWalmart;
    @FindBy(how = How.XPATH, using = walmartManagementValidateWord)
    public WebElement validatewalmartManagementWord;

    public void CareerPageWalamrtManagement() {
        driver.get(walmartCareerUrl);
        managementWalmart.click();
    }

    public void ValidateCareerPageWalamrtManagement() {
        String expectedText = "Walmart Management Jobs";
        String actualText = validatewalmartManagementWord.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = joinusbuttonecommernce)
    public WebElement joinbuttonecommernce;
    @FindBy(how = How.XPATH, using = ecommerncepage)
    public WebElement validateecommerncepage;

    public void CareerPageecommerce() {
        driver.get(walmartCareerUrl);
        driver.get(walmartCareerUrl);
        joinbuttonecommernce.click();
    }

    public void ValidateCareerPageecommerce() {
        String expectedText = "eCommerce";
        String actualText = validateecommerncepage.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = americaRenewal)
    public WebElement americaRenewals;
    @FindBy(how = How.XPATH, using = americaRenewalValidate)
    public WebElement validateamericaRenewal;

    public void CareerPageAmericanRenewal() {
        driver.get(walmartCareerUrl);
        americaRenewals.click();
    }

    public void ValidateCareerPageAmericanRenewal() {
        String expectedText = "Made in America";
        String actualText = validateamericaRenewal.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = walmartStoreJobs)
    public WebElement walmartStoreJob;
    @FindBy(how = How.XPATH, using = walmartStoreValidateWord)
    public WebElement validatewalmartStoreWord;

    public void CareerPageWalamrtStoreJobs() {
        driver.get(walmartCareerUrl);
        walmartStoreJob.click();
    }

    public void ValidateCareerPageWalamrtStoreJobs() {
        String expectedText = "Walmart Store Jobs";
        String actualText = validatewalmartStoreWord.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");

    }

    @FindBy(how = How.XPATH, using = dropDownDistributionCenter)
    public WebElement dropDistributionCenter;
    @FindBy(how = How.XPATH, using = distribuationCenter)
    public WebElement distribuateCenter;
    @FindBy(how = How.XPATH, using = distribuationCenterValidation)
    public WebElement validatedistribuationCenter;


    public void CareerpageDropDown() {
        driver.get(walmartCareerUrl);
        dropDistributionCenter.click();
        distribuateCenter.click();
    }

    public void ValidateCareerpageDropDown() {
        String expectedText = "Distribution Centers";
        String actualText = validatedistribuationCenter.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = culturalSuccess)
    public WebElement cultureSuccess;
    @FindBy(how = How.XPATH, using = culturalSuccessvalidate)
    public WebElement validateculturalSuccess;

    public void CareerPageCultualSuccess() {
        driver.get(walmartCareerUrl);
        cultureSuccess.click();
    }

    public void ValidateCareerPageCultualSuccess() {
        String expectedText = "The business of better";
        String actualText = validateculturalSuccess.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }


    @FindBy(how = How.XPATH, using = DropDownDriverstrans)
    public WebElement dropDownDriverstransportation;
    @FindBy(how = How.XPATH, using = DriversTransValidate)
    public WebElement validateDriversTrans;

    public void CareerPageDropDownDriver() {
        driver.get(walmartCareerUrl);
        dropDistributionCenter.click();
        dropDownDriverstransportation.click();
    }

    public void ValidateCareerPageDropDownDriver() {
        String expectedText = "Drivers & Transportation";
        String actualText = validateDriversTrans.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");

    }

    @FindBy(how = How.XPATH, using = dropDownHeathcare)
    public WebElement dropHealthcare;
    @FindBy(how = How.XPATH, using = dropDownPharmacy)
    public WebElement dropPharmacy;
    @FindBy(how = How.XPATH, using = dropDownPharmacyValidate)
    public WebElement validatedropDownPharmacy;

    public void CareerpageDropDownPharmacy() {
        driver.get(walmartCareerUrl);
        dropHealthcare.click();
        dropPharmacy.click();
    }

    public void ValidateCareerpageDropDownPharmacy() {
        String expectedText = "Pharmacy";
        String actualText = validatedropDownPharmacy.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownTechnology)
    public WebElement dropTechnology;
    @FindBy(how = How.XPATH, using = dropDownCybersecurity)
    public WebElement dropCybersecurity;
    @FindBy(how = How.XPATH, using = dropDownCybersecurityValidate)
    public WebElement validatedropDownCybersecurity;

    public void CareerpageDropDownCybersecurity() {
        driver.get(walmartCareerUrl);
        dropTechnology.click();
        dropCybersecurity.click();
    }

    public void ValidateCareerpageDropDownCybersecurity() {
        String expectedText = "Cybersecurity";
        String actualText = validatedropDownCybersecurity.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownIT)
    public WebElement dropDownInfoTech;
    @FindBy(how = How.XPATH, using = dropDownITValidate)
    public WebElement validatedropDownIT;


    public void CareerpageDropDownIT() {
        driver.get(walmartCareerUrl);
        dropTechnology.click();
        dropDownInfoTech.click();
    }

    public void ValidateCareerpageDropDownIT() {
        String expectedText = "Information Technology";
        String actualText = validatedropDownIT.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownCorporate)
    public WebElement dropCorporate;
    @FindBy(how = How.XPATH, using = dropDownAccounting)
    public WebElement dropAccounting;
    @FindBy(how = How.XPATH, using = dropDownAccountingValidate)
    public WebElement validatedropDownAccounting;

    public void CareerpageDropDownAccounting() {
        driver.get(walmartCareerUrl);
        dropCorporate.click();
        dropAccounting.click();
    }

    public void ValidateCareerpageDropDownAccounting() {
        String expectedText = "Accounting and Finance";
        String actualText = validatedropDownAccounting.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownSiliconValley)
    public WebElement dropSiliconValley;
    @FindBy(how = How.XPATH, using = dropDownSiliconValleyValidate)
    public WebElement validateDropDownSiliconValley;

    public void CareerpageDropDownSiliconValley() {
        driver.get(walmartCareerUrl);
        dropSiliconValley.click();
    }

    public void ValidateCareerpageDropDownSiliconValley() {
        String expectedText = "Silicon Valley – enjoy culture and a career";
        String actualText = validateDropDownSiliconValley.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownCorporateFooter)
    public WebElement dropCorporateFooter;
    @FindBy(how = How.XPATH, using = History)
    public WebElement dropHistory;
    @FindBy(how = How.XPATH, using = dropDownHistoryValidate)
    public WebElement validatedropDownHistory;

    public void CareerpagefooterHistory() {
        driver.get(walmartCareerUrl);
        dropCorporateFooter.click();
        driver.get(aboutUS);
        dropHistory.click();
    }

    public void ValidatefooterrHistory() {
        String expectedText = "Our History";
        String actualText = validatedropDownHistory.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = guidedByGood)
    public WebElement goodByGuided;
    @FindBy(how = How.XPATH, using = opportunityValidate)
    public WebElement validateOpportunity;

    public void careerpageOpportunity() {
        driver.get(walmartCareerUrl);
        cultureSuccess.click();
        goodByGuided.click();
        driver.get(opendiferentPageValidate);
    }

    public void ValidateCareerpageOpportunity() {
        String expectedText = "Opportunity & Advancement";
        String actualText = validateOpportunity.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }


    @FindBy(how = How.XPATH, using = SharedValuePriorities)
    public WebElement PrioritiesSharedValue;
    @FindBy(how = How.XPATH, using = reportValidate)
    public WebElement validateReport;

    public void CareerpageShareValues() {
        driver.get(walmartCareerUrl);
        cultureSuccess.click();
        PrioritiesSharedValue.click();
        driver.get(openaDifferentPageValueUrl);
    }

    public void ValidateCareerpageSharedValue() {
        String expectedText = "2019 Global Responsibility Report";
        String actualText = validateReport.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = studentValidae)
    public WebElement validatestudent;

    public void CareerpageStudent() {
        driver.get(walmartCareerUrl);
        driver.get(studentURL);
    }

    public void ValidateCareerpageStudent() {
        String expectedText = "Innovate with heart.";
        String actualText = validatestudent.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = militaryValidate)
    public WebElement validatemilitary;

    public void CareerpageDropDownmilitary() {
        driver.get(walmartCareerUrl);
        driver.get(MilitaryURL);
    }

    public void ValidateCareerpageDropDownMilitary() {
        String expectedText = "Learn more about our Privacy & Security here";
        String actualText = validatemilitary.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownDC)
    public WebElement dropDC;
    @FindBy(how = How.XPATH, using = dropDownDCValidate)
    public WebElement validatedropDownDC;

    public void CareerpageDropDownDC() {
        driver.get(walmartCareerUrl);
        dropDC.click();
    }

    public void ValidateCareerpageDropDownDC() {
        String expectedText = "D.C. Metro – capitalize on where you live";
        String actualText = validatedropDownDC.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = smartBenefits)
    public WebElement dropSmartBenefits;
    @FindBy(how = How.XPATH, using = benefitsValidate)
    public WebElement validateBenefits;

    public void CareerpageSmartBenefits() {
        driver.get(walmartCareerUrl);
        dropSmartBenefits.click();
        driver.get(myHealthURL);
    }

    public void ValidateCareerpageSmartBenefits() {
        String expectedText = "Company";
        String actualText = validateBenefits.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownHR)
    public WebElement dropHR;
    @FindBy(how = How.XPATH, using = dropDownHRValidate)
    public WebElement validatedropDownHR;

    public void CareerpageHR() {
        driver.get(walmartCareerUrl);
        dropCorporate.click();
        dropHR.click();
    }

    public void ValidateCareerpageHR() {
        String expectedText = "Human Resources";
        String actualText = validatedropDownHR.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

    @FindBy(how = How.XPATH, using = dropDownSoftware)
    public WebElement dropSoftware;
    @FindBy(how = How.XPATH, using = dropDownSoftwarePageValidate)
    public WebElement validatedropDownSoftwarePage;

    public void CareerpageDropDownSoftware() {
        driver.get(walmartCareerUrl);
        dropTechnology.click();
        dropSoftware.click();
    }

    public void ValidateCareerpageDropDownSoftware() {
        String expectedText = "Software Development and Engineering";
        String actualText = validatedropDownSoftwarePage.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail Test");
    }

}







