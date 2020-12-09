package TestClaim;

import Claim.ClaimPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class ClaimPageTest extends WebAPI {
    ClaimPage claimPage;

    @BeforeMethod
    public void getInit() {
        claimPage = PageFactory.initElements(driver, ClaimPage.class);
    }

    @Test
    public void testStateFarmClaimPage() throws InterruptedException {
        claimPage.StateFarmClaimPage();
        claimPage.ValidateStateFarmClaimPage();
    }

    @Test
    public void testAutoGlassOnlyRadioButton() throws InterruptedException {
        claimPage.AutoGlassOnlyRadioButton();
        claimPage.ValidateAutoGlassOnly();
    }

    @Test
    public void testHomeBoatPropertyRadioButton() throws InterruptedException {
        claimPage.HomeBoatPropertyRadioButton();
        claimPage.ValidateHomeBoat();
    }

    @Test
    public void testHealthRadioButton() throws InterruptedException {
        claimPage.HealthRadioButton();
        claimPage.ValidateHealth();
    }

    @Test
    public void testLifeRadioButton() throws InterruptedException {
        claimPage.LifeRadioButton();
        claimPage.ValidateLife();
    }

    @Test
    public void testRecreationalVehicalRadioButton() throws InterruptedException {
        claimPage.RecreationalVehicalRadioButton();
        claimPage.ValidateRecreatinal();
    }

    @Test
    public void testSmallBusinessRadioButton() throws InterruptedException {
        claimPage.SmallBusinessRadioButton();
        claimPage.ValidateSamllBusiness();
    }

    @Test
    public void testTranscriptmusiclinkplay() throws InterruptedException {
        claimPage.Transcriptmusiclinkplay();
        claimPage.ValidateTranscriptlink();
    }

    @Test
    public void testContactFooterClaim() throws InterruptedException {
        claimPage.ContactFooterClaim();
        claimPage.ValidateContact();
    }

    @Test
    public void testAboutFooterClaim() throws InterruptedException {
        claimPage.AboutFooterClaim();
        claimPage.ValidateAbout();
    }

    @Test
    public void testCareerFooterClaim() throws InterruptedException {
        claimPage.CareerFooterClaim();
        claimPage.ValidateCareer();
    }

    @Test
    public void testRetireeFooterClaim() throws InterruptedException {
        claimPage.RetireeFooterClaim();
        claimPage.ValidateRetireer();
    }

    @Test
    public void testTrackaClaim() throws InterruptedException {
        claimPage.TrackaClaim();
        claimPage.ValidateTrackr();
    }

    @Test
    public void testCreateAnAccountClaimPage() throws InterruptedException {
        claimPage.CreateAnAccountClaimPage();
        claimPage.ValidateCreateAnAccount();
    }

    @Test
    public void testCreateAnAccountInformationClaimPage() throws InterruptedException {
        claimPage.CreateAnAccountInformationClaimPage();
        claimPage.ValidateCreateAnAccountInformation();
    }

    @Test
    public void testAboutOurADFooterClaimPage() {
        claimPage.AboutOurADFooterClaimPage();
        claimPage.ValidateAboutOurAds();
    }

    @Test
    public void testTermsAndConditionFooterClaimPage() {
        claimPage.AboutOurADFooterClaimPage();
        claimPage.ValidateAboutOurAds();
    }

    @Test
    public void testAccessibilityFooterClaimPage() {
        claimPage.AccessibilityFooterClaimPage();
        claimPage.ValidateAccessbilityFooterClaimPage();
    }

    @Test
    public void testFraudFooterClaimPage() {
        claimPage.FraudFooterClaimPage();
        claimPage.ValidateFrauds();
    }

    @Test
    public void testFeedBackFooterClaimPage() throws InterruptedException {
        claimPage.feedBackFooterClaimPage();
        claimPage.validateFeedBack();
    }

    @Test
    public void testfillInZipCode() {
        claimPage.fillInZipCode();
        claimPage.validateFillInZip();
    }

    @Test
    public void testworkableAppleIcon() throws InterruptedException {
        claimPage.workableAppleIcon();
        claimPage.validateAppleIcon();
    }

    @Test
    public void testworkableGoogleIcon() throws InterruptedException {
        claimPage.workableGoogleIcon();
        claimPage.validateGoogleIcon();
    }

    @Test
    public void testpageOpenDriveSafe() throws InterruptedException {
        claimPage.pageOpenDriveSafe();
        claimPage.validatePageOpensDriveSafe();
    }

    @Test
    public void testpageOpenInsurancePick() throws InterruptedException {
        claimPage.pageOpenInsurancePick();
        claimPage.validatePageOpensInsurancePicks();
    }


}
















