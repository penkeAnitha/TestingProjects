package MOUSEACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dragandrop {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
        WebElement drop = driver.findElement(By.xpath("//div[@class=\"ui-widget-header ui-droppable\"]"));
        Thread.sleep(10000);
        actions.clickAndHold(drag).moveToElement(drop).release().build().perform();
        if (drag.isDisplayed()) {
            System.out.println("successful");
        } else {
            System.out.println("not successful");
        }





    }

}




