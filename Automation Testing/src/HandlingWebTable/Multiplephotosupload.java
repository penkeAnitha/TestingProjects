package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Multiplephotosupload extends Chromedriversetup {
    public static void main(String[] args) {

        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"My Profile\"]")));
        element.click();

        WebElement myportfolio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"My Portfolio\"]")));
        myportfolio.click();

        WebElement photos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"+Photos\"]")));
        photos.click();

        WebElement addicon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"add icon\"]")));

        WebElement multiplefile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"mediaInput\" and @multiple]")));

        String[] photospath = {
                "ANITHA\\Downloads\\pexels-photo-1366919.jpeg",
                "C:\\Users\\ANITHA\\Downloads\\pexels-photo-9719490.webp",
                "C:\\Users\\ANITHA\\Downloads\\Flying Butterfly Phone Wallpapers.png",
                "C:\\Users\\ANITHA\\Downloads\\pexels-photo-1123972.jpeg",
                "C:\\Users\\ANITHA\\Downloads\\pexels-photo-1082663.jpeg",
                "C:\\Users\\ANITHA\\Downloads\\images (10).jpg",
                "C:\\Users\\ANITHA\\Downloads\\Flying Butterfly Phone Wallpapers.png",
                " C:\\Users\\ANITHA\\Downloads\\beautiful-hand-draw-floral-wedding-card-template_1035-17462.png",
                " C:\\Users\\ANITHA\\Downloads\\pexels-photo-1082663.jpeg",
                "C:\\Users\\ANITHA\\Downloads\\download (46).jpg"
        };

    }
}
