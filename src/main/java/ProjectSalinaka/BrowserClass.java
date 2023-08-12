package ProjectSalinaka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass
    {


        public static WebDriver driver;



    public static void getUrl()
    {
        driver = new ChromeDriver();

        driver.get("https://salinaka-ecommerce.web.app/");
        driver.manage().window().maximize();
    }
    public static void closeBrowser() {
        driver.close();
    }


}
