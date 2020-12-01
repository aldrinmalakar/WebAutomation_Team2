package com.cnncouponsTest;

import com.cnncoupons.CNNCHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CNNWeatherTest extends WebAPI {
    static CNNCHomePage CNNCHomePage;
    @BeforeMethod
    public void getInit() {
        CNNCHomePage = PageFactory.initElements(driver, CNNCHomePage.class);
    }
    @Test
    public void navigateToWeatherHomePage() {
        CNNCHomePage.navigateToWeatherHomeElements();
        CNNCHomePage.validateWeatherHomeElements();
    }
    @Test
    public void climateFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.climateFunctionalityElements();
        CNNCHomePage.validateClimateFunctionalityElements();
    }
    @Test
    public void stormTrackerFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.stormTrackerFunctionalityElements();
        CNNCHomePage.validateStormTrackerFunctionalityElements();
    }
    @Test
    public void wildFireTrackerFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.wildFireTrackerFunctionalityElements();
        CNNCHomePage.validateWildFireTrackerFunctionalityElements();
    }
    @Test
    public void videosFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.videosFunctionalityElements();
        CNNCHomePage.validateVideosFunctionalityElements();
    }
    @Test
    public void GetForecastFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.GetForecastFunctionalityElements();
        CNNCHomePage.validateGetForecastFunctionalityElements();
    }
    @Test
    public void changeWeatherDegreesFunctionality() throws InterruptedException {
        Thread.sleep(5);
        CNNCHomePage.changeWeatherDegreesElements();
        CNNCHomePage.validateChangeWeatherDegreesElements();
    }


}
