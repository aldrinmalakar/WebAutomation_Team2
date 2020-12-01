package dataDrivenHomePageTesting;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdata extends WebAPI {
    HomePage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(dataProvider = "Cnndata")
    public void enterKeywords(String userName, String password) throws InterruptedException {
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[6]/div[1]/*[1]")).click();
        driver.findElement(By.name("loginEmail")).sendKeys(userName);
        driver.findElement(By.name("loginPassword")).sendKeys(password);
        driver.findElement(By.id("login-form-button")).click();
        Thread.sleep(5000);
        //Assert.assertTrue(driver.getTitle().contains(""));

    }

    @DataProvider(name = "Cnndata")
    public Object[][] passData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "admin1";
        data[0][1] = "demo1";
//test case num2
        data[1][0] = "admin";
        data[1][1] = "demo23";
//test cases num3
        data[2][0] = "admin2";
        data[2][1] = "demo565";
        return data;


    }


}
