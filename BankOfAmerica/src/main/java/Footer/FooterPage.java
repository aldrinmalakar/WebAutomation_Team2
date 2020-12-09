package Footer;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static Footer.FooterWebElementPage.*;


public class FooterPage extends WebAPI {

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */


  @FindBy(how= How.CSS, using= locationButton)
  public WebElement footerLocation;
  @FindBy(how= How.CSS, using= validateBOAFootLocation )
  public WebElement BOAFooterLocationValidate;

    public void BOAFooterLocation() throws InterruptedException {
      driver.get(BOAURL);
      Thread.sleep(5000);
      footerLocation.isSelected();
      footerLocation.click();
      Thread.sleep(5000);

    }
    public void ValidateBOAFooterLocation(){
      String expextedText = "https://locators.bankofamerica.com/";
      String actualText = ATMURL;
      Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

  @FindBy(how= How.CSS, using= contactUSFooter)
  public WebElement footerContactUS;
  @FindBy(how= How.CSS, using= ValidateContactUSPage )
  public WebElement ContactUSPageValidate;

  public void FooterContactUS(){
    driver.get(BOAURL);
    footerContactUS.isEnabled();
    footerContactUS.click();
  }
  public void ValidateContactUS() {

    String expextedText = "We're here to help";
    String actualText = ContactUSPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterHelp)
  public WebElement helpFooter;
  @FindBy(how= How.CSS, using= ValidateHelpPage )
  public WebElement HelpPageValidate;
  @FindBy(how= How.CSS, using= inPutLocationPopUp )
  public WebElement inPutLocationPop;
  @FindBy(how= How.CSS, using= SearchKeyonHelp )
  public WebElement HelpSearchKey;

  public void FooterHelpPage(){
    driver.get(BOAURL);
    helpFooter.isEnabled();
    helpFooter.click();
    inPutLocationPop.click();
    inPutLocationPop.sendKeys("Illinios");
    HelpSearchKey.submit();

  }
  public void ValidateHelp() {

    String expextedText = "Personal";
    String actualText = HelpPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= FooterAccessibility)
  public WebElement AccessibilityFooter;
  @FindBy(how= How.CSS, using= ValidateAccessPage )
  public WebElement AccessPageValidate;
  @FindBy(how= How.CSS, using= inputpopup )
  public WebElement popUpInput;
  @FindBy(how= How.CSS, using= sumbitButtonPopUp )
  public WebElement popUpButtonSumbit;

  public void FooterAccessibilityPage(){
    driver.get(BOAURL);
    AccessibilityFooter.isEnabled();
    AccessibilityFooter.click();
    popUpInput.click();
    popUpInput.sendKeys("Delware");
    popUpButtonSumbit.click();

  }
  public void ValidateAccessiblity() {

    String expextedText = "Accessible Banking";
    String actualText = AccessPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterCareer)
  public WebElement careerFooter;
  @FindBy(how= How.CSS, using= ValidateCareerfooterpage )
  public WebElement careerPageValidate;


  public void FooterCareerPage(){
    careerFooter.isEnabled();
    careerFooter.click();

  }
  public void ValidateCareer() {

    String expextedText = "Find your opportunity in";
    String actualText = careerPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterPrivacy)
  public WebElement PrivacyrFooter;
  @FindBy(how= How.CSS, using= validatePrivacyFooterPage )
  public WebElement privacyPageValidate;


  public void FooterPrivacyPage(){
    PrivacyrFooter.isEnabled();
    PrivacyrFooter.click();

  }
  public void ValidatePrivacy() {

    String expextedText = "Review other privacy notices";
    String actualText = privacyPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterSecurity)
  public WebElement SecurityFooter;
  @FindBy(how= How.CSS, using= validateSecurityFooterPage )
  public WebElement securityPageValidate;


  public void FooterSecurityPage(){
    SecurityFooter.isEnabled();
    SecurityFooter.click();

  }
  public void ValidateSecurity() {

    String expextedText = "Your security is our top priority";
    String actualText = securityPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterMcafee)
  public WebElement mcAfeeFooter;
  @FindBy(how= How.CSS, using= validateMcafeeFooterPage)
  public WebElement mcAfeePageValidate;


  public void FooterMcAfeePage(){
    mcAfeeFooter.isEnabled();
    mcAfeeFooter.click();

  }
  public void ValidateMcAfee() {

    String expextedText = "Protect all of your devices with McAfee security software";
    String actualText = mcAfeePageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= FooterSiteMAp)
  public WebElement siteMapFooter;
  @FindBy(how= How.CSS, using= validateSiteMapFooterPAge)
  public WebElement siteMapPageValidate;


  public void FooterSiteMapPage(){
    siteMapFooter.isEnabled();
    siteMapFooter.click();

  }
  public void ValidateSiteMap() {

    String expextedText = "Personal";
    String actualText = siteMapPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= FooterAdvertising)
  public WebElement advertisingFooter;
  @FindBy(how= How.CSS, using= validateAdvertisingFooterPage)
  public WebElement advertisingPageValidate;


  public void FooterAdvertisingPage(){
    advertisingFooter.isEnabled();
    advertisingFooter.click();

  }
  public void ValidateAdvertising() {

    String expextedText = "Advertising Practices";
    String actualText = advertisingPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= viewFullFooterPage)
  public WebElement viewFullFooter;
  @FindBy(how= How.CSS, using= validateViewFullFooterPage)
  public WebElement viewFullPageValidate;

  public void FooterViewFullPage(){
    viewFullFooter.isEnabled();
    viewFullFooter.click();

  }
  public void ValidateViewFull() {
    String expextedText = "Online ID";
    String actualText = viewFullPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= facebookIconFooterPage)
  public WebElement facebookIConFooter;
  @FindBy(how= How.CSS, using= validateiconFooterPage)
  public WebElement iconPageValidate;

  public void FooterFacebookPage(){
    facebookIConFooter.isEnabled();
    facebookIConFooter.isSelected();

  }
  public void ValidateFacebook() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= instagramIconFooterPage)
  public WebElement instagramIConFooter;


