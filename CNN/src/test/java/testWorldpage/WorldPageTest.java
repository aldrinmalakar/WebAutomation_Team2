package testWorldpage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import worldpage.WorldPageHome;

public class WorldPageTest extends WebAPI {

WorldPageHome worldPageHome;
@BeforeMethod
    public void getInit(){worldPageHome= PageFactory.initElements(driver,WorldPageHome.class);}


























}








