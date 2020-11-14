package backOfAmericaAutoLoan;

import common.WebAPI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import static backOfAmericaAutoLoan.autoLoanPageElements.*;

public class AutoLoanPage extends WebAPI{
    //Selecting the state: DC
    @FindBy (how = How.ID, using = selectStateID)
    public WebElement selectStateDD;
    @FindBy (how = How.ID, using = goSelectedState)
    public WebElement goState;

    public void navigateToTestPage(String URL) {
        driver.get(URL);
    }

    public void selectStateAlert() {
        Select select = new Select(selectStateDD);
        select.selectByVisibleText("District Of Columbia");
        goState.click();

    }


}
