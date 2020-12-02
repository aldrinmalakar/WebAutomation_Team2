package marriotVacations;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static marriotVacations.VacationsElement.*;




public class Vacations extends WebAPI {

    @FindBy(xpath =vacationsWebElement )public WebElement vacations;
    @FindBy(xpath =exploreDestinationsWebElement )public  WebElement exploreDestinations;


public void exploreDestinationsWithCredential() throws InterruptedException {
    vacations.click();
    Thread.sleep(3000);
    exploreDestinations.click();
    Thread.sleep(3000);
}
public void validateExploreDestinations(){
    String expectedTitle="";
    String actualTitle=driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
}

}
