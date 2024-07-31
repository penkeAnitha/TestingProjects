package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SendKeys {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/locatorspractice");
   WebDriverWait wiat=new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement username=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
 username.sendKeys("Admin");
 WebElement password=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
 password.sendKeys("rahulshettyacademy");
 WebElement submit=driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]"));
 submit.click();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 WebElement logout =driver.findElement(By.xpath("//button[@class=\"logout-btn\"]"));
 logout.click();
  WebElement forgotpassword = driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]"));
  forgotpassword.click();
  WebElement name=  driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
   name. sendKeys("Anitha");
   WebElement email= driver.findElement(By.xpath("//input[@placeholder=\"Email\"]"));
    email.sendKeys("mamu 123");
  WebElement phonenumber=  driver.findElement((By.xpath("//input [@placeholder=\"Phone Number\"]")));
  phonenumber.sendKeys("45634565667");
  WebElement login=  driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]"));
  login.click();
 WebElement restelogin=   driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]"));
  restelogin.click();
  WebElement visit=driver.findElement(By.xpath("//button[@class=\"ghost\"]"));
  visit.click();
  


}
}
