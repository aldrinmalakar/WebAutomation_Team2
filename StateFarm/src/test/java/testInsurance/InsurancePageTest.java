package testInsurance;

import common.WebAPI;
import insuranceHealth.InsuranceHealthPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;

import static utilities.ReadExcel.*;
import static utilities.WriteExcelFile.*;

public class InsurancePageTest extends WebAPI {
    InsuranceHealthPage insuranceHealthPage;

    @BeforeMethod
    public void getInit() {
        insuranceHealthPage = PageFactory.initElements(driver, InsuranceHealthPage.class);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        ChromeDriver driver = new ChromeDriver(options);



        //  }
        // private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";
//
//    @Test
//    public void testing (){
//        writeExcel(FILE_NAME);
//    }
//
//

        //private static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/TestExcelFile.xlsx";


        //String url ="https://www.walmart.com/account/trackorder";
//
//    @Test
//    public void sample(){

        //driver.get(url);
//        readExcelFile(FILE_NAME,0);
//        System.out.println(emails);
        //System.out.println(passwords);

//        insuranceHealthPage.sendKeys(insuranceHealthPage.emailBoxKey,emails.get(0));
//        insuranceHealthPage.sendKeys(insuranceHealthPage.password,passwords.get(0));
//        //click sign in

//        for (int i=0; i<emails.size(); i++){
//            insuranceHealthPage.sendKeys(insuranceHealthPage.emailBoxKey,emails.get(i));
//            insuranceHealthPage.sendKeys(insuranceHealthPage.password,passwords.get(i));

        // }

    }
    @DataProvider(name = "InvalidData")
    public Object[][] getData() {

        Object[][] data = new Object[5][2];

        data[0][0] = "Shaila";
        data[0][1] = "1234";
        data[1][0] = "Runa";
        data[1][1] = "5678";
        data[2][0] = "Aldrin";
        data[2][1] = "9101";
        data[3][0] = "Helen";
        data[3][1] = "1121";
        data[4][0] = "Yeti";
        data[4][1] = "3141";

        return data;
    }

    @Test(dataProvider = "InvalidData")
    public void testInvalidCredentials(String someId,String somePassword){
        insuranceHealthPage.loginInvalidCredentials(someId,somePassword);
        insuranceHealthPage.errorDisplaysForInvalidCred();
    }


    @Test
    public void broken() {
        insuranceHealthPage.findBrokenLinks();
    }


}
