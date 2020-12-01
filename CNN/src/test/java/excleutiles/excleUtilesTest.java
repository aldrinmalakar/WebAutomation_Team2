package excleutiles;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utiles.ExcleUtiles;
import java.io.IOException;
import static utiles.ExcleUtiles.*;

public class excleUtilesTest extends WebAPI {
    ExcleUtiles homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, ExcleUtiles.class);
    }

    @Test
    public void getDataFromexcel() throws IOException {
        homepage.readExcelFile(FILE_NAME, 1);
    }


}
