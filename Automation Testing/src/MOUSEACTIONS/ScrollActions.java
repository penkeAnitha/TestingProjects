package MOUSEACTIONS;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollActions {
public static void main(String[]args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.get("https://omayo.blogspot.com");
    driver.manage().window().maximize();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
   // js.executeScript("window.scrollBy(0,400)");
    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Check this']")));
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true)" ,element);
    js.executeScript("window.scrollBy(0,400)");
    Thread.sleep(10000);
    element.click();
    WebElement id=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"userid\"]")));
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    js.executeScript("window.scrollTo(0,0)");
    driver.switchTo().frame("iframe1");
    driver.findElement(By.xpath("//a[text()=\"What is Selenium?\"]")).click();
    System.out.println("clicked");
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//input[@id=\"timerButton\"]")).click();






}
}
