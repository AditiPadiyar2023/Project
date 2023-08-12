package ProjectSalinaka;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class SignInPage extends BrowserClass {
        public static void excel(int row, int column) throws Exception
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
                driver.findElement(By.xpath("//a[@class='button button-small button-muted margin-left-s']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PW);
                Thread.sleep(2000);
                driver.findElement(By.xpath("//button[@class='button auth-button']")).click();

            }

        }



