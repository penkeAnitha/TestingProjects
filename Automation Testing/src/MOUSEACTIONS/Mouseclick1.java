package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Mouseclick1 {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//it opens the chrome browser
     driver.get("https://staging.yourmoca.com");
    driver.manage().window().maximize();
    Actions actions=new Actions(driver);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement categories=driver.findElement(By.xpath("//a[@class=\"jss1\" and @href=\"/allcategories\"]"));
    actions.click(categories).perform();



}
}
