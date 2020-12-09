package TestFooter;

import Footer.FooterPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterPageTest extends WebAPI {
    /**
     * Author: Helen Asfaw
     * DueDate: December 1, 2020
     */

FooterPage footerPage;

    @BeforeMethod
    public void getInit() {
        footerPage= PageFactory.initElements(driver, FooterPage.class);

    }

    @Test
    public void testBOAFooterLocation() throws InterruptedException {
        footerPage.BOAFooterLocation();
        footerPage.ValidateBOAFooterLocation();
    }
    @Test
    public void testFooterContactUS(){
        footerPage.FooterContactUS();
        footerPage.ValidateContactUS();
    }
    @Test
    public void testFooterHelpPage(){
        footerPage.FooterHelpPage();
        footerPage.ValidateHelp();
    }
    @Test
    public void testFooterAccessibilityPage(){
        footerPage.FooterAccessibilityPage();
        footerPage.ValidateAccessiblity();
    }

    @Test
    public void testFooterCareerPage() {
        footerPage.FooterCareerPage();
        footerPage.ValidateCareer ();

    }

    @Test
    public void testFooterPrivacyPage() {
        footerPage.FooterPrivacyPage();
        footerPage.ValidatePrivacy();
    }

    @Test
    public void testFooterSecurityPage() {
        footerPage.FooterSecurityPage();
        footerPage.ValidateSecurity();
    }
    @Test
    public void testFooterAdvertisingPage() {
        footerPage.FooterAdvertisingPage();
        footerPage.ValidateAdvertising();
    }
    @Test
    public void testFooterViewFullPage(){
        footerPage.FooterViewFullPage();
        footerPage.ValidateViewFull();
    }
    @Test
    public void testFooterFacebookPage() {
        footerPage.FooterFacebookPage();
        footerPage.ValidateFacebook();
    }
    @Test
    public void testFooterInstagramPage(){
        footerPage.FooterInstagramPage();
        footerPage.Validateinstagramk();
    }
    @Test
    public void testFooterLinkinPage(){
        footerPage.FooterLinkinPage();
        footerPage.ValidateLinkin();
    }
    @Test
    public void testFooterPinterestPage(){
        footerPage.FooterPinterestPage();
        footerPage.ValidatePinterest();
    }
    @Test
    public void testFooterTwitterPage(){
        footerPage.FooterTwitterPage();
        footerPage.ValidateTwitter();
    }
    @Test
    public void testFooterYoutubePage(){
        footerPage.FooterYoutubePage();
        footerPage.ValidateYoutube();
}
    @Test
    public void testFooterequalHousingLenderPage(){
        footerPage.FooterequalHousingLenderPage();
        footerPage.ValidateequalHousingLender();
    }

    @Test
    public void testFooteronlineBankingServiceAgreementPage(){
        footerPage.FooteronlineBankingServiceAgreementPage();
        footerPage.ValidateonlineBankingServiceAgreementPage();
    }
    @Test
    public void testFooterGeneralDescriptionPage(){
        footerPage.FooterGeneralDescriptionPage();
        footerPage.ValidateGeneralDescriptionPage();
    }
    @Test
    public void testFooterInternalTransferPage(){
        footerPage.FooterInternalTransferPage();
        footerPage.ValidateInternalTransferPage();
    }
    @Test
    public void testFooterBillSPaymentervicePage(){
        footerPage.FooterBillSPaymentervicePage();
        footerPage.ValidateBillPaymentServicePage();
    }
    @Test
    public void testFooterZelleNetworkPage(){
        footerPage.FooterZelleNetworkPage();
        footerPage.ValidateZelleNetworkPage();
    }
    @Test
    public void testFooterACHWirePage(){
        footerPage.FooterACHWirePage();
        footerPage.ValidateACHWirePage();
    }
    @Test
    public void testFooterDisclaimernPage(){
        footerPage.FooterDisclaimernPage();
        footerPage.ValidateDisclaimerPage();
    }


}
