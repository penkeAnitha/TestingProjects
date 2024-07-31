import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshotclass {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        TakesScreenshot screenshot =(TakesScreenshot) driver;//which allows capturing screenshots in Selenium.
          File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./screenshot"+"/screen3.png"));
        System.out.println("screenshot captured");
    }
}