  public void FooterInstagramPage(){
    instagramIConFooter.isEnabled();
    instagramIConFooter.isSelected();

  }
  public void Validateinstagramk() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= linkinIconFooterPage)
  public WebElement linkinIConFooter;


  public void FooterLinkinPage(){
    linkinIConFooter.isEnabled();
    linkinIConFooter.isSelected();

  }
  public void ValidateLinkin() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= PinterestIconFooterPage)
  public WebElement pinterestIConFooter;


  public void FooterPinterestPage(){
    pinterestIConFooter.isEnabled();
    pinterestIConFooter.isSelected();

  }
  public void ValidatePinterest() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= twitterIconFooterPage)
  public WebElement twitterIConFooter;


  public void FooterTwitterPage(){
    pinterestIConFooter.isEnabled();
    pinterestIConFooter.isSelected();

  }
  public void ValidateTwitter() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= youtubeIconFooterPage)
  public WebElement youtubeIConFooter;


  public void FooterYoutubePage(){
    youtubeIConFooter.isEnabled();
    youtubeIConFooter.isSelected();

  }
  public void ValidateYoutube() {
    String expextedText = "Connect with us";
    String actualText = iconPageValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= equalHousingLenderIconFooterPage)
  public WebElement equalHousingLenderIConFooter;
  @FindBy(how= How.CSS, using= validateequalHousingLenderFooterPage)
  public WebElement valLenderIConFooter;


  public void FooterequalHousingLenderPage(){
    youtubeIConFooter.isEnabled();
    youtubeIConFooter.isSelected();
    driver.get(lenderURlPopup);

  }
  public void ValidateequalHousingLender() {
    String expextedText = "Equal Housing Lender";
    String actualText = valLenderIConFooter.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= onlineBankingServiceAgreement)
  public WebElement onlineBanking;
  @FindBy(how= How.CSS, using= ValidateOnlineBankingServiceAgreement)
  public WebElement validateOnlineBankingServiceAgreement;


  public void FooteronlineBankingServiceAgreementPage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);

  }
  public void ValidateonlineBankingServiceAgreementPage() {
    String expextedText = "Bank of America Online Banking Service Agreement";
    String actualText = validateOnlineBankingServiceAgreement.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

  @FindBy(how= How.CSS, using= generalDescription)
  public WebElement generalDescriptionlinn;
  @FindBy(how= How.CSS, using= generalDescriptionValidate )
  public WebElement validateGeneralDescription;


  public void FooterGeneralDescriptionPage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    generalDescriptionlinn.click();

  }
  public void ValidateGeneralDescriptionPage() {
    String expextedText = "Introduction";
    String actualText = validateGeneralDescription.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= internalTransfer)
  public WebElement transfer;
  @FindBy(how= How.CSS, using= validateInternalTransfer )
  public WebElement internalTransferValidate;


  public void FooterInternalTransferPage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    transfer.click();

  }
  public void ValidateInternalTransferPage() {
    String expextedText = "Transfers Between Your Accounts";
    String actualText = internalTransferValidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= billPaymentServices)
  public WebElement serviceBillPayment;
  @FindBy(how= How.CSS, using= validateBillService )
  public WebElement billServicevalidate;


  public void FooterBillSPaymentervicePage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    serviceBillPayment.click();

  }
  public void ValidateBillPaymentServicePage() {
    String expextedText = "Bill Pay for Checking, Money Market and Home Equity Line of Credit Accounts";
    String actualText = billServicevalidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= zellenetwork)
  public WebElement networkZelle;
  @FindBy(how= How.CSS, using= validatezellenetwork )
  public WebElement zellenetworkvalidate;


  public void FooterZelleNetworkPage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    networkZelle.click();

  }
  public void ValidateZelleNetworkPage() {
    String expextedText = "Receiving Money; Money Transfers by Network Banks";
    String actualText = zellenetworkvalidate.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= aCHAndWireTransfer)
  public WebElement wireTransferAndACH;
  @FindBy(how= How.CSS, using= validateACHAndWireTransfer )
  public WebElement validateACHAndWire;


  public void FooterACHWirePage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    wireTransferAndACH.click();

  }
  public void ValidateACHWirePage() {
    String expextedText ="Special Rules for Remittance Transfers" ;
    String actualText = validateACHAndWire.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }
  @FindBy(how= How.CSS, using= disclaimerOfWarrantee)
  public WebElement warranteeofDisclaimer;
  @FindBy(how= How.CSS, using= validateDisclaimerOfWarrantee )
  public WebElement validateDisclaimerWarrantee;


  public void FooterDisclaimernPage(){
    onlineBanking.isEnabled();
    onlineBanking.isSelected();
    driver.get(onlineBankingURlPopup);
    warranteeofDisclaimer.click();

  }
  public void ValidateDisclaimerPage() {
    String expextedText = "Indemnification";
    String actualText = validateDisclaimerWarrantee.getText();
    Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");

  }

}
















