import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example2 {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    Actions actions=new Actions(driver);
    driver.get("https://dev.yourmoca.com/");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement context=driver.findElement(By.xpath("//img[@title=\"YM- 47371809\"]"));
 actions.moveToElement(context).perform();

}
}
