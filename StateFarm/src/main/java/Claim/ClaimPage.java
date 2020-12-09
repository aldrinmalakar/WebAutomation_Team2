package Claim;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Claim.ClaimWebElementPage.*;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class ClaimPage extends WebAPI {


    @FindBy(how = How.XPATH, using = claimPage)
    public WebElement pageClaim;
    @FindBy(how = How.XPATH, using = stateFarmClaims)
    public WebElement claimStateFarm;
    @FindBy(how = How.XPATH, using = validateStateFarmClaim)
    public WebElement StateFarmClaimValidate;
    @FindBy(how = How.CSS, using = radiobuttonAutoandMotor)
    public WebElement autoAndMotoeRadio;

    public void StateFarmClaimPage() throws InterruptedException {
        pageClaim.click();
        claimStateFarm.click();
        Thread.sleep(5000);
        autoAndMotoeRadio.click();
        Thread.sleep(5000);


    }

    public void ValidateStateFarmClaimPage() {
        String expextedText = "FILE A CLAIM";
        String actualText = StateFarmClaimValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = autoGlassOnlydropDown)
    public WebElement onlyAutoGlass;
    @FindBy(how = How.XPATH, using = startAutoGlassOnly)
    public WebElement onlyStartAutoGlass;
    @FindBy(how = How.XPATH, using = validateStartAutoGlassOnly)
    public WebElement glassOnlyValidate;

    public void AutoGlassOnlyRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        onlyAutoGlass.click();
        Thread.sleep(5000);
        onlyStartAutoGlass.click();

    }

    public void ValidateAutoGlassOnly() {
        String expextedText = "Trouble logging in?";
        String actualText = glassOnlyValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = homeBoatPropertyRadioButton)
    public WebElement homeBoat;
    @FindBy(how = How.XPATH, using = startHomeBoat)
    public WebElement HomeBoatStart;


    public void HomeBoatPropertyRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        homeBoat.click();
        Thread.sleep(5000);
        HomeBoatStart.click();

    }

    public void ValidateHomeBoat() {
        String expextedText = "Trouble logging in?";
        String actualText = glassOnlyValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = HealthRadioButton)
    public WebElement healthButton;
    @FindBy(how = How.XPATH, using = ValidateHealth)
    public WebElement HealthValidate;


    public void HealthRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        healthButton.click();
        Thread.sleep(5000);


    }

    public void ValidateHealth() {
        String expextedText = "Call 866-855-1212 to file your claim";
        String actualText = HealthValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = LifeRadioButton)
    public WebElement lifeButton;
    @FindBy(how = How.XPATH, using = validateLife)
    public WebElement lifeValidate;


    public void LifeRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        lifeButton.click();
        Thread.sleep(5000);


    }

    public void ValidateLife() {
        String expextedText = "Date and cause of death";
        String actualText = lifeValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = recreationalVehicalRadioButton)
    public WebElement RecreationalButton;
    @FindBy(how = How.XPATH, using = validateRecreationalVehical)
    public WebElement recreationalValidate;


    public void RecreationalVehicalRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        RecreationalButton.click();
        Thread.sleep(5000);


    }

    public void ValidateRecreatinal() {
        String expextedText = "Name, contact information";
        String actualText = recreationalValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = smallBusinessRadioButton)
    public WebElement smallButton;
    @FindBy(how = How.XPATH, using = validateSmallBusinesses)
    public WebElement smallValidate;


    public void SmallBusinessRadioButton() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        smallButton.click();
        Thread.sleep(5000);


    }

    public void ValidateSamllBusiness() {
        String expextedText = "Business name";
        String actualText = smallValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = transcriptLink)
    public WebElement linkTranscript;
    @FindBy(how = How.XPATH, using = validateTranscriptLink)
    public WebElement transcriptValidate;


    public void Transcriptmusiclinkplay() throws InterruptedException {

        claimStateFarm.click();
        Thread.sleep(5000);
        linkTranscript.click();
        Thread.sleep(5000);

    }

    public void ValidateTranscriptlink() {
        String expextedText = "Filing Your Auto Claim Online | State Farm®";
        String actualText = transcriptValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = ContactonFooterappear)
    public WebElement footerContact;
    @FindBy(how = How.XPATH, using = validateContact)
    public WebElement ValidateContact;


    public void ContactFooterClaim() throws InterruptedException {
        claimStateFarm.click();
        footerContact.click();
        Thread.sleep(5000);

    }

    public void ValidateContact() {
        String expextedText = "Contact State Farm®. We’re here to help";
        String actualText = ValidateContact.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = aboutFooterAppear)
    public WebElement footerAbout;
    @FindBy(how = How.XPATH, using = validateAbout)
    public WebElement aboutValidate;


    public void AboutFooterClaim() throws InterruptedException {
        claimStateFarm.click();
        footerAbout.click();
        Thread.sleep(5000);

    }

    public void ValidateAbout() {
        String expextedText = "Like a good neighbor, State Farm is there.®";
        String actualText = aboutValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = careerFooterAppear)
    public WebElement footerCareer;
    @FindBy(how = How.XPATH, using = validateCareer)
    public WebElement careerValidate;


    public void CareerFooterClaim() throws InterruptedException {
        claimStateFarm.click();
        footerCareer.click();
        Thread.sleep(5000);

    }

    public void ValidateCareer() {
        String expextedText = "Join a Community of Good Neighbors";
        String actualText = careerValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = retireeFooterAppear)
    public WebElement footerretiree;
    @FindBy(how = How.XPATH, using = validateretiree)
    public WebElement retireeValidate;


    public void RetireeFooterClaim() throws InterruptedException {
        claimStateFarm.click();
        footerretiree.click();
        Thread.sleep(5000);

    }

    public void ValidateRetireer() {
        String expextedText = "If You're Looking for Retirees Information, You'll Find It Here";
        String actualText = retireeValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = trackaClaim)
    public WebElement clqimTrack;
    @FindBy(how = How.XPATH, using = validateTrsck)
    public WebElement TrackValidate;


    public void TrackaClaim() throws InterruptedException {
        clqimTrack.click();
        Thread.sleep(5000);

    }

    public void ValidateTrackr() {
        String expextedText = "First, tell us who you are";
        String actualText = TrackValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = createAnAccountClainPage)
    public WebElement createAnAccount;
    @FindBy(how = How.XPATH, using = validateCreateAnAccount)
    public WebElement CreateAnAccountValidate;


    public void CreateAnAccountClaimPage() throws InterruptedException {
        clqimTrack.click();
        createAnAccount.click();
        Thread.sleep(5000);

    }

    public void ValidateCreateAnAccount() {
        String expextedText = "Tell us a little about yourself.";
        String actualText = CreateAnAccountValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = firstNameCreateAccount)
    public WebElement firstNameAccount;
    @FindBy(how = How.XPATH, using = lastNameCreateAccount)
    public WebElement lastNameAccount;
    @FindBy(how = How.XPATH, using = birthdayCreateAccount)
    public WebElement birthdayAccount;
    @FindBy(how = How.XPATH, using = validateCreateAccountInformation)
    public WebElement createAccountInformationValidate;
    @FindBy(how = How.XPATH, using = continueCreateAccount)
    public WebElement createAccountContinue;

    public void CreateAnAccountInformationClaimPage() throws InterruptedException {
        clqimTrack.click();
        createAnAccount.click();
        firstNameAccount.sendKeys("Helen");
        lastNameAccount.sendKeys("Asfaw");
        birthdayAccount.sendKeys("09/25/1990");
        createAccountContinue.click();
        Thread.sleep(5000);

    }

    public void ValidateCreateAnAccountInformation() {
        String expextedText = "YOUR INFO";
        String actualText = createAccountInformationValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = aboutOurAdFooterClaimPage)
    public WebElement aboutOurAd;
    @FindBy(how = How.XPATH, using = validateAboutOurAd)
    public WebElement aboutOurAdValidate;


    public void AboutOurADFooterClaimPage() {
        aboutOurAd.click();

    }

    public void ValidateAboutOurAds() {
        String expextedText = "About Our Ads & Tracking";
        String actualText = aboutOurAdValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = termsAndConditionClaimPageFooter)
    public WebElement termsAndCondition;
    @FindBy(how = How.XPATH, using = termsAndConditionClaimPageFootervalidate)
    public WebElement termsValidate;


    public void TermsAndConditionFooterClaimPage() {
        termsAndCondition.click();

    }

    public void Validateterms() {
        String expextedText = "State Farm® Terms of Use for statefarm.com®";
        String actualText = termsAndCondition.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = accessibilityFooterClaimPAge)
    public WebElement accessibilityPage;
    @FindBy(how = How.XPATH, using = validateAccessiblityFooterClaimPage)
    public WebElement accessibilityValidate;

    public void AccessibilityFooterClaimPage() {
        accessibilityPage.click();
    }

    public void ValidateAccessbilityFooterClaimPage() {
        String expextedText = "State Farm® Accessibility Statement";
        String actualText = accessibilityValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = fraudFooterClaimPage)
    public WebElement fraudFooter;
    @FindBy(how = How.XPATH, using = validateFroudFooterClaimPage)
    public WebElement FraudValidate;


    public void FraudFooterClaimPage() {
        fraudFooter.submit();

    }

    public void ValidateFrauds() {
        String expextedText = "Securing your personal information is a State Farm® priority";
        String actualText = FraudValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = giveUsFeedBackFooter)
    public WebElement feedBackFooter;
    @FindBy(how = How.XPATH, using = dropDownPleaseSelect)
    public WebElement dropSelect;
    @FindBy(how = How.XPATH, using = dropDownTechnicalIssue)
    public WebElement technicalSelect;
    @FindBy(how = How.XPATH, using = dropDownSatifiedstars)
    public WebElement dropstar;
    @FindBy(how = How.XPATH, using = dropDownSecondStar)
    public WebElement starSelect;
    @FindBy(how = How.XPATH, using = radioButtonNO)
    public WebElement buttonNo;
    @FindBy(how = How.XPATH, using = radioButtonStillinProgress)
    public WebElement dropRadio;
    @FindBy(how = How.XPATH, using = selectstars)
    public WebElement starsSelect;
    @FindBy(how = How.XPATH, using = selectstarsecond)
    public WebElement secondStar;
    @FindBy(how = How.XPATH, using = submitbutton)
    public WebElement submitSelect;
    @FindBy(how = How.XPATH, using = validateFeedBack)
    public WebElement feedBackValidate;

    public void feedBackFooterClaimPage() throws InterruptedException {
        pageClaim.click();
        Thread.sleep(500);
        claimStateFarm.isSelected();
        claimStateFarm.click();
        Thread.sleep(500);
        feedBackFooter.click();
        Thread.sleep(4000);
        dropSelect.submit();
        technicalSelect.isSelected();
        dropstar.click();
        starSelect.click();
        buttonNo.click();
        dropRadio.isSelected();
        starsSelect.click();
        secondStar.click();
        submitSelect.submit();
    }

    public void validateFeedBack() {
        String expextedText = "Thank you for your feedback!";
        String actualText = feedBackValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = fillInZIpcode)
    public WebElement fillZip;
    @FindBy(how = How.XPATH, using = submitButton)
    public WebElement buttonSubmit;
    @FindBy(how = How.XPATH, using = validateZip)
    public WebElement zipValidate;


    public void fillInZipCode() {
        fillZip.sendKeys("60656");
        buttonSubmit.click();
    }

    public void validateFillInZip() {
        String expextedText = "Find a State Farm Agent Near You";
        String actualText = zipValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = appleStoreIcon)
    public WebElement appleIcon;
    @FindBy(how = How.XPATH, using = validateAppleStore)
    public WebElement appleVaidate;

    public void workableAppleIcon() throws InterruptedException {
        appleIcon.click();
        Thread.sleep(500);
        driver.get(applepageURL);
    }

    public void validateAppleIcon() {
        String expextedText = "App Store Preview";
        String actualText = appleVaidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = googlePlayIcone)
    public WebElement googleIcon;
    @FindBy(how = How.XPATH, using = validateGooglePlayIcon)
    public WebElement googleVaidate;

    public void workableGoogleIcon() throws InterruptedException {
        googleIcon.click();
        Thread.sleep(500);
        driver.get(googlePlauURL);
    }

    public void validateGoogleIcon() {
        String expextedText = "State Farm®";
        String actualText = googleVaidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = learnMoreAndDriveSafe)
    public WebElement driveSafe;
    @FindBy(how = How.XPATH, using = validatePageOpensDriveSafe)
    public WebElement driveVaidate;

    public void pageOpenDriveSafe() throws InterruptedException {
        driveSafe.click();
        Thread.sleep(500);
    }

    public void validatePageOpensDriveSafe() {
        String expextedText = "Drive Safe & Save™ Mobile for your smartphone";
        String actualText = driveVaidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = learnMoreInsurancePick)
    public WebElement pickInsurance;
    @FindBy(how = How.XPATH, using = validateInsurancePick)
    public WebElement insurancepickVaidate;

    public void pageOpenInsurancePick() throws InterruptedException {
        pickInsurance.click();
        Thread.sleep(500);
    }

    public void validatePageOpensInsurancePicks() {
        String expextedText = "Get great insurance and a great value";
        String actualText = insurancepickVaidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }


}
