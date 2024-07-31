package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practiceclass1 {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signinbutton = driver.findElement(By.xpath("//button [@class=\"submit signInBtn\"]"));
        actions.click(signinbutton).perform();
        WebElement checkbox = driver.findElement(By.xpath("//input[@name=\"chkboxOne\"]"));
        actions.click(checkbox).perform();
        WebElement visitus1 = driver.findElement(By.xpath("//button[@class=\"ghost\"]"));
        actions.contextClick(visitus1).perform();
        WebElement forgotyourpassword = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
        actions.moveToElement(forgotyourpassword).click().perform();
        WebElement loginbutton = driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]"));
        actions.clickAndHold(loginbutton).perform();
        WebElement visitus = driver.findElement(By.xpath("//button[text()=\"Visit us\"]//following::button[1]"));
        actions.moveToElement(visitus).click().perform();




    }
}


