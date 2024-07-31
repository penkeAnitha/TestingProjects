package TestCase;

import DriverSetup.Chromedriversetup;
import Pages.handlecategories;
import Pages.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AllCategoriestest extends handlecategories {

    public static void main(String[] args) throws InterruptedException {
        Chromedriversetup driverSetup = new Chromedriversetup();
        driverSetup.Chromedriversetup();
        login log = new login();
        handlecategories handlecategories = new handlecategories();
        WebDriver driver = driverSetup.getdriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        ArrayList<String> expectedResult = new ArrayList<String>();
        expectedResult.add("Artists");
        expectedResult.add("Crew");
        expectedResult.add("vendor");
        expectedResult.add("Wedding FilmMakers");

        log.loginMethod();   // login to the application
       ArrayList<String> categoriesListfromWeb = handlecategories.getAllCategories();  // to get all categories from the web
        System.out.println("list of values" + categoriesListfromWeb);
    if(expectedResult.equals(categoriesListfromWeb)){
        System.out.println("expectedResult"+ expectedResult);
        System.out.println("categoriesListfromWeb" +categoriesListfromWeb );
        System.out.println("All categories test passed");
    }else{
        System.out.println("expectedResult"+ expectedResult);
        System.out.println("categoriesListfromWeb" +categoriesListfromWeb );
        System.out.println("all categories test failed");
    }
    }
}















