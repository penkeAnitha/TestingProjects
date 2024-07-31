package Pages;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class handlecategories extends Chromedriversetup {
    Chromedriversetup driverSetUp = new Chromedriversetup();
    WebDriver driver = driverSetUp.getdriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public ArrayList<String> getAllCategories() {
        WebElement allcategories = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/allcategories\" and @class=\"jss1\"]")));
        allcategories.click();
        ArrayList<String> list2 = new ArrayList<>();

        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item jss31 css-1wxaqej\"]")));

        for (WebElement element : elements) {
            String category = element.getText();
            list2.add(category);
        }

          return list2;
    }
}




