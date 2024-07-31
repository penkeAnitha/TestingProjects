package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Handlingpops {
 public static void main (String[]args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     Actions actions = new Actions(driver);
     driver.manage().window().maximize();
    /* driver.get("https://the-internet.herokuapp.com/upload");
     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)) ;
     WebElement fileUpload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload")));
     fileUpload.sendKeys("C:\\Users\\ANITHA\\Documents\\file1.txt"); // Replace with the path of the file you want to upload
     Thread.sleep(5000);
     WebElement upload=driver.findElement(By.id("file-submit"));
     upload.click();

     */

     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)) ;
  driver.get(" https://www.forbes.com");
  WebElement ad=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"fbs-ad--top-wrapper fbs-ad--top-wrapper--desktop fbs-ad--top-wrapper-with-label\"]")));
  WebElement button=driver.findElement(By.id(" "));
  button.click();
     System.out.println("Closed the advertisement pop-up.");
 if(button.isDisplayed()){
   System.out.println(" advertisment popup found");

 }else{
     System.out.println("not found");
 }

 }
}
