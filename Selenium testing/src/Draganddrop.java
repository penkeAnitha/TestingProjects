import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Draganddrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        Webdriver driver = new Chromedriver();
        Actions actions = new Actions(driver);
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame(0);
        WebElement drop = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
        WebElement drag = driver.findElement(By.xpath("//div[@class=\"ui-widget-header ui-droppable\"]"));
        actions.dragAndDrop(drop, drag).perform();
        if (drag.isDisplayed()) {
            System.out.println("successful");
        } else {
            System.out.println("not successful");


        }


    }
}







