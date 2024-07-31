package TestCase;

import DriverSetup.Chromedriversetup;
import Pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class logintestcase extends Chromedriversetup{
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup driverSetup = new Chromedriversetup();
        driverSetup.Chromedriversetup();
        login log = new login();
        WebDriver driver = driverSetup.getdriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        log.loginMethod();
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"My Profile\"]")));
        if(element.isDisplayed()){
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");

        }



    }
}





