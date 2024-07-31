package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import Pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Multiplefileuploadings extends Chromedriversetup {
    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        login log = new login();
        log.loginMethod();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"My Profile\"]")));
        element.click();

        WebElement myportfolio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"My Portfolio\"]")));
        myportfolio.click();

        WebElement photos = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"+Photos\"]")));
        photos.click();

        WebElement addicon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"add icon\"]")));
        Thread.sleep(5000);
        WebElement multiplefile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"mediaInput\" and @multiple]")));

        String[] filepaths = {" C:\\Users\\ANITHA\\Downloads\\Flying Butterfly Phone Wallpapers.png",
                " C:\\Users\\ANITHA\\Downloads\\Flying Butterfly Phone Wallpapers.png"};

        // Convert array to a single string separated by newlines
        String multiplefilepaths = String.join("\n", filepaths);
        multiplefile.sendKeys(multiplefilepaths);
        // System.out.println("images uploaded");

        WebElement withoutcrop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Without Crop\"]")));
        for (int imageCount = 0; imageCount < filepaths.length; imageCount++) {
            withoutcrop.click();
        }

        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"MuiGrid-root css-1vlgsnl\"]//img[@alt=\"image\"]"));
        if(filepaths.length == list.size()){
            System.out.println("successfully uploaded " +list.size() + " images");
        }

    }
}



