import ProjectSalinaka.BrowserClass;
import ProjectSalinaka.CaptureScreenShots;
import ProjectSalinaka.SignInPage;
import ProjectSalinaka.SignUpPage;
import org.testng.annotations.*;

public class SinginTestCases {



        @Test
        public void SingIN1() throws Exception {

            SignInPage.excel(1,1);
            Thread.sleep(2000);
            CaptureScreenShots.screenShot("SignIn1");
        }
@Test
public void SingIN2()throws Exception  {
    SignInPage.excel(2, 1);
    Thread.sleep(1000);
    CaptureScreenShots.screenShot("SignIn2");
}
@Test
public void SingIN3() throws Exception
{
    SignInPage.excel(3, 1);
    Thread.sleep(1000);
    CaptureScreenShots.screenShot("SignIn3");
}
        @BeforeMethod
        public void Login() {
            BrowserClass.getUrl();
        }

        @AfterMethod
        public void Quit() {
            BrowserClass.closeBrowser();
        }
    }


