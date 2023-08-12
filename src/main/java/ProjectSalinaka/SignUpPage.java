package ProjectSalinaka;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class SignUpPage extends BrowserClass {

  public static void Test1Signup(int row, int column) throws Exception
    {
        String email;
        String PW;
        int Password = column + 1;
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\ProjectTestData.xlsx";

        FileInputStream file = new FileInputStream((filePath));
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet ws = wb.getSheetAt(0);

        PW = String.valueOf(ws.getRow(row).getCell(Password));
        email = String.valueOf(ws.getRow(row).getCell(column));
        WebDriver login;
        driver.findElement(By.xpath("//a[@class='button button-small']")).click();
        driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Kavitha");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='button auth-button']")).click();
        Thread.sleep(4000);


    }


}
