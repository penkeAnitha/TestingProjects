package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Draganddrop3 {
public static void main(String[]args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.manage().window().maximize();
    driver.get(" https://demo.guru99.com/test/drag_drop.html");
    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement drag=driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
    WebElement drop=driver.findElement(By.xpath("//a[number()= \"-5000\"] "));
    Thread.sleep(10000);
    actions.dragAndDropBy(drag,50,50).release(drop).perform();
    if(drag.isDisplayed()){
        System.out.println(" dropped successfully");
    }else{
        System.out.println(" dropped unsuccessfully");
    }


    }



}
