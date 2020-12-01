package walmart;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.DataReader;
import utilities.ReadExcel;
import utilities.WriteExcelFile;

import java.io.IOException;
import java.net.ConnectException;
import java.util.List;

import static walmart.WalmartPageWebElements.*;

public class WalmartHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = mouseHoverWebElement)
    public WebElement mouseHover;
    @FindBy(how = How.XPATH, using = mouseHoverHealthWebElement)
    public WebElement mouseHoverHealth;
    @FindBy(how = How.CSS, using = validateMouseHoverHealthWebElement)
    public WebElement validateMouseHoverHealth;

    public void mouseHoverS() throws InterruptedException {
        Thread.sleep(3000);
        mouseHover.click();
        Thread.sleep(3000);
        mouseHoverHealth.click();
        Thread.sleep(3000);
    }

    public void validateMouseHoverS() {
        String expectedText = "Health";
        String actualText = validateMouseHoverHealth.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = radioButtonWebElement)
    public WebElement radioButton;
    @FindBy(how = How.CSS, using = clickRadioButtonWebElement)
    public WebElement clickRadioButton;
    @FindBy(how = How.XPATH, using = validateRadioButtonWebElement)
    public WebElement validateRadioButton;

    public void radioButton() throws InterruptedException {
        Thread.sleep(3000);
        radioButton.click();
        Thread.sleep(3000);
        clickRadioButton.click();
        Thread.sleep(3000);
    }

    public void validateRadioButton() {
        String expectedText = "Lists";
        String actualText = validateRadioButton.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = radioButtonWebElement)
    public WebElement radioButton1;
    @FindBy(how = How.CSS, using = trackNumberWebElement)
    public WebElement trackNumber;
    @FindBy(how = How.XPATH, using = validateTrackNumberWebElement)
    public WebElement validateTrackNumber;

    public void searchText() throws InterruptedException {
        Thread.sleep(3000);
        radioButton1.click();
        Thread.sleep(3000);
        trackNumber.click();
        Thread.sleep(3000);
    }

    public void validateSearchText() {
        String expectedText = "Track your order";
        String actualText = validateTrackNumber.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = radioButtonWebElement)
    public WebElement radioButton2;
    @FindBy(how = How.XPATH, using = reorderItemsWebElement)
    public WebElement reorderItems;
    @FindBy(how = How.XPATH, using = validateReorderItemsWebElement)
    public WebElement validateReorderItems;

    public void reorderItem() throws InterruptedException {
        Thread.sleep(3000);
        radioButton2.click();
        Thread.sleep(3000);
        reorderItems.click();
        Thread.sleep(3000);
    }

    public void validateReorderItems() {
        String expectedText = "Want to view your items or";
        String actualText = validateReorderItems.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = radioButtonWebElement)
    public WebElement radioButton3;
    @FindBy(how = How.XPATH, using = localStoreWebElement)
    public WebElement localStore;
    @FindBy(how = How.XPATH, using = validateLocalStoreWebElement)
    public WebElement validateLocalStore;
