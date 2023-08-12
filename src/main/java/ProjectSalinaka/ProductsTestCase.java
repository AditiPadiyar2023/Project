package ProjectSalinaka;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsTestCase {
    @Test
    public void SelectingProduct() throws Exception{
        SignInPage.excel(3,1);
        ProductsPage.Catalog();
        Thread.sleep(2000);
        CaptureScreenShots.screenShot("ProductCheckOut");
    }

    @BeforeMethod
    public void Login() {
        BrowserClass.getUrl();
    }

    @AfterClass
    public void Quit() {
        BrowserClass.closeBrowser();

    }
}
