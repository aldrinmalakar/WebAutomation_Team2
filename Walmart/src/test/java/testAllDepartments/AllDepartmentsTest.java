package testAllDepartments;

import allDepartments.ShopElectronics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllDepartmentsTest extends ShopElectronics {

    public void testGetTitle() throws InterruptedException {
        String walmartUrl = "https://www.walmart.com/";
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("web driver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(walmartUrl);
        String expectedTitle = "Walmart.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more1";
        String actualTitle = driver.getTitle();
        // Validate Title
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Title does not match");
        Thread.sleep(5000);
        driver.quit();
    }
    @Test(enabled = true)
    public void testTechDeals() throws InterruptedException {
        TechDeals();
        validateTechDeals();
    }



    @Test(enabled = false)
    public void testElectronicsAndOffice() throws InterruptedException {
       electronicsAndOffice();
        validateElectronicsAndOffice();


    }
    @Test(enabled = false)
    public void testBaby() throws InterruptedException {
        baby();
        validateBaby();

    }

    @Test(enabled = false)
    public void testGifts() throws InterruptedException {
        gifts();
        validateGifts();

    }

    @Test(enabled = false)
    public void testPatioAndGarden() throws InterruptedException {
        patioAndGarden();
        validatePatioAndGarden();
    }

    @Test(enabled = false)
    public void testHomeForTheHolidays() throws InterruptedException{
        homeForTheHolidays();
        validateHomeForTheHolidays();
    }
    @Test(enabled = false)
    public void testPharmacyHealthAndPersonalCare() throws InterruptedException{
        pharmacyHealthAndPersonalCare();
        validatePharmacyHealthAndCare();

    }
    @Test(enabled = false)
    public void tesBeauty() throws InterruptedException{
        beauty();
        validateHairColor();

    }


@Test(enabled = false)
    public void testHomeImprovement()throws InterruptedException{
        homeImprovement();
        validateHomeImprovement();
    }

    @Test(enabled = false)

    public void testPhotoAndPersonalizedShop()throws InterruptedException{
        photoAndPersonalizedShop();
        validatePhotoAndPersonalizedShop();
    }
    @Test(enabled = false)
    public void testSportAnsFitnessAndOutdoors()throws InterruptedException{
        sportAnsFitnessAndOutdoors();
        validateSportAnsFitnessAndOutdoors();
    }
    @Test(enabled = false)
    public void testFoodHouseHoldAndPets()throws InterruptedException{
        foodHouseHoldAndPets();
        validateFoodHouseHoldAndPets();

    }
    @Test(enabled = false)
    public void testClothingShoesAndAccessories()throws InterruptedException {
        clothingShoesAndAccessories();
        validateClothingShoesAndAccessories();
    }
    @Test(enabled = false)
    public void testMoviesMusicAndBooksWebElement ()throws InterruptedException{
        moviesMusicAndBooksWebElement();
        validateMoviesMusicAndBooksWebElement();
    }
    @Test(enabled = false)
    public void testAutoTearsAndIndustrialWebElement ()throws InterruptedException{
        autoTearsAndIndustrialWebElement();
        validateAutoTearsAndIndustrialWebElement();
    }
    @Test(enabled = false)
    public void testArtCraftSewingAndPartySuppliesWebElement ()throws InterruptedException{
        artCraftSewingAndPartySuppliesWebElement();
        validateArtCraftSewingAndPartySuppliesWebElement();

    }
    @Test(enabled = false)
    public void testHomeFurnitureAndAppliancesWebElement ()throws InterruptedException{
        homeFurnitureAndAppliancesWebElement();
        validateHomeFurnitureAndAppliancesWebElement();
    }
    @Test(enabled = false)
    public void testToysGamesAndVideoGamesWebElement ()throws InterruptedException{
        toysGamesAndVideoGamesWebElement();
        validateToysGamesAndVideoGamesWebElement();
    }
    @Test(enabled = false)
    public void testBlackFridayDealsWebElement ()throws InterruptedException{
        blackFridayDealsWebElement();
        validateBlackFridayDealsWebElement();
    }
    @Test(enabled = false)
    public void testBigSavingsWebElement ()throws InterruptedException{
        bigSavingsWebElement();
        validateBigSavingsWebElement();
    }

}