//    @FindBy(how = How.CSS, using = validateLocalStoreWebElement)
//    public WebElement validateLocalStore;

    public void localStoreS() throws InterruptedException {
        Thread.sleep(3000);
        radioButton3.click();
        Thread.sleep(3000);
        localStore.click();
        Thread.sleep(3000);
//        storeFinder.click();
//        Thread.sleep(3000);
    }

    public void validateLocalStoreS() {
        String expectedText = "Store Finder";
        String actualText = validateLocalStore.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = radioButtonWebElement)
    public WebElement radioButton4;
    @FindBy(how = How.CSS, using = clickSeeAllWebElement)
    public WebElement clickSeeAll;
    @FindBy(how = How.XPATH, using = validateSeeAllWebElement)
    public WebElement validateSeeAll;

    public void clickSeeAll() throws InterruptedException {
        Thread.sleep(3000);
        radioButton4.click();
        Thread.sleep(3000);
        clickSeeAll.click();
        Thread.sleep(3000);
    }

    public void validateClickSeeAll() {
        String expectedText = "All Departments";
        String actualText = validateSeeAll.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = pickupAndDeliveryWebElement)
    public WebElement pickupAndDelivery;
    @FindBy(how = How.XPATH, using = validatePickupAndDeliveryWebElement)
    public WebElement validatePickupAndDelivery;

    public void pickupAndDelivery() throws InterruptedException {
        Thread.sleep(3000);
        pickupAndDelivery.click();
        Thread.sleep(3000);
    }

    public void validatePickupAndDelivery() {
        String expectedText = "";
        String actualText = validatePickupAndDelivery.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = switchButtonWebElement)
    public WebElement switchButton;
    @FindBy(how = How.CSS, using = switchButton1WebElement)
    public WebElement switchButton1;
    @FindBy(how = How.XPATH, using = switchButton2WebElement)
    public WebElement switchButton2;
    @FindBy(how = How.XPATH, using = validateSwitchButton2WebElement)
    public WebElement validateSwitchButton2;

    public void switchButton() throws InterruptedException {
        Thread.sleep(3000);
        switchButton.click();
        Thread.sleep(3000);
        switchButton1.click();
        Thread.sleep(3000);
        switchButton2.click();
        Thread.sleep(3000);
    }

    public void validateSwitchButton() {
        String expectedText = "Prevent colds & flu, slide 4 of 5, active";
        String actualText = validateSwitchButton2.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = clickSearchBoxWebElement)
    public WebElement clickSearchBox;
    @FindBy(how = How.XPATH, using = validateSearchBoxWebElement)
    public WebElement validateSearchBox;

    public void searchBox() throws InterruptedException {
        Thread.sleep(3000);
        searchBox.sendKeys(searchGucciPerfume);
        Thread.sleep(3000);
        clickSearchBox.click();
        Thread.sleep(3000);
    }

    public void validateSearchBox() {
        String expectedText = "Results for \"gucci perfume\"";
        String actualText = validateSearchBox.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBoxW;
    @FindBy(how = How.CSS, using = clearBoxWebElement)
    public WebElement clearBox;
    @FindBy(how = How.XPATH, using = validateClearBoxWebElement)
    public WebElement validateClear;

    public void clearBoxS() throws InterruptedException {
        Thread.sleep(3000);
        searchBoxW.sendKeys(searchMakeupBrushes);
        Thread.sleep(3000);
        clearBox.click();
        Thread.sleep(3000);
    }

    public void validateClearBoxS() {
        String expectedText = "";
        String actualText = validateClear.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = searchInWebElement)
    public WebElement searchIn;
    @FindBy(how = How.CSS, using = searchInCellPhoneWebElement)
    public WebElement searchInCellPhone;
    @FindBy(how = How.CSS, using = clickOnSearchBoxWebElement)
    public WebElement clickOnSearchBox;
    @FindBy(how = How.XPATH, using = validateSearchInWebElement)
    public WebElement validateSearchIn;

    public void searchIn() throws InterruptedException {
        Thread.sleep(3000);
        searchIn.click();
        Thread.sleep(3000);
        searchInCellPhone.click();
        Thread.sleep(3000);
        clickOnSearchBox.click();
        Thread.sleep(3000);
    }

    public void validateSearchIn() {
        String expectedText = "All Cell Phones";
        String actualText = validateSearchIn.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = AccountVWebElement)
    public WebElement createAccountV;
    @FindBy(how = How.XPATH, using = signInVWebElement)
    public WebElement signInV;
    @FindBy(how = How.CSS, using = validateSignInVWebElement)
    public WebElement validateSignInV;

    public void signInS() throws InterruptedException {
        Thread.sleep(3000);
        createAccountV.click();
        Thread.sleep(3000);
        signInV.click();
        Thread.sleep(3000);
    }

    public void validateSignInS() {
        String expectedText = "signed in";
        String actualText = validateSignInV.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = AccountVWebElement)
    public WebElement createAccountW;
    @FindBy(how = How.XPATH, using = signInVWebElement)
    public WebElement signInVW;
    @FindBy(how = How.XPATH, using = createAccountSWebElement)
    public WebElement createAccountS;
    @FindBy(how = How.ID, using = firstNameWebElement)
    public WebElement firstName;
    @FindBy(how = How.ID, using = lastNameWebElement)
    public WebElement lastName;
    @FindBy(how = How.ID, using = emailAddressWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.ID, using = passwordWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = submitButtonWebElement)
    public WebElement submitButton;
    @FindBy(how = How.XPATH, using = validateAccountWebElement)
    public WebElement validateAccount;

    public void createAccountS() throws InterruptedException {
        Thread.sleep(3000);
        createAccountW.click();
        Thread.sleep(3000);
        signInVW.click();
        Thread.sleep(3000);
        createAccountS.click();
        Thread.sleep(3000);
        firstName.sendKeys(searchSadia);
        Thread.sleep(3000);
        lastName.sendKeys(searchLabette);
        Thread.sleep(3000);
        emailAddress.sendKeys(searchEmailAddress);
        Thread.sleep(3000);
        password.sendKeys(searchsadia1990);
        Thread.sleep(3000);
        submitButton.submit();
        Thread.sleep(3000);
    }

    public void validateAccountS() {
        ;
    }

    @FindBy(how = How.CSS, using = AccountVWebElement)
    public WebElement createAccountV1;
    @FindBy(how = How.XPATH, using = signInVWebElement)
    public WebElement signInV1;
    @FindBy(how = How.ID, using = enterEmailWebElement)
    public WebElement enterEmail;
    @FindBy(how = How.ID, using = enterPasswordWebElement)
    public WebElement enterPassword;
    @FindBy(how = How.XPATH, using = clickSignInWebElement)
    public WebElement clickSignIn;
    @FindBy(how = How.XPATH, using = validateSignInWebElement)
    public WebElement validateSignIn;

    public void signInButton() throws InterruptedException {
        Thread.sleep(3000);
        createAccountV1.click();
        Thread.sleep(3000);
        signInV1.click();
        Thread.sleep(3000);
        enterEmail.sendKeys(searchEmailAddress);
        Thread.sleep(3000);
        enterPassword.sendKeys(searchsadia1990);
        Thread.sleep(3000);
        clickSignIn.click();
        Thread.sleep(3000);
    }

    public void validateSignInButton() {
        String expectedText = "Walmart.com";
        String actualText = validateSignIn.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    //
    @FindBy(how = How.CSS, using = shopCartSWebElement)
    public WebElement shopCartS;
//    @FindBy(how = How.XPATH, using = signInVWebElement)
//    public WebElement signInV;
//    @FindBy(how = How.CSS, using = validateSignInVWebElement)
//    public WebElement validateSignInV;

    public void shopCartS() throws InterruptedException {
        Thread.sleep(5000);
        shopCartS.click();
        Thread.sleep(3000);
//        signInV.click();
//        Thread.sleep(3000);
    }

    public void validateShopCartS() {
        String expectedText = "signed in";
        String actualText = validateSignInV.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }


    public void checkExcelWrite() {
        WriteExcelFile obj = new WriteExcelFile();
        obj.writeExcel("Text.xlsx");
    }

    public void checkExcelRead() {
        ReadExcel obj = new ReadExcel();
        obj.readExcelFile("../Walmart/DataTest/WalmartExcel.xlsx", 0);
    }

    public void checkDataReader() throws IOException {
        DataReader obj = new DataReader();
        String[] searchItem = obj.fileReader2("../Walmart/DataTest/WalmartExcel.xlsx", 0);
        searchBox.click();
        typeOnElement(searchBoxWebElement, searchItem[1]);

    }

    public void checkDataReader1() throws IOException {
        DataReader obj = new DataReader();
        String[] searchItem = obj.fileReader2("../Walmart/DataTest/WalmartExcel.xlsx", 0);
        searchBox.click();
        typeOnElement(searchBoxWebElement, searchItem[2]);

    }

    public void checkDataReader2() throws IOException {
        DataReader obj = new DataReader();
        String[] searchItem = obj.fileReader2("../Walmart/DataTest/WalmartExcel.xlsx", 0);
        searchBox.click();
        typeOnElement(searchBoxWebElement, searchItem[3]);
    }

    public void checkDataReader3() throws IOException {
        DataReader obj = new DataReader();
        String[] searchItem = obj.fileReader2("../Walmart/DataTest/WalmartExcel.xlsx", 0);
        searchBox.click();
        typeOnElement(searchBoxWebElement, searchItem[4]);
    }

    public void checkDataReader4() throws IOException {
        DataReader obj = new DataReader();
        String[] searchItem = obj.fileReader2("../Walmart/DataTest/WalmartExcel.xlsx", 0);
        searchBox.click();
        typeOnElement(searchBoxWebElement, searchItem[5]);
    }

    @FindBy(how = How.XPATH, using = getMouseHoverWebElement)
    public WebElement getMouseHover;

    public void mouseOverShop() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(getMouseHover).perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.js-content:nth-child(1) div.page-wrapper div.page-full-wrapper div.js-header-content section.js-header-content.js-header.bigger-fontsize-and-cursor-with-padding div.bg_a div.bg_b:nth-child(3) div.b_a.bg_b.bg_c.b_f:nth-child(2) div.b_a.bg_e.b_t form.b_a.a8_a.mweb-Typeahead-form:nth-child(2) div.o_a.o_aq.o_x.o_ah.o_az.o_o.o_f.a6_a:nth-child(2) div.b_a.a6_f.b_t div.o_a.o_af.b_a.a6_f.b_i.b_f.b_r.b_c:nth-child(3) > button.g_a.o_a.o_aw.o_l.o_b.a6_c:nth-child(3)"))).click();
        Thread.sleep(3000);
    }


    @FindBy(how = How.XPATH, using = validateSearchBoxDataBaseWebElement)
    public WebElement validateSearchBoxDataBase;

    public void SearchBoxDataBase() throws Exception {
        ConnectToSqlDB obj = new ConnectToSqlDB();
        List<String> tesTData = obj.readDataBase("Walmart_Data", "Walmart_Value");
        searchBox.sendKeys(tesTData.get(0));
        clickSearchBox.click();
    }

    public void validateBoxDataBase() {
        String expectedText = "Shop Mattress by";
        String actualText = validateSearchBoxDataBase.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }




}