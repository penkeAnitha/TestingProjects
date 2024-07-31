package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
 public static void main(String[]args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     Actions actions = new Actions(driver);
     driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
     WebElement context=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
     actions.contextClick(context).perform();
     WebElement copy=driver.findElement(By.xpath("//li [@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]"));
     Thread.sleep(5000);
     driver.switchTo().alert().accept();





 }
}
