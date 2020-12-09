package CareerPage;


import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class CareerPageWebElements extends CareerHomePage {

    public static final String dropDownSoftware = "/html/body/main/section[2]/div[2]/div[2]/div[4]/ul/li[6]/a/div/h4";
    public static final String dropDownSoftwarePageValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String searchButtonCarrerPage = "/html/body/main/section/div/div/div[1]/form/div[2]/button";
    public static final String walmartCareerUrl = "https://careers.walmart.com/";
    public static final String searchButton = "//*[@id=\"global-search-input\"]";
    public static final String careerValidationWord = "/html/body/div/header/div/a[1]/span";
    public static final String dropDownCorporate = "/html/body/main/section[2]/div[2]/div[1]/nav/ul/li[2]/a";
    public static final String searchButtonsumbit = "//*[@id=\"global-search-input\"]";
    public static final String searchBoxDropDown = "/html/body/main/section[1]/div[2]/div/form/div[1]/div[1]/div/span";
    public static final String storesNClubs = "//*[@id=\"categories\"]/div[2]/label/span";
    public static final String typeInTypeSearchBox = "//*[@id=\"search\"]";
    public static final String customerServiceValidateWord = "/html/body/main/section/div/div/h1";
    public static final String samsClubJobs = "/html/body/main/section[2]/div[2]/div[2]/div[1]/ul/li[1]/a/div/h4";
    public static final String samsClubJobsValidateWord = "body > main > section.hero.hero--has-cta > div.container.grid.grid--spaced.grid--bottom > div > h1";
    public static final String samsManagement = "/html/body/main/section[2]/div[2]/div[2]/div[1]/ul/li[2]/a/div";
    public static final String samsManagementValidateWord = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String walmartManagement = "/html/body/main/section[2]/div[2]/div[2]/div[1]/ul/li[4]/a/div/h4";
    public static final String walmartManagementValidateWord = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String walmartStoreJobs = "/html/body/main/section[2]/div[2]/div[2]/div[1]/ul/li[5]/a/div/h4";
    public static final String walmartStoreValidateWord = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String joinusbuttonecommernce = "/html/body/main/section[3]/div/div[2]/div/div[2]/a";
    public static final String ecommerncepage = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String americaRenewal = "/html/body/main/section[4]/div/div/div[2]/div/a[1]/span";
    public static final String americaRenewalValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String culturalSuccess = "/html/body/main/section[4]/div/div/div[1]/a/div[2]/div/span";
    public static final String culturalSuccessvalidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String dropDownDistributionCenter = "/html/body/main/section[2]/div[2]/div[1]/nav/ul/li[5]/a";
    public static final String distribuationCenter = "/html/body/main/section[2]/div[2]/div[2]/div[5]/ul/li[1]/a/div/h4";
    public static final String distribuationCenterValidation = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String DropDownDriverstrans = "/html/body/main/section[2]/div[2]/div[2]/div[5]/ul/li[2]/a/div/h4";
    public static final String DriversTransValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String searchkeyword = "Career";
    public static final String searchCareerPage = "Customer Service";
    public static final String dropDownHeathcare = "/html/body/main/section[2]/div[2]/div[1]/nav/ul/li[3]/a";
    public static final String dropDownTechnology = "/html/body/main/section[2]/div[2]/div[1]/nav/ul/li[4]/a";
    public static final String dropDownPharmacy = "/html/body/main/section[2]/div[2]/div[2]/div[3]/ul/li[4]/a/div/h4";
    public static final String dropDownPharmacyValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String dropDownCybersecurity = "/html/body/main/section[2]/div[2]/div[2]/div[4]/ul/li[1]/a/div/h4";
    public static final String dropDownCybersecurityValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String dropDownIT = "/html/body/main/section[2]/div[2]/div[2]/div[4]/ul/li[3]/a/div/h4";
    public static final String dropDownITValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String dropDownAccounting = "/html/body/main/section[2]/div[2]/div[2]/div[2]/ul/li[1]/a/div/h4";
    public static final String dropDownAccountingValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String benefitsValidate = "//*[@id=\"header-links\"]/div[1]/a";
    public static final String dropDownSiliconValley = "/html/body/main/section[7]/div/div[2]/div/div[2]/a";
    public static final String dropDownSiliconValleyValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String dropDownCorporateFooter = "/html/body/footer/div/ul/li[6]/a";
    public static final String History = "/html/body/main/div[2]/section/div[1]/div[3]/div[1]/a/img";
    public static final String dropDownHistoryValidate = "/html/body/main/div[1]/div/div[2]/div[1]/h1";
    public static final String guidedByGood = "/html/body/main/section[4]/div/div[2]/div/div[2]/a";
    public static final String opportunityValidate = "//*[@id=\"opportunity-advancement\"]/div/div[2]/section[1]/h2";
    public static final String SharedValuePriorities = "/html/body/main/section[5]/div/div[2]/div/div[2]/a";
    public static final String opendiferentPageValidate = "https://corporate.walmart.com/our-story/working-at-walmart#0000014f-d73a-d36d-adcf-df3b9d0a0000";
    public static final String openaDifferentPageValueUrl = "https://corporate.walmart.com/2018grr/";
    public static final String aboutUS = "https://corporate.walmart.com/our-story";
    public static final String reportValidate = "/html/body/main/article/div[2]/div[2]/div/p[1]/span/span/a";
    public static final String smartBenefits = "/html/body/main/section[4]/div/div/div[2]/a/div[2]/span";
    public static final String studentValidae = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String myHealthURL = "https://one.walmart.com/content/usone/en_us/me/health.html";
    public static final String militaryValidate = "/html/body/segmentation-timeout/div[4]/div[1]/div/div/div[1]/div[2]/p[4]/a";
    public static final String dropDownDC = "/html/body/main/section[8]/div/div[2]/div/div[2]/a";
    public static final String dropDownDCValidate = "/html/body/main/section[1]/div[2]/div/h1";
    public static final String studentURL = "https://careers.walmart.com/students";
    public static final String MilitaryURL = "https://www.walmartcareerswithamission.com/content/people-experience/military.html";
    public static final String dropDownHR = "/html/body/main/section[2]/div[2]/div[2]/div[2]/ul/li[11]/a/div/h4";
    public static final String dropDownHRValidate = "/html/body/main/section[1]/div[2]/div/h1";


}





