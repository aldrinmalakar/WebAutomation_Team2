package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class HomePageTest extends WebAPI {
    HomePage homepage;
    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,HomePage.class);
    }

//    @Test(enabled = false)
//    public void CheckTitle(){
//        homepage.CheckTitle();
//
//    }
//    @Test(enabled = true)
//    public void connectToSqlDatabase() throws SQLException, IOException, ClassNotFoundException {
//        homepage. connectToSqlDatabase();
//
//    }



    }












