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

public class FIleuploadings extends Chromedriversetup {
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        login log = new login();
        log.loginMethod();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"My Profile\"]")));
        element.click();

        WebElement myportfolio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"My Portfolio\"]")));
        myportfolio.click();

        WebElement photos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"+Photos\"]")));
        photos.click();

        WebElement photosPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"dialog\"]")));//
        if (photosPopup.isDisplayed()) {
            WebElement addIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column jss88 css-tqt9v1\"]//img[@alt=\"add icon\"]")));
            addIcon.click();
        }

         WebElement fileinput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file' and @accept=\"image/*\"]")));
       // WebElement fileinput = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.querySelector('input[type=file]')");
        fileinput.sendKeys("C:\\Users\\ANITHA\\Downloads\\download (26).jpg");

        WebElement wihoutCropBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiGrid-root css-1ln76y9\"]//span[text()=\"Without Crop\"]")));
        Thread.sleep(5000);
        wihoutCropBtn.click();

        WebElement uploadedImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiGrid-root css-1vlgsnl\"]//img[@alt=\"image\"]")));
        if (uploadedImage.isDisplayed()) {
            System.out.println("successfully uploaded image");
        } else {
            System.out.println("image uploading failed");
        }


    }

}
