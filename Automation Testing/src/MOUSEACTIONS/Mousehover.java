package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mousehover {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com");
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement element=driver.findElement(By.xpath("//a[text()=\"Contribute\"]"));
    WebElement element1=driver.findElement(By.xpath("//a[@href=\"https://contribute.jquery.org/style-guide/\"]"));
    actions.moveToElement(element).moveToElement(element1).click().perform();
    driver.quit();






}
}
