package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static home.HomePageLocators.*;

public class databaseConnector extends WebAPI {
@FindBy(how= How.XPATH,using =signin ) public WebElement Cnnsignin;
@FindBy(how= How.NAME,using =EmailAddress) public WebElement CnnEmailAddress;

public void Cnnsignin(){
    Cnnsignin.click();
}



    }
