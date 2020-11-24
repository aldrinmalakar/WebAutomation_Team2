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

public class dataBaseTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
 @Test
    public void testDB() throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver")   ;
     System.out.println("Driver loaded");
   Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt","root","root");
    System.out.println("Connected to Db");

  Statement smt=  con.createStatement();
  ResultSet rs= smt.executeQuery("select * from employeeinfo");
  while (rs.next()){
  String name=   rs.getString("name");
  System.out.println("Database record is:"+name);
  }
 }








    }
