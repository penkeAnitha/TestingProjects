package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import Pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Fileupload3 extends Chromedriversetup {
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        login log=new login();
        log.loginMethod();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"My Profile\"]")));
        element.click();

        WebElement myportfolio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"My Portfolio\"]")));
        myportfolio.click();

        WebElement photos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"+Photos\"]")));

        WebElement addicon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"add icon\"]")));
        WebElement fileinput = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.querySelector('input[type=file]')");

        fileinput.sendKeys(" C:\\Users\\ANITHA\\Downloads\\download (42).jpeg");

        WebElement withpoucrop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Without Crop")));

        WebElement uploadfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"Upload\"]")));
        uploadfile.click();


    }
}
