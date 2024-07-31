import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

public class Practiceclass {
public static void main(String[]args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Academy");
    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rahulshettyacademy");
   driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//button[@class=\"logout-btn\"]")).click();
  driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]")).click();
   driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Anitha");
   driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("mamu 123");
   driver.findElement((By.xpath("//input [@placeholder=\"Phone Number\"]"))).sendKeys("45634565667");
    driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
    driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
    driver.findElement(By.xpath("//button[@class=\"ghost\"]")).click();

}
}
