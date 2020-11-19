package business;


import common.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static business.BusinessLocators.*;
import static org.openqa.selenium.WebDriver.*;

public class businessPage extends WebAPI {



    @FindBy(how = How.XPATH,using = loginWebElement)
    public WebElement login;
    @FindBy(how = How.ID,using = emailFieldWebElement)
    public WebElement emailField;
    @FindBy(how = How.XPATH,using = passwordFieldWebElement)
    public WebElement passwordField;


    @FindBy(how = How.XPATH,using = checkBoxWebElement)
    public WebElement checkBox;
    @FindBy(how = How.XPATH,using = needHelpWebElement)
    public WebElement needHelp;
    @FindBy(how = How.XPATH,using = HelpDisplay)
    public WebElement helpDisplay;
    @FindBy(how = How.ID,using = dropdownWebElement)
    public WebElement selectDropdown;
    @FindBy(how = How.CLASS_NAME,using = registerWebElement)
    public WebElement register;
    @FindBy(how = How.CLASS_NAME,using = Attribute)
    public WebElement text;
    @FindBy(how = How.XPATH,using = radioButton1WebElement)
    public WebElement radioButtonYES;
    @FindBy(how = How.XPATH,using = getRadioButton2WebElement)
    public WebElement radioButtonNO;
    @FindBy(how = How.XPATH,using = openNewTabWebElement)
    public WebElement openNewTab;
    @FindBy(how = How.XPATH,using = contactUsWebElement)
    public WebElement contactUs;
    @FindBy(how = How.XPATH,using = contactDisWeb)
    public WebElement contactDisplay;
    @FindBy(how = How.XPATH,using = B2BIDWebElement)
    public WebElement B2BID;
    @FindBy(how = How.XPATH,using = search)
    public WebElement Search;
    @FindBy(how = How.XPATH,using = continueWebElement)
    public WebElement continueButton;
    @FindBy(how = How.XPATH,using = erorMessage)
    public WebElement error;
    @FindBy(how = How.XPATH,using = adminWeb)
    public WebElement admin;
    @FindBy(how = How.XPATH,using = adminAssert)
    public WebElement adminValid;
    @FindBy(how = How.XPATH,using = requestSupplementWeb)
    public WebElement RequestSupplement;
    @FindBy(how = How.XPATH,using = numberFieldWeb)
    public WebElement numberField;
    @FindBy(how = How.XPATH,using = vehicleYearWeb)
    public WebElement vehicleYear;
    @FindBy(how = How.XPATH,using = VehicleMakeWeb)
    public WebElement vehicleMake;
    @FindBy(how = How.ID,using = checkClaimWeb)
    public WebElement checkClaim;
    @FindBy(how = How.ID,using = invalidMSGWeb)
    public WebElement invalidMSG;
    @FindBy(how = How.XPATH,using = IRSWebElement)
    public WebElement IRS;
    @FindBy(how = How.XPATH,using = UFTWeb)
    public WebElement EFT;
    @FindBy(how = How.XPATH,using = diplayWeb)
    public WebElement displayMessage;
    @FindBy(how = How.XPATH,using = contactLink)
    public WebElement contact;
    @FindBy(how = How.XPATH,using = assertContact)
    public WebElement validContact;
    @FindBy(how = How.XPATH,using = TermsOfUse)
    public WebElement termsOfUse;
    @FindBy(how = How.XPATH,using = assertTerms)
    public WebElement termsValidate;
    @FindBy(how = How.XPATH,using = autoRepairWeb)
    public WebElement AutoRepair;
    @FindBy(how = How.XPATH,using = autoRepairAssert)
    public WebElement autoRepair;
    @FindBy(how = How.XPATH,using = thirdPartyWebElement)
    public WebElement thirdParty;
    @FindBy(how = How.XPATH,using = businessOwnerWeb)
    public WebElement businessOwner;
    @FindBy(how = How.XPATH,using = validateChild)
    public WebElement StateLogo;
    @FindBy(how = How.XPATH,using = medicalElectronic)
    public WebElement MedicalElectronic;
    @FindBy(how = How.XPATH,using = electronicWeb)
    public WebElement ElectronicText;
    @FindBy(how = How.XPATH,using = medicalEBillingWeb)
    public WebElement medicalEBilling;
    @FindBy(how = How.XPATH,using = verifyWeb)
    public WebElement verify;



