package bankofamerica;

import org.openqa.selenium.WebElement;

public class BOALocators {

    public static final String LocationsLocator = "#footer_bofa_locations";
    public static final String newYorkLocator = "//input[@id='q']";
    public static final String clickOnnSearchButtonLocator = "search-button";
    public static final String AlbanyLocator  = "//*[@id='list-expand']/div[3]/ul/li[1]/ul/li[1]/a";
    public static final String AlbanyLocatorActual  = "#aria-map-list-header";
    //open filter functions
    public static final String clickOnFilterLocator = "Filter";
    public static final String filterActual = "#filter-expand > div.map-list-header.mb-25";//"map-filter-scroll";//
    // close filter
    public static final String clickOnCloseFilterLocator= "map-filter-scroll";//map-list-header mb-25
    // location by state
    public static final String clickOnLocationByStateLocator= "//body/div[@id='main-container']/div[1]/div[2]/div[1]/article[1]/h2[1]/button[1]";
    public static final String clickOnLocationMassachusettsLocator= "#browse-expand > ul > li:nth-child(8) > ul > li:nth-child(3) > a";
    //validate state
    public static final String validateOnLocationMassachusettsLocator= "//h1[@id='skip-to-h1']";
    // check Near MeButton
    public static final String clickCheckNearMeButtonLocation= "search-near-me";
    // validate near me button
    public static final String validateCheckNearMeButtonLocation= "search-near-me";
    //search Location Using Map
//    public static final String searchMiamiLocator = "//input[@id='q']";
    public static final String searchLocationUsingMapLocator= "is-visible.selected";//"#gmap .leaflet-interactive.is-visible.selected";
    // validate map search
    public static final String validateMapSearchLocator= "//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[23]/div[1]";
    public static final String validateLocationInMapLocator= "#gmap";
    // Search Location By Filters
    public static final String SearchLocationByFiltersLocator= "//*[@id='filter-expand']/div[2]/button";
    public static final String validateSearchLocationByFiltersLocator= "//*[@id='list-expand']/div[1]/div[2]/a/span";


}