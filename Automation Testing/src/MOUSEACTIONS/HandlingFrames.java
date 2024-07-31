package MOUSEACTIONS;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class HandlingFrames {
 public static void main(String[]args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(" https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
  WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type=\"text\" and @placeholder=\"Search...\"]")));
  input.sendKeys("Welcome");
  driver.switchTo().defaultContent();
  WebElement runbutton=driver.findElement(By.id("runbtn"));
   runbutton.click();

 }
 }









