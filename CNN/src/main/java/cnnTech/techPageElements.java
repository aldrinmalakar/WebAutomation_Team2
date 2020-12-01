package cnnTech;

public class techPageElements {
    public static final String testHomeURL = "https://www.cnn.com/business/tech";

    public static final String navBarArticle1 = "//*[@id=\"tech-zone-1\"]/div[2]/div/div[2]/ul/li[1]/article/div/div[2]/h3";
    public static final String liveTVElement = "div[class='Flex-sc-1sqrs56-0 indexes__LiveTVWrap-nujtvs-15 jngOia'] span[class='Text-sc-1amvtpj-0-span bcvWKK']";
    public static final String liveTVURLElement = "https://go.cnn.com/?stream=cnn";
    public static final String liveTVPlayElement = "div.Box-sc-1fet97o-0.bbphNa:nth-child(2) div.Box-sc-1fet97o-0.hyVhvp div.Box-sc-1fet97o-0.sc-ksYbfQ.eQpzih div.Box-sc-1fet97o-0.hyVhvp svg.play-icon > path:nth-child(1)";
    public static final String cnnGoPreviewElement = "//div[normalize-space()='You are Watching a Preview of CNNgo']";

    public static final String editionPickerElement = "//div[@id='edition-picker-desktop']";
    public static final String intlEditionPickerElement = "div[class='Box-sc-1fet97o-0 indexes__Dropdown-sc-1rspu01-2 iISZyL'] a[name='international']";
    public static final String getIntlEditionPickerElement = "https://edition.cnn.com/?hpt=header_edition-picker";

    public static final String getMenuElement = "//button[@id='menuButton']//*[local-name()='svg']";
    public static final String marketMoversElement = "//a[normalize-space()='Market Movers']";
    public static final String expectedMoneyMoverToolTipElement = "visit the Market Movers section";

    public static final String successPageFromMenuDropDownElement = "//a[@class='sc-fjdhpX sc-chPdSV gxWYAY'][normalize-space()='Success']";
    public static final String exoectedSuccessURL = "https://www.cnn.com/business/success";
    public static final String expectedSuccessTitle = "Careers - News for Entrepreneurs and Leaders on CNN Business - CNN";

    public static final String mediaPageFromMenuDropDownElement = "//a[@class='sc-fjdhpX sc-chPdSV gxWYAY'][normalize-space()='Media']";
    public static final String expectedMediaURL = "https://www.cnn.com/business/media";
    public static final String expectedMediaTitle = "Media News - Latest Headlines on CNN Business - CNN";

    public static final String weatherPageFromMenuDropDownElement = "//a[@data-analytics='header_expanded-nav'][normalize-space()='Weather']";
    public static final String expectedWeatherURL = "https://www.cnn.com/weather";
    public static final String expectedWeatherTitle = "Weather news and local forecast - CNN";

    public static final String couponPageFromMenuDropDownElement = "//a[@data-analytics='header_expanded-nav'][normalize-space()='Coupons']";
    public static final String expectedCouponURL = "https://coupons.cnn.com/";
    public static final String expectedCouponTitle = "CNN Coupons: Promo codes, Coupons & Deals for November 2020";

    public static final String editionChangeIDElement = "edition-picker-desktop";
    public static final String internationalEditionXpathElement = "//div[@class='Box-sc-1fet97o-0 indexes__Dropdown-sc-1rspu01-2 iISZyL']//a[@name='international'][normalize-space()='International']";
    public static final String expectedInternationalURL = "https://edition.cnn.com/?hpt=header_edition-picker";
    public static final String expectedInternationalTitle = "CNN International - Breaking News, US News, World News and Video";

    public static final String searchCNNXpathElement = "//div[@class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN']//button[@class='sc-jhAzac sc-gisBJw hioqcg']//*[local-name()='svg']//*[name()='path' and contains(@d,'M55.3,51.8')]";
    public static final String searchHeadIDElement = "header-search-bar";
   // public static final String searchSendKeyString = "Bangladesh";
    public static final String searchSearchButtonCssElement = "//div[@class='Text-sc-1amvtpj-0 iEWJSI']";
    public static final String searchRadioWorldIDElement = "left_world";
    public static final String expectedSearchURL = "https://www.cnn.com/search?q=Bangladesh&size=10&category=world";
    public static final String expectedSearchTitle = "Search CNN - Videos, Pictures, and News - CNN.com";

    public static final String moreNewsR1C1Xpath = "//*[@id=\"tech-zone-3\"]/div[6]/div[2]/div/div/div[1]/article/div/div[1]/a/img";
    public static final String moreNewsR1C2Xpath = "//*[@id=\"tech-zone-3\"]/div[6]/div[2]/div/div/div[2]/article/div/div[1]/a/img";
    public static final String moreNewsR1C3Xpath = "//*[@id=\"tech-zone-3\"]/div[6]/div[2]/div/div/div[3]/article/div/div[1]/a/img";
    public static final String moreNewsR1C4Xpath = "//*[@id=\"tech-zone-3\"]/div[6]/div[2]/div/div/div[4]/article/div/div[1]/a/img";
    public static final String moreNewsR2C1Xpath = "//*[@id=\"tech-zone-3\"]/div[6]/div[2]/div/div/div[5]/article/div/div[1]/a/img";

    public static final String fBExpectedLogoClass = "facebook-icon";
    public static final String fbLogoXpath = "//footer[@id='footer-nav-container']//a[@name='Facebook page']//*[local-name()='svg']";
    public static final String fbExpectedURL = "https://www.facebook.com/cnnbusiness";

    public static final String twitterExpectedLogoClass = "twitter-icon";
    public static final String twitterLogoXpath = "//footer[@id='footer-nav-container']//a[@name='Twitter feed']//*[local-name()='svg']";
    public static final String twitterExpectedURL = "https://twitter.com/CNNbusiness";

    public static final String instaExpectedLogoClass = "instagram-icon";
    public static final String instaLogoXpath = "//footer[@id='footer-nav-container']//a[@name='Instagram feed']//*[local-name()='svg']";
    public static final String instaExpectedURL = "https://www.instagram.com/cnnbusiness/";

    public static final String signInButtonXpath = "//div[@id='nav']//div//div[1]//div[1]//div[6]";
    public static final String signInEmailAddressXpath = "//input[@name='loginEmail']";
    public static final String signInPasswordXpath = "//input[@name='loginPassword']";
    public static final String signInStayLoggedBoxXpath = "//*[@id=\"login-modal-content\"]/form/div[3]/label/div/svg";
    public static final String signInLogInButtonID = "login-form-button";
    public static final String signInFeedbackMessageID = "feedback-message";
    public static final String signInAssertErrorMessage = "You have entered an invalid username or password.";
    public static final String signInEmailAddressUno = "testemailuno@testserver.com";
    public static final String signInEmailAddressDos = "testemaildos@testserver.com";
    public static final String signInEmailAddressTres = "testemailtres@testserver.com";
    public static final String signInEmailAddressQuatro = "testemailquatro@testserver.com";
    public static final String signInPassword = "testPassword123";

    public static final String footerSearchID = "footer-search-bar";
    public static final String searchResultXpath = "//div[@class='cnn-search__results-count']//strong";
    public static final String keywordCovid = "Covid-19";
    public static final String keywordTrump = "Donald Trump";
    public static final String keywordBiden = "Joe Biden";
    public static final String keywordFinances = "Finances";




}
