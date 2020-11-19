package MOREPAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.WebAPI;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static MOREPAGE.morePageLocators.*;

public class morePage extends WebAPI {


    @FindBy(how = How.XPATH,using = openMenuWebElement)
    public WebElement openMenu;
    @FindBy(how = How.XPATH,using = worldWebElement)
    public WebElement world;
    @FindBy(how = How.XPATH,using = accountUserWebElement)
    public WebElement accountUser;
    @FindBy(how = How.NAME,using = emailWebElement)
    public WebElement emailField;
    @FindBy(how = How.CSS,using =checkTextWeb)
    public WebElement checkText;
    @FindBy(how = How.NAME,using = passwordFieldWebElement)
    public WebElement passwordField;
    @FindBy(how =How.ID,using =loginWebElement)
    public WebElement loginButton;
    @FindBy(how = How.CSS,using = checkBoxWebElement)
    public WebElement checkBox;
    @FindBy(how = How.CSS,using = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(how = How.ID,using = searchBox1WebElement)
    public WebElement SearchBox1;
    @FindBy(how = How.XPATH,using = searchBox2WebElement)
    public WebElement SearchBox2;
    @FindBy(how = How.XPATH,using =algeria)
    public WebElement algeriaText;
    @FindBy(how = How.ID,using = editionWebElement)
    public WebElement Edition;
    @FindBy(how = How.XPATH,using = arabWebElement)
    public WebElement clickArab;
    @FindBy(how = How.ID,using = arabLogo)
    public WebElement arabAttribute;
    @FindBy(how = How.XPATH,using =logoWebElement)
    public WebElement logo;
    @FindBy(how = How.XPATH,using = liveTVWebElement)
    public WebElement liveTv;
    @FindBy(how = How.XPATH,using = channelsWebElements)
    public WebElement channels;
//    @FindBy(how = How.CLASS_NAME,using = liveTvWebElement)
//    public WebElement playLiveTv;
//    @FindBy(how = How.CLASS_NAME,using = liveLogoWebElement)
//    public WebElement liveLogo;
    @FindBy(how = How.XPATH,using = cnnProfilesWebElement)
    public WebElement CNNProfiles;
    @FindBy(how = How.XPATH,using = cnnProfile)
    public WebElement profilesDisplay;
    @FindBy(how = How.XPATH,using =photosWebElement)
    public WebElement photos;
    @FindBy(how = How.CSS,using = checkPhotosWebElement)
    public WebElement checkPhotos;
    @FindBy(how = How.XPATH,using = investigationsWebElement)
    public WebElement investigations;
    @FindBy(how = How.XPATH,using = espanolWebElement)
    public WebElement espanol;
    @FindBy(how = How.CLASS_NAME,using = forgotPasswordWebElement)
    public WebElement forgotPassword;
    @FindBy(how = How.XPATH,using = recoverWebElement)
    public WebElement recover;
    @FindBy(how = How.XPATH,using = workForCNNWeb)
    public WebElement workForCNN;
    @FindBy(how = How.ID,using = cityDropdownWebElement)
    public WebElement cityDropdown;
    @FindBy(how = How.CLASS_NAME,using = languageButton)
    public WebElement language;
    @FindBy(how = How.XPATH,using = areaOfInterestDropdown)
    public WebElement AreaDropdown;








    public void cnnTitleValidation(){
       String expectedCnnTitle="Breaking News, Latest News and Videos - CNN";
       String actualCnnTitle =driver.getTitle();
       Assert.assertEquals(actualCnnTitle,expectedCnnTitle,titleMessage);
   }

    public void openMenuButton(){
        openMenu.click();
        world.click();
    }
    public void validationOpenMenuButton(){
        String expectedWorldTitle="World news – breaking news, videos and headlines - CNN";
      String actualWorldTitle=driver.getTitle();
      Assert.assertEquals(actualWorldTitle,expectedWorldTitle,titleMessage);
    }

    public void accountUser()  {
        accountUser.click();
    }
    public void validateAccountUser(){
       String expectedAccountUserAttribute="Text-sc-1amvtpj-0 jphQRj";
       String actualAccountUserAttribute= checkText.getAttribute("class");
        System.out.println(actualAccountUserAttribute);
       Assert.assertEquals(actualAccountUserAttribute,expectedAccountUserAttribute,"test fails");
    }

    public void logInWithInvalidPassword(){
        accountUser.click();
        emailField.sendKeys(emailData);
        passwordField.sendKeys(passWordData);
        loginButton.click();
    }
    public void validateLogInWithInvalidPassword(){
        String expectedLoginMessageText="You have entered an invalid username or password.";
        String actualLoginMessageText=getTextByXpath(loginMessageText);
        System.out.println(actualLoginMessageText);
        Assert.assertEquals(actualLoginMessageText,expectedLoginMessageText,"failed");
    }

    public void isSelectedCheckBox() throws InterruptedException {
        accountUser.click();
        Thread.sleep(3000);
       boolean b= checkBox.isSelected();
        System.out.println("the checkBox is selected "+b);// should return true
        checkBox.click();
        boolean b1= checkBox.isSelected();
        System.out.println("the checkBox is selected "+b1);//should return false

    }

    public void SearchBox(){
        searchBox.click();
        SearchBox1.sendKeys("algeria");
        SearchBox2.click();
    }
    public void ValidateSearchBox(){
        String expectedAlgeriaText="algeria";
        String actualAlgeriaText=algeriaText.getText();
        Assert.assertEquals(actualAlgeriaText,expectedAlgeriaText,titleMessage);
    }

    public void EditionButton() {
        Edition.click();
        clickArab.click();
    }
    public void validateEditionButton(){
      String expectedAttributeId="homePageNavBt";
      String actualAttributeId=  arabAttribute.getAttribute("id");
      System.out.println("the value of id is : "+actualAttributeId);
      Assert.assertEquals(actualAttributeId,expectedAttributeId,"test failed");
    }

    public void CnnLogo(){
        logo.click();
    }
    public void validateCnnLogo(){
        String expectedHomeTitle="Breaking News, Latest News and Videos - CNN";
        String actualHomeTitle= driver.getTitle();
        System.out.println(actualHomeTitle);
        Assert.assertEquals(actualHomeTitle,expectedHomeTitle,titleMessage);
    }

    public void liveTV(){
        liveTv.click();
    }
    public void validateLiveTV(){
        String expectedChannelsAttribute="20";
        String actualChannelsAttribute=channels.getAttribute("height");
        System.out.println(actualChannelsAttribute);
        Assert.assertEquals(actualChannelsAttribute,expectedChannelsAttribute,"failed !");
    }

//    public void playLiveTV() throws InterruptedException {
//        liveTv.click();
//        playLiveTv.click();
//        Thread.sleep(4000);
//    }
//    public void ValidatePlayLiveTV(){
//        boolean b= liveLogo.isDisplayed();
//        System.out.println("the live logo is displayed? "+b);
//    }


    public void CnnProfiles(){
        CNNProfiles.click();
    }
    public void validateCnnProfiles(){// should return true
        boolean b=profilesDisplay.isDisplayed();
        System.out.println("is cnn profiles displayed ?"+b);
    }


    public void BackForward() throws InterruptedException {
        Thread.sleep(3000);
        navigateBack();
        Thread.sleep(3000);
        navigateForward();
    }
    public void validateBackForward(){
      String actualPageURL= getCurrentPageUrl();
      String expectedPageURL="https://www.cnn.com/more";
        System.out.println(actualPageURL);
      Assert.assertEquals(actualPageURL,expectedPageURL,"failed");
    }

    public void Photos(){
        photos.click();
    }
    public void validatePhotos(){
        boolean b=checkPhotos.isDisplayed();
        System.out.println("is displayed? "+b);

    }

    public void Investigations(){
        investigations.click();
    }
    public void validateInvestigations(){
        String actualInvestigationTitle="Breaking News, Latest News and Videos - CNN";
        String expectedInvestigationTitle=driver.getTitle();
        System.out.println(actualInvestigationTitle);
        Assert.assertEquals(actualInvestigationTitle,expectedInvestigationTitle,titleMessage);
    }

    public void findAllLinkText(){
        List<WebElement> objLinks=driver.findElements(By.tagName("a"));
        for (WebElement objCurrentLink:objLinks) {
           String linkText = objCurrentLink.getText();
            System.out.println(linkText);
        }
    }

    public void FindAllInput(){
        List<WebElement> objInput=driver.findElements(By.tagName("input"));
        for (WebElement objCurrentInput:objInput) {
            String inputTag = objCurrentInput.getAttribute("input");
            System.out.println(inputTag);
        }
    }

    public void Espanol() throws InterruptedException {
        Edition.click();
        espanol.click();
        Thread.sleep(3000);
    }
    public void validateEspanol(){
        String expEspanolTitle="CNN en Español | Últimas noticias en español de Latinoamérica, Estados Unidos y el mundo";
        String actualEspanoTitle=driver.getTitle();
        Assert.assertEquals(actualEspanoTitle,expEspanolTitle,titleMessage);
    }

    public void ForgetPassword(){
        accountUser.click();
        forgotPassword.click();
    }
    public void validateForgetPassword(){
        String expectedRecoverText="Recover Password";
        String actualRecoverText =recover.getText();
        Assert.assertEquals(actualRecoverText,expectedRecoverText,"test failed");

    }

    public void WorkForCNN() throws InterruptedException {
        workForCNN.click();
        Thread.sleep(4000);
    }
    public void validateWorkForCNN(){
        String expWorkForCnnTitle="https://www.warnermediacareers.com/search-jobs?orgIds=1174&ac=19299";
        String actualWorkForCnnTitle=driver.getCurrentUrl();
        System.out.println(actualWorkForCnnTitle);
        Assert.assertEquals(actualWorkForCnnTitle,expWorkForCnnTitle,"failed");


    }

    public void dropdown() throws InterruptedException {
        workForCNN.click();
        cityDropdown.click();
        List<WebElement> city=driver.findElements(By.cssSelector(selectLondon));
        Thread.sleep(6000);
        for (WebElement londonCity:city) {
            if (londonCity.getText().equals("london")) {
                londonCity.click();
                break;
            }
        }
    }

    public void SelectPositionType() throws InterruptedException {
        workForCNN.click();
       WebElement selectPosition= driver.findElement(By.xpath("//select[@name='job_type']"));
        Select select =new Select(selectPosition);
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(3000);

    }


    public void CategoryDropdown() throws InterruptedException {
        workForCNN.click();
        WebElement selectCategory= driver.findElement(By.xpath(categoryDropdown));
        Select select =new Select(selectCategory);
        Thread.sleep(2000);
        select.selectByVisibleText("Technology");
        Thread.sleep(3000);
    }

    public void AreaOfInterestDropDown() throws InterruptedException {
        workForCNN.click();
        AreaDropdown.click();
        List<WebElement> area = driver.findElements(By.xpath(areaDropdown));
        Thread.sleep(6000);
        for (int i = 0; i < area.size(); i++) {
           // System.out.println(city.get(i).getText());
            if (area.get(i).getText().contains("Creative")) {
                area.get(i).click();
                break;
            }
        }
    }



















































}
