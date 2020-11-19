package accessibleBanking;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.WeakHashMap;

import static accessibleBanking.accessibleBankingLocators.*;
public class accessibleBankingPage extends WebAPI {






    @FindBy(how = How.XPATH,using = searchBarWebElement)
    public WebElement searchBar;
    @FindBy(how = How.PARTIAL_LINK_TEXT,using =SearchText)
    public WebElement searchText;
    @FindBy(how = How.XPATH,using = okSearchWebElement)
    public WebElement okSearch;






    public void ValidateTitle() throws InterruptedException {

        Thread.sleep(8000);
        String expectedAccessibleTitle="Bank of America | Accessible Banking | Overview";
        String actualAccessibleTitle= driver.getTitle();
        System.out.println("the actual title is "+actualAccessibleTitle);
        Assert.assertEquals(actualAccessibleTitle,expectedAccessibleTitle,titleMessage);
    }


    public void SearchBar() throws InterruptedException {
        Thread.sleep(5000);
        searchBar.sendKeys("deposit");
        okSearch.click();
    }
    public void validateSearchBar(){
    boolean b=  searchText.isDisplayed()  ;
        System.out.println(b);//true

    }

















}
