package com.BOAtest;

import bankofamerica.BOAHmePage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;


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
//    @Test
//    public void defineLocationUsingMap() throws InterruptedException {
//        boaHmePage.searchLocationUsingMap();
//        boaHmePage.validateSearchLocationUsingMap();
//    }
//
    @Test
    public void LocationByFilters() throws InterruptedException {
       boaHmePage.searchLocationUsingFilters();
        }

}
