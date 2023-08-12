package ProjectSalinaka;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


public class CaptureScreenShots extends BrowserClass {
    public static void screenShot(String name) throws Exception
    {
        TakesScreenshot shot = ((TakesScreenshot)driver);
        File source = shot.getScreenshotAs(OutputType.FILE);
        String path =System.getProperty("user.dir")+"\\target\\Screenshot\\"+name+".png";
        File destination = new File(path);
        FileUtils.copyFile(source,destination);

    }
}


