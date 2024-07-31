package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Draganddrop2 {
public static void main(String[]args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.manage().window().maximize();
 driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement drag=driver.findElement(By.xpath("//div[@id=\"box3\"]"));
    WebElement drop=driver.findElement(By.xpath("//div[@id=\"box103\"]"));
    Thread.sleep(10000);
    actions.clickAndHold(drag).release(drop).build().perform();




}
}
