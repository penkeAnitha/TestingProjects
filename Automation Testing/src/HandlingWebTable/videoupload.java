package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import Pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class videoupload extends Chromedriversetup {
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        login log = new login();
        log.loginMethod();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"My Profile\"]")));
        element.click();

        WebElement myprotofile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"My Portfolio\"]")));
        myprotofile.click();

        WebElement videoclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Videos (0)\"]")));
        videoclick.click();

        WebElement addvideo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()=\"+ADD\"]")));
        addvideo.click();

        WebElement browsefile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Browse file\"]")));
        browsefile.click();


        WebElement fileinput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@accept=\".mp4,.webm,.mov,.mkv\"]")));

        String videofile = "C:\\Users\\ANITHA\\Downloads\\stock-footage-mp-video-of-glowing-light-particles - Copy (2).webm";

        fileinput.sendKeys(videofile);

        WebElement uploadfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Upload\"]")));
        uploadfile.click();
        if (uploadfile.isDisplayed()) {
            System.out.println("successfully uploaded video");
        } else {
            System.out.println("video uploading failed");
        }
    }
}

