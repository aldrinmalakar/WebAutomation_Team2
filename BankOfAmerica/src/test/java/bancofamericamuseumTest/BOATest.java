package bancofamericamuseumTest;

import bankofamericamuseum.BOAHmePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BOATest extends WebAPI {
    static BOAHmePage boaHmePage;
    @BeforeMethod
    public void getInit() {
        boaHmePage = PageFactory.initElements(driver, BOAHmePage.class);
    }
    @Test
    public void BOAHomePage() {
        boaHmePage.validateBOAHomePage();
    }
    @Test
    public void LocationPage() {
        boaHmePage.navigateToLocationPage();
        boaHmePage.validateLocationPage();
    }
    @Test
    public void openFilterFunctions() throws InterruptedException {
        boaHmePage.openFilterFunctions();
        boaHmePage.validateOpenFilterFunctions();
    }
    @Test
    public void closeFilterFunctions() throws InterruptedException {
        boaHmePage.closeFilterFunctions();
    }
    @Test
    public void SearchBox() throws InterruptedException {
        boaHmePage.newYorkInSearchBox();
        boaHmePage.validateNewYorkInSearchBox();
    }
    @Test
    public void findLocationByState() throws InterruptedException {
        boaHmePage.searchLocationByState();
        boaHmePage.validateSearchLocationByState();
    }
    @Test
    public void checkNearMeButtonMap() throws InterruptedException {
        boaHmePage.checkNearMeButton();
        boaHmePage.validateCheckNearMeButton();
    }
    @Test
    public void validateTheLocationInMap() throws InterruptedException {
        boaHmePage.validateLocationInMap();
    }
    @Test
    public void LocationByFilters() throws InterruptedException {
        boaHmePage.searchLocationUsingFilters();
        boaHmePage.validateSearchLocationByFilters();
    }
    @Test
    public void investingMerrillHomePage() throws InterruptedException {
        boaHmePage.merrillHomePage();
        boaHmePage.validateMerrillHomePage();
    }
    @Test
    public void PlayReinventingVideoMerrill() throws InterruptedException {
        boaHmePage.playVideoMerrillElement();
        boaHmePage.validatePlayVideoMerrill();
    }
    @Test
    public void merrillGuideAdviser() throws InterruptedException {
        boaHmePage.merrillGuideAdviserElement();
        boaHmePage.validateMerrillGuideAdviserElement();
    }
    @Test
    public void chatBoxFunction() throws InterruptedException {
        boaHmePage.chatBoxFunctionElement();
        boaHmePage.validateChatBoxFunction();
    }
    @Test
    public void sendMessageIntoChatBox() throws InterruptedException {
        boaHmePage.ButtonMessageBoxElements();
        boaHmePage.validateButtonMessageBox();
    }
    @Test
    public void personalFinanceFunctions() throws InterruptedException {
        boaHmePage.calculateCostOfDebtElements();
        boaHmePage.validateCalculateCostOfDebt();
    }
    @Test
    public void calculateCostDeptFunctions() throws InterruptedException {
        boaHmePage.CostOfDebtElements();
        boaHmePage.validateCostOfDebt();
    }
    @Test
    public void getPriceFromTableElements() throws InterruptedException {
        boaHmePage.getPriceFromTableElements();
        boaHmePage.validateTable();
    }
}
