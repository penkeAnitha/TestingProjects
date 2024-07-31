package Pages;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class login extends Chromedriversetup {
  private  WebDriver driver;
    public login(){
        this.driver = getdriver();
    }

    public void loginMethod() throws InterruptedException {
       // driver.manage().window().maximize();
        driver.get("https://dev.yourmoca.com/mocalogin");
        String title = driver.getTitle();
        System.out.println(title);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"email\"]"))).sendKeys("anithapenke1432@gmail.com ");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"password\"]"))).sendKeys(" Krify@123");
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[text()=\"Login\"]")))).click();
        Thread.sleep(3000);
       // driver.navigate().refresh();


    }

}












