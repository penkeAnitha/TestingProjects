package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Webtable extends Chromedriversetup {
    public static void main(String[] args) {
        Chromedriversetup driverSetup = new Chromedriversetup();
        driverSetup.Chromedriversetup();
        WebDriver driver = getdriver();
        driver.get(" https://cosmocode.io/automation-practice-webtable");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> countriesList = driver.findElements(By.xpath("//td//strong[not(ancestor::h3)]"));
        List<WebElement> listoftablerows = driver.findElements(By.tagName("tr"));
        List<WebElement> listofcolumns = driver.findElements(By.tagName("td"));
        WebElement tableId = driver.findElement(By.id("countries"));

        // to check the visibility of the web table.
        if (tableId.isDisplayed()) {
            System.out.println("Table Element found");
        } else {
            System.out.println(" Table Element not found");
        }

        // getting and printing all the country names from the web table
        if(!countriesList.isEmpty()){
            for(WebElement elements: countriesList){
                String countryName = elements.getText();
                System.out.println(countryName);
            }
        }else{
            System.out.println("country list not found");
        }


        // getting no.of rows
        if (!listoftablerows.isEmpty()) {
            System.out.println("Rows found: " + listoftablerows.size());
        } else {
            System.out.println("No rows found");
        }


        // getting no.of columns
        if (!listofcolumns.isEmpty()) {
            System.out.println("Columns found: " + listofcolumns.size());
        } else {
            System.out.println("No columns found");
        }

    }
}



