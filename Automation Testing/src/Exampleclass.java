import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Exampleclass {
 public static void main(String[]args){
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             //driver.get("https://artoftesting.com/samplesiteforselenium");//
             WebElement elementbutton= driver.findElement(By.xpath("//button[@id=\"idOfButton\"]"));
             elementbutton.click();
             WebElement elementradio = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
             elementradio.click();
       /*List<String> xpathsToClick = new ArrayList<>();
       xpathsToClick.add("//input[@class=\"Automation\"]");
       xpathsToClick.add(("//input[@class=\"Performance\"]"));
        for (String xpath : xpathsToClick) {
            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();
        }*/
             ;
             List<WebElement> list = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
             for (WebElement element : list) {
                 element.click();
             }

         }

     }