    public void validateBusinessTitle() throws InterruptedException {
        Thread.sleep(2000);
        String expectedTitle="State Farm® B2B | Welcome";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,titleFailed);
    }

    public void LoginWithInvalidPassword(){
        emailField.sendKeys(emailData);
        passwordField.sendKeys(passwordData);
        login.click();
    }
    public void validateLoginWithInvalidPassword(){
        WebElement errorMessage = null;// by mist
        boolean b=  errorMessage.isDisplayed();//true
        System.out.println("is displayed ? "+b);
    }

   public void validateCheckBox() throws InterruptedException {
       emailField.sendKeys(emailData);
       passwordField.sendKeys(passwordData);
       Thread.sleep(3000);
       for (int i=0;i<2;i++) {//should return true then false
           checkBox.click();
           System.out.println(checkBox.isSelected());
       }
    }


    public void needHelp(){
        needHelp.click();
    }
    public void validateNeedHelp(){
        boolean b=helpDisplay.isDisplayed();
        System.out.println("is it displayed? "+b);
    }

    public void Dropdown() throws InterruptedException {
        Select slct =new Select(selectDropdown);
        slct.selectByVisibleText("Motorcycle Insurance");
        Thread.sleep(2000);
    }

    public void register(){
        register.click();
    }
    public void validateRegister(){
        String expectedAttribute="normalFont";
        String ActualAttribute=text.getAttribute("class");
        Assert.assertEquals(ActualAttribute,expectedAttribute,"test failed" );
    }


    public void radioButton() throws InterruptedException {
        register.click();
        Thread.sleep(4000);
        radioButtonYES.click();
        boolean radioYES=radioButtonYES.isSelected();
        boolean radioNO=radioButtonNO.isSelected();
        System.out.println("radio 1 is selected after clicking on it :"+radioYES);//true
        System.out.println("radio 2 is unselected after clicking on radio1 :"+radioNO);//false
        radioButtonNO.click();
        Thread.sleep(4000);
        boolean radioYES2=radioButtonYES.isSelected();
        boolean radioNO2=radioButtonNO.isSelected();
        System.out.println("radio yes is selected  :"+radioYES2);//false
        System.out.println("radio no is selected  :"+radioNO2);//true
    }

    public void openNewTab() throws InterruptedException {
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",openNewTab);
        openNewTab.click();
       Thread.sleep(5000);
        Set<String>windowsIds=driver.getWindowHandles();
        Iterator<String> itor=windowsIds.iterator();
        String mainWindow=itor.next();
        String childWindow=itor.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
    }
    public void ValidateOpenNewTab(){
      String actualTabTitle=driver.getTitle();
      String expectedTabTitle="Medical Provider Portal";
      Assert.assertEquals(actualTabTitle,expectedTabTitle,"failed !");

    }


    public void BrokenLinks(){
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }


    public void ContactUs(){
        contactUs.click();
    }
    public void validateContactUs(){
       boolean b =contactDisplay.isDisplayed();
        System.out.println(b);//true
    }


    public void B2BIDButton(){
        B2BID.click();
        Search.sendKeys(emailData);
        continueButton.click();
    }
    public void validateB2BIDButton(){
        boolean a=error.isDisplayed();
        System.out.println("the element is displayed :"+a);
    }


    public void BackForward() throws InterruptedException {
        register.click();
        Thread.sleep(3000);
        navigateBack();
        Thread.sleep(3000);
        navigateForward();
    }
    public void ValidateBackForward(){

        String ExpectedTitle="Contact Us";
        String ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectedTitle,"test failed !");
    }

    public void Admin(){
        admin.click();
    }
    public void ValidateAdmin(){
        boolean abc =adminValid.isDisplayed();
        System.out.println("is displayed :"+abc);
    }

    public void RequestSupplement(){
        RequestSupplement.click();
        numberField.sendKeys("123456789");
        selectOptionByVisibleText(vehicleYear,"2015");
        selectOptionByVisibleText(vehicleMake,"Audi");
        checkClaim.click();
    }
    public void ValidateRequestSupplement(){
        String actualMSGAttribute =invalidMSG.getAttribute("class");
        String expectedMSGAttribute="alert alert-danger";
        Assert.assertEquals(actualMSGAttribute,expectedMSGAttribute,"test failed !");
    }

    public void IRSNewTab() throws InterruptedException {
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",IRS);
        IRS.click();
        Thread.sleep(5000);
        Set<String>windowsIds=driver.getWindowHandles();
        Iterator<String> itor=windowsIds.iterator();
        String mainWindow=itor.next();
        String childWindow=itor.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(5000);
        System.out.println("the title for child window is :"+driver.getTitle());
//        driver.switchTo().window(mainWindow);
//        Thread.sleep(5000);

    }
    public void validateIRSNewTab(){
        String actualChildTitle= driver.getTitle();
        String expectedChildTitle="Forms & Instructions | Internal Revenue Service";
        Assert.assertEquals(actualChildTitle,expectedChildTitle,"test failed !");
    }

    public void EFTLink(){
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",EFT);
        EFT.click();
    }
    public void ValidateEFT(){
        boolean abc=displayMessage.isDisplayed();
        System.out.println("is displayed :"+abc);
    }

    public void LoginIsEnabled(){
        if ( ! login.isEnabled()){
            System.out.println("login button  is not enabled !");
        }else
        {
            System.out.println("login button is enabled");
        }
    }

    public void Contact(){
        contact.click();
    }
    public void ValidateContact(){
        if (validContact.isDisplayed()){
            System.out.println("validation passed !");
        }else
        {
            System.out.println("validation didn't passed !");
        }
    }


    public void TermsOfUse(){
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",termsOfUse);
        termsOfUse.click();
    }
    public void validateTermsOfUse(){
        try{
            termsValidate.isDisplayed();
        }catch (Exception e) {
            System.out.println("not displayed ");
        }
    }

    public void AutoRepair(){
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",thirdParty);
        thirdParty.click();
        AutoRepair.click();
    }
    public void ValidateAutoRepair(){
        if (autoRepair.isDisplayed())
        {
            System.out.println("element displayed ");
        }else
        {
            System.out.println("element not displayed. test failed");
        }
    }


    public void BusinessOwner() throws InterruptedException {
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",businessOwner);
        businessOwner.click();
        Thread.sleep(5000);
        Set<String>windowsIds=driver.getWindowHandles();
        Iterator<String> itor=windowsIds.iterator();
        String mainWindow=itor.next();
        String childWindow=itor.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(5000);
    }
    public void ValidateChildWindow(){
        try{
            StateLogo.isDisplayed();
        }catch (Exception e) {
            System.out.println("the element not displayed ,test failed");
        }

    }

    public void MedicalElectronic(){
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",MedicalElectronic);
        MedicalElectronic.click();
    }
    public void ValidateMedicalElectronic(){

     boolean abc=  ElectronicText.isDisplayed();
        System.out.println("the element is displayed :"+abc);
    }


    public void MedicalEBillingLink(){
        ( (JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",medicalEBilling);
        medicalEBilling.click();
    }
    public void validateMedicalEBillingLink(){
        boolean b=verify.isDisplayed();
        System.out.println("is displayed :"+b);
    }


    public void GoBackToHome() throws InterruptedException {
        register.click();
        Thread.sleep(4000);
        goBackToHomeWindow();
      //  mouseHoverByXpath();
    }





































}
