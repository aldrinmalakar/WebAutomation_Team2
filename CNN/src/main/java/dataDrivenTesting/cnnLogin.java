package dataDrivenTesting;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static home.HomePageLocators.*;

public class cnnLogin extends WebAPI {
    @FindBy(how = How.XPATH, using = signin)
    public WebElement Cnnsignin;
    @FindBy(how = How.NAME, using = EmailAddress)
    public WebElement CNnEmailAddress;
    @FindBy(how = How.NAME, using = passsword)
    public WebElement CNnpasssword;

    public void Cnnsignin() {
        Cnnsignin.click();
    }
    public void CNnEmailAddress() {
        CNnEmailAddress.sendKeys("  ");
    }

    public void CNnpasssword() {
        CNnpasssword.sendKeys("  ");
    }
}
