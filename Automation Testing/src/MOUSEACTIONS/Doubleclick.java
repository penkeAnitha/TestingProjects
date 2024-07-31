package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Doubleclick {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
    driver.manage().window().maximize();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.switchTo().frame("iframeResult");
    WebElement box1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
    WebElement box2=driver.findElement(By.xpath("//input[@id=\"field2\"]"));
    WebElement button=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
    box1.clear();
    box1.sendKeys("Welcome");
    actions.doubleClick(button).perform();


}
}
