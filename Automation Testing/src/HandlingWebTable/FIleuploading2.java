package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FIleuploading2 extends Chromedriversetup {
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fileUpload = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload")));
        fileUpload.sendKeys("C:\\Users\\ANITHA\\Documents\\file1.txt"); // Replace with the path of the file you want to upload
        Thread.sleep(5000);
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();



    }
}
