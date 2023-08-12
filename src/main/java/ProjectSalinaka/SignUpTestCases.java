package ProjectSalinaka;


import org.testng.annotations.*;

public class SignUpTestCases {

    @Test//Test case with invalid data
    public void SingUP1() throws Exception {

        SignUpPage.Test1Signup(1,1);
        Thread.sleep(2000);
        CaptureScreenShots.screenShot("SignUP1");
    }
   @Test //test case with invalid data
    public void SingUP2() throws Exception {

        SignUpPage.Test1Signup(2,1);
        Thread.sleep(2000);
        CaptureScreenShots.screenShot("SignUP2");
    }
    @Test //test case with valid data
    public void SingUP3() throws Exception {

        SignUpPage.Test1Signup(3,1);
        Thread.sleep(2000);
        CaptureScreenShots.screenShot("SignUP3");
    }


    @BeforeMethod
    public void Login() {
        BrowserClass.getUrl();
    }

    @AfterMethod

    public void Quit() {
        BrowserClass.closeBrowser();

}}