package allDepartments;

import common.WebAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShopElectronics extends ShopElectronicsElements {


    public void TechDeals() throws InterruptedException {
        driver.findElement(By.xpath(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(electronicOfficeWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(techDealsWebElement)).click();
        Thread.sleep(3000);

    }

    public void validateTechDeals() {
        String expectedTitle = "Black Friday Electronics Deals 2020 - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }

    public void electronicsAndOffice() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(electronicsAndOfficeWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(computerWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.className(laptopsWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.className(refurbishedLaptopsWebElements)).click();
        Thread.sleep(3000);

    }

    public void validateElectronicsAndOffice() {
        String expectedTitle = "Refurbished Laptops - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }


    public void baby() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(babyWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(carSeatsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(boosterCarSeatsWebElement)).click();
        Thread.sleep(3000);

    }

    public void validateBaby() {
        String expectedTitle= "Booster Car Seats - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }


    public void gifts() throws InterruptedException {

        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftsWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftForHimWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(appleAirPodsProWebElement)).click();
        Thread.sleep(3000);
    }

    public void validateGifts() {
        String expectedTitle = "Apple AirPods Pro - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");
    }

    public void patioAndGarden() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(patioAndGardenWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(outdoorLightingWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(lanternsWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(solarWavLanternWebElements)).click();
        Thread.sleep(3000);

    }

    public void validatePatioAndGarden() {
        String expectedTitle = "Solar Wave Lantern 2-Pack - Clear - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }

    public void homeForTheHolidays() throws InterruptedException {

        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(homeForTheHolidaysWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(livingRoomWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(betterHomesAndGardensRusticLantersWebElement)).click();
    }

    public void validateHomeForTheHolidays() {
        String expectedTitle = "Better Homes and Gardens Rustic Wood Candle Holder Lantern, Large - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }

    public void pharmacyHealthAndPersonalCare() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pharmacyHealthAndPersonalCareWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allergyWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(equateAllergyReliefWebElement)).click();

    }

    public void validatePharmacyHealthAndCare() {
        String expectedTitle = "Equate Allergy Relief Diphenhydramine Tablets 25mg, 100 Ct - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }

    public void beauty() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(beautyWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(hairColorWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(garnierOliaOilWebElements)).click();
        Thread.sleep(3000);

    }

    public void validateHairColor() {
        String expectedTitle = "Garnier Olia Oil Powered Permanent Hair Color, 6.0 Light Brown, 1 kit - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void homeImprovement() throws InterruptedException {

        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(homeImprovementWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(heatingWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(radiantWebElements)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(broanElectricRadiantCeilingWebElements)).click();
        Thread.sleep(3000);
    }

        public void validateHomeImprovement() {
            String expectedTitle = "Broan Electric Radiant Ceiling Heater, Low Profile, Enclosed Sheathed, Aluminum, 120 Volt, 1250 Watts - Walmart.com - Walmart.com";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

        }
//
//
//        }
        public void photoAndPersonalizedShop() throws InterruptedException {
//
            driver.findElement(By.cssSelector(homePageWebElement)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(allDepartmentsWebElement)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(photoAndPersonalizedShopWebElement)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(photoCenterWebElement)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(wallArtWebElement)).click();
            Thread.sleep(3000);
        }
        public void validatePhotoAndPersonalizedShop () {
            String expectedTitle = "Canvas Prints";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");


        }
    public void sportAnsFitnessAndOutdoors () throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sportAnsFitnessAndOutdoorsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(sportsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(basketballWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateSportAnsFitnessAndOutdoors() {
        String expectedTitle = "Basketball - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");


    }
    public void  foodHouseHoldAndPets() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(foodHouseHoldAndPetsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(shopAllFoodWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(coffeeWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(groundCoffeeWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateFoodHouseHoldAndPets() {
        String expectedTitle = "Ground Coffee - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");


    }
    public void  clothingShoesAndAccessories() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(clothingShoesAndAccessoriesWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(womenWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(bagsAccessoriesDealsWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateClothingShoesAndAccessories () {
        String expectedTitle = "Black Friday Womens Bag and Accessory Deals 2020 - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle , "Test Fail: Search keyword does not match");

    }
    public void  moviesMusicAndBooksWebElement() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(moviesMusicAndBooksWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(musicWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(CDsWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateMoviesMusicAndBooksWebElement () {
        String expectedTitle = "Music - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void  autoTearsAndIndustrialWebElement() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(autoTearsAndIndustrialWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(tiresWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(radarTiresWebElement)).click();
        Thread.sleep(3000);

         }
    public void validateAutoTearsAndIndustrialWebElement () {
        String expectedTitel = "Radar Tires - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitel, "Test Fail: Search keyword does not match");

    }
      public void  artCraftSewingAndPartySuppliesWebElement() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(artCraftSewingAndPartySuppliesWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftWrapWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftTagsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(craftTagsWebElement)).click();
        Thread.sleep(3000);

    }
    public void  validateArtCraftSewingAndPartySuppliesWebElement() {
        String expectedTitle = "Craft Tags 2.125x4.25 20pc Black - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void homeFurnitureAndAppliancesWebElement() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(homeFurnitureAndAppliancesWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(popularInHomeWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(vacuumsWebElement)).click();
        driver.findElement(By.xpath(carpetCleanerWebElement)).click();
        Thread.sleep(3000);
    }
    public void  validateHomeFurnitureAndAppliancesWebElement() {
        String expectedTitle = "Carpet Cleaners - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void toysGamesAndVideoGamesWebElement() throws InterruptedException{
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(toysGamesAndVideoGamesWebElement));
        Thread.sleep(3000);
        driver.findElement(By.xpath(shopAllToysWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(barbieSignature2020WebElement)).click();

    }
    public void  validateToysGamesAndVideoGamesWebElement() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "barbie signatur 2020 - Walmart.com";
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void blackFridayDealsWebElement() throws InterruptedException {

        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id( blackFridayDealsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(shopAllDealsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(toysWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(barbieDreamHouseDollHouseWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateBlackFridayDealsWebElement () {
        String expectedTitle = "barbie dreame house doll house - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
    public void bigSavingsWebElement() throws InterruptedException {
        driver.findElement(By.cssSelector(homePageWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(allDepartmentsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(bigSavingsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(clearanceWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(fashionWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(madeByOliviaWomenRibbonTieWebElement)).click();
    }
    public void validateBigSavingsWebElement () {
        String expectedTitle = "Made by Olivia - Made by Olivia Women's Ribbon Tie Chiffon Loose Pleated Wide Leg Palazzo Pants - Walmart.com - Walmart.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Test Fail: Search keyword does not match");

    }
 }



