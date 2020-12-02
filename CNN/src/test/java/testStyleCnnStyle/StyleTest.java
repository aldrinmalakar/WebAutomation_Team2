package testStyleCnnStyle;

import cnnStyle.Style;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StyleTest extends WebAPI {
    Style style;
    @BeforeMethod
    public void gitInit(){
        style = PageFactory.initElements(driver, Style.class);
    }
    @Test(enabled = false)
    public void testWillAntiMicrobialFashion() throws InterruptedException {
        style.willAntiMicrobialFashionWithCredential();
        style.validateWillAntiMicrobialFashionCredential();
    }
}
