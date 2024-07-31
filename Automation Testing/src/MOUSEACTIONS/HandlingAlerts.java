package MOUSEACTIONS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingAlerts {
 public static void main(String[]args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  Actions actions = new Actions(driver);
  driver.manage().window().maximize();
  driver.get(" https://www.hyrtutorials.com/p/alertsdemo.html");
  /*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
  driver.findElement(By.id("alertBox")).click();
  Alert simplealert=driver.switchTo().alert();
  System.out.println(simplealert.getText());
  simplealert.accept();
  Thread.sleep(5000);
   */
  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("confirmBox")))).click();
  wait.until(ExpectedConditions.alertIsPresent());
  Alert simplealert=driver.switchTo().alert();
  System.out.println(simplealert.getText());
  simplealert.accept();
 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("promptBox")))).click();

 }
}
