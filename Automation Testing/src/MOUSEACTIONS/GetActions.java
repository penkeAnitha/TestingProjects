package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class GetActions {
 public static void main(String[]args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     driver.manage().window().maximize();
     driver.get(" https://www.google.com/");
     WebElement search= driver.findElement(By.xpath("//textarea[@role=\"combobox\"]"));
     search.sendKeys("testing tools");
     //search.sendKeys(Keys.ENTER);//
     Actions actions = new Actions(driver);
    /* Action Keydown=actions.keyDown(Keys.CONTROL).sendKeys("a").build();
     Keydown.perform();
     */
      actions.keyDown(Keys.SHIFT).sendKeys(search," testing tools").keyUp(Keys.SHIFT).sendKeys("testing tools").perform();


 }
}
