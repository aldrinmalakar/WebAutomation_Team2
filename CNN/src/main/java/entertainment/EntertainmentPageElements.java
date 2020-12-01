package entertainment;

public class EntertainmentPageElements {


    public static final String homepageUrl = "https://www.cnn.com/";
    public static final String entertainmentTabHeader= "//a[@type='collapsed'][normalize-space()='Entertainment']"; //xpath
    public static final String entertainmentPageTitle ="Entertainment News - Celebrities, Movies, TV, Music - CNN"; //expected title

    public static final String starsOnHeader ="div[class='Flex-sc-1sqrs56-0 sc-kvZOFW hSGLVW'] a[title='visit the Stars section']"; //css
    public static final String topStories= "//a[normalize-space()='Top Stories']"; //xpath
    public static final String searchMagnifierOption= "//div[@id='non-sticky-ad-wrap']//div[@class='ad ad--epic ad--all t-light']"; //xpath
    public static final String searchBarInput= "//*[@id=\"header-search-bar\"]";
    public static final String userIconForLogin= "//div[@class='Flex-sc-1sqrs56-0 indexes__HideOnMobile-nujtvs-13 fSxGEU']";
    public static final String emailInput= "//input[@aria-label='Email address']";
    public static final String passwordInput= "//input[@aria-label='Password']";
    public static final String loginButton= "#login-form-button";
    public static final String copyRight= "//span[contains(text(),'CNN Sans ™ & © 2016 Cable News Network.')]";


}
