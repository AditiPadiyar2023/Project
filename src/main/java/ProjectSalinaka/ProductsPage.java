package ProjectSalinaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ProductsPage extends BrowserClass {
    public static WebElement product;
    public static WebElement colour;
    public static WebElement size;
    public static WebElement Select;
    public static WebElement addToBasket;
    public static WebElement Basket;
    public static WebElement checkOut;
public static WebElement NextStep;
    public static void Catalog()throws Exception
    {

driver.findElement(By.xpath("//a[@href='/shop\']")).click();
Thread.sleep(2000);
product = driver.findElement(By.xpath("//div[@class='product-grid']/div[3]"));
product.click();
Thread.sleep(2000);
 colour= driver.findElement(By.xpath("//div[@style='background-color: rgb(0, 0, 0);']"));
colour.click();
Thread.sleep(2000);

addToBasket=driver.findElement(By.xpath("//button[@class='button button-small ']"));



addToBasket.click();
Basket = driver.findElement(By.xpath("//button[@class='button-link navigation-menu-link basket-toggle']"));
Basket.click();

Thread.sleep(2000);
checkOut = driver.findElement(By.xpath("//button[@class='basket-checkout-button button']"));
checkOut.click();
Thread.sleep(2000);
NextStep = driver.findElement(By.xpath("//button[@class='button']"));
NextStep.click();
          }


}
