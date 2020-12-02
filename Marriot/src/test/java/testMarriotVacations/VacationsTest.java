package testMarriotVacations;

import common.WebAPI;
import marriotVacations.Vacations;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VacationsTest extends WebAPI {
    Vacations vacations;

    @BeforeMethod
    public void gitInit(){
        vacations = PageFactory.initElements(driver, Vacations.class);
    }
    @Test(enabled = false)
    public void testExploreDestinations(){
        vacations.exploreDestinationsWithCredential();
        vacations.validateExploreDestinations();
    }


































}
