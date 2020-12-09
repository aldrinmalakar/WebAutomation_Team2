package testwalmart;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmart.WalmartHomePage;

import java.io.IOException;

public class WalmartPageTest extends WebAPI {


    WalmartHomePage walmartHomePage;

    @BeforeMethod
    public void getInit() {
        walmartHomePage = PageFactory.initElements(driver, WalmartHomePage.class);
    }


    @Test
    public void mouseHoverS() throws InterruptedException {
        walmartHomePage.mouseHoverS();
        walmartHomePage.validateMouseHoverS();
    }


    @Test
    public void radioButton() throws InterruptedException {
        walmartHomePage.radioButton();
        walmartHomePage.validateRadioButton();
    }


    @Test
    public void searchText() throws InterruptedException {
        walmartHomePage.searchText();
        walmartHomePage.validateSearchText();
    }


    @Test
    public void reorderItem() throws InterruptedException {
        walmartHomePage.reorderItem();
        walmartHomePage.validateReorderItems();
    }

    @Test
    public void localStoreS() throws InterruptedException {
        walmartHomePage.localStoreS();
        walmartHomePage.validateLocalStoreS();
    }

    @Test
    public void clickSeeAll() throws InterruptedException {
        walmartHomePage.clickSeeAll();
        walmartHomePage.validateClickSeeAll();
    }

    @Test
    public void pickupAndDelivery() throws InterruptedException {
        walmartHomePage.pickupAndDelivery();
        walmartHomePage.validatePickupAndDelivery();
    }


    @Test
    public void switchButton() throws InterruptedException {
        walmartHomePage.switchButton();
        walmartHomePage.validateSwitchButton();
    }


    @Test
    public void searchBox() throws InterruptedException {
        walmartHomePage.searchBox();
        walmartHomePage.validateSearchBox();
    }


    @Test
    public void clearBoxS() throws InterruptedException {
        walmartHomePage.clearBoxS();
        walmartHomePage.validateClearBoxS();
    }


    @Test
    public void searchIn() throws InterruptedException {
        walmartHomePage.searchIn();
        walmartHomePage.validateSearchIn();
    }
    @Test
    public void signInS() throws InterruptedException {
        walmartHomePage.signInS();
        walmartHomePage.validateSignInS();
    }

    @Test
    public void createAccountS() throws InterruptedException {
        walmartHomePage.createAccountS();
        walmartHomePage.validateAccountS();
    }
    @Test
    public void signInButton() throws InterruptedException {
        walmartHomePage.signInButton();
        walmartHomePage.validateSignInButton();
    }

    @Test
    public void shopCartS() throws InterruptedException {
        walmartHomePage.shopCartS();
    }

    @Test
    public void testExcelWrite() {
        walmartHomePage.checkExcelWrite();
    }

    @Test
    public void testExcelRead() {
        walmartHomePage.checkExcelRead();
    }

    @Test
    public void testDataReader() throws IOException {
        walmartHomePage.checkDataReader();
    }

    @Test
    public void testDataReader1() throws IOException {
        walmartHomePage.checkDataReader1();
    }

    @Test
    public void testDataReader2() throws IOException {
        walmartHomePage.checkDataReader2();
    }

    @Test
    public void testDataReader3() throws IOException {
        walmartHomePage.checkDataReader3();
    }

    @Test
    public void testDataReader4() throws IOException {
        walmartHomePage.checkDataReader4();
    }

    @Test
    public void testOverShop() throws InterruptedException {
        walmartHomePage.mouseOverShop();
    }

    @Test
    public void testWalmartDataBase() throws Exception {
        walmartHomePage.SearchBoxDataBase();
        walmartHomePage.validateBoxDataBase();
    }


    }

