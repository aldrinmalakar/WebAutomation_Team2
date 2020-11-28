package entertainment;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static entertainment.EntertainmentPageElements.*;

public class EntertainmentPage extends WebAPI {

    @FindBy(how = How.XPATH, using = entertainmentTabHeader)
    public WebElement entertainmentTab;

    @FindBy(how = How.XPATH, using = starsOnHeader)
    public WebElement starsHeader;

    @FindBy(how = How.XPATH, using = topStories)
    public WebElement topStoriesButton;

    @FindBy(how = How.XPATH, using = searchMagnifierOption)
    public WebElement searchMagnifier;

    @FindBy(how = How.XPATH, using = searchBarInput)
    public WebElement searchBar;



    public void navigateToEntertainment() {
    entertainmentTab.click();
    }



    public void searchEntertainmentsPage(String searchTerm){
        searchMagnifier.click();
        searchBar.click();
        clearAndSendKeys(searchBar,searchTerm);

    }

    public void clearAndSendKeys(WebElement element, String keys) {
        element.clear();
        element.sendKeys(keys);
    }

}



