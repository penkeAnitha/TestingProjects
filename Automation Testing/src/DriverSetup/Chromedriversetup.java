package DriverSetup;

import Pages.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriversetup {
   public static WebDriver driver;
   // WebDriver driver;
    public static void Chromedriversetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static WebDriver getdriver() {
        return driver;
    }

}


