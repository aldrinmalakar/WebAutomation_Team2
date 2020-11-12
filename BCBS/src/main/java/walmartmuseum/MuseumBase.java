package walmartmuseum;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static walmartmuseum.MuseumWebElements.*;

public class MuseumBase extends WebAPI {

    @FindBy(how = How.XPATH, using = navigateToMuseum)
    public WebElement navigateMuseum;
    @FindBy(how = How.CSS, using = validateNavigation)
    public WebElement validationHomepage;


    public void adigitalMuseum() {
        navigateMuseum.click();
        validationHomepage.isDisplayed();
    }

    public void validationOfDigitalMuseum() {
        driver.findElement(By.cssSelector(validateNavigation)).isDisplayed();
    }

    public void bookingAdmission() {
        driver.findElement(By.xpath(clickOnBooking)).click();
    }

    public void validatebookingAdmission() {
        validateBooking = driver.getTitle();
    }

}
