package TestCareerPage;

import CareerPage.CareerHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class CareerPageTest extends WebAPI {
    CareerHomePage careerHomePage;

    @BeforeMethod
    public void getInit() {
        careerHomePage = PageFactory.initElements(driver, CareerHomePage.class);
    }

    @Test
    public void testSearchBoxCareer() {
        careerHomePage.SearchBoxCareer();
        careerHomePage.validateSearchBoxCareer();
    }

    @Test
    public void testSearchJobs() {
        careerHomePage.SearchJobs();
        careerHomePage.ValidateSearchJobs();
    }

    @Test
    public void testCareerPageSamsJob() {
        careerHomePage.CareerPageSamsJob();
        careerHomePage.ValidateCareerPageSamsJob();
    }

    @Test
    public void testCareerPageSamsManagement() {
        careerHomePage.CareerPageSamsManagement();
        careerHomePage.ValidateCareerPageSamsManagement();
    }

    @Test
    public void testCareerPageWalamrtManagement() {
        careerHomePage.CareerPageWalamrtManagement();
        careerHomePage.ValidateCareerPageWalamrtManagement();
    }


    @Test
    public void testCareerPageecommerce() {
        careerHomePage.CareerPageecommerce();
        careerHomePage.ValidateCareerPageecommerce();
    }


    @Test
    public void testCareerPageAmericanRenewal() {
        careerHomePage.CareerPageAmericanRenewal();
        careerHomePage.ValidateCareerPageAmericanRenewal();
    }


    @Test
    public void testCareerPageWalamrtStoreJobs() {
        careerHomePage.CareerPageWalamrtStoreJobs();
        careerHomePage.ValidateCareerPageWalamrtStoreJobs();
    }


    @Test
    public void testCareerpageDropDown() {
        careerHomePage.CareerpageDropDown();
        careerHomePage.ValidateCareerpageDropDown();
    }


    @Test
    public void testCareerPageCultualSuccess() {
        careerHomePage.CareerPageCultualSuccess();
        careerHomePage.ValidateCareerPageCultualSuccess();
    }


    @Test
    public void testCareerPageDropDownDriver() {
        careerHomePage.CareerPageDropDownDriver();
        careerHomePage.ValidateCareerPageDropDownDriver();
    }


    @Test
    public void testCareerpageDropDownPharmacy() {
        careerHomePage.CareerpageDropDownPharmacy();
        careerHomePage.ValidateCareerpageDropDownPharmacy();
    }

    @Test
    public void testCareerpageDropDownCybersecurity() {
        careerHomePage.CareerpageDropDownCybersecurity();
        careerHomePage.ValidateCareerpageDropDownCybersecurity();
    }

    @Test
    public void testCareerpageDropDownIT() {
        careerHomePage.CareerpageDropDownIT();
        careerHomePage.ValidateCareerpageDropDownIT();
    }

    @Test
    public void testCareerpageDropDownAccounting() {
        careerHomePage.CareerpageDropDownAccounting();
        careerHomePage.ValidateCareerpageDropDownAccounting();
    }

    @Test
    public void testCareerpageDropDownSiliconValley() {
        careerHomePage.CareerpageDropDownSiliconValley();
        careerHomePage.ValidateCareerpageDropDownSiliconValley();
    }

    @Test
    public void testCareerpagefooterHistory() {
        careerHomePage.CareerpagefooterHistory();
        careerHomePage.ValidatefooterrHistory();
    }

    @Test
    public void testCareerpageDropDownDiversity() {
        careerHomePage.careerpageOpportunity();
        careerHomePage.ValidateCareerpageOpportunity();
    }

    @Test
    public void testCareerpageShareValues() {
        careerHomePage.CareerpageShareValues();
        careerHomePage.ValidateCareerpageSharedValue();
    }

    @Test
    public void testCareerpageStudent() {
        careerHomePage.CareerpageStudent();
        careerHomePage.ValidateCareerpageStudent();
    }

    @Test
    public void testCareerpageDropDownmilitary() {
        careerHomePage.CareerpageDropDownmilitary();
        careerHomePage.ValidateCareerpageDropDownMilitary();
    }

    @Test
    public void testCareerpageDropDownDC() {
        careerHomePage.CareerpageDropDownDC();
        careerHomePage.ValidateCareerpageDropDownDC();
    }

    @Test
    public void testCareerpageSmartBenefits() {
        careerHomePage.CareerpageSmartBenefits();
        careerHomePage.ValidateCareerpageSmartBenefits();
    }

    @Test
    public void testCareerpageHR() {
        careerHomePage.CareerpageHR();
        careerHomePage.ValidateCareerpageHR();
    }

    @Test
    public void testCareerpageDropDownSoftware() {
        careerHomePage.CareerpageDropDownSoftware();
        careerHomePage.ValidateCareerpageDropDownSoftware();

    }


}
