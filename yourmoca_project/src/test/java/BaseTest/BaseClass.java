package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ym_BasePackage.Base;
import ym_pages.Login;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class BaseClass extends Base {
    WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        setDriver();
        driver = getDriver();
        driver.get("https://dev.yourmoca.com/mocalogin");
    }

    public void navigateToCastingCalls() {
        driver.get("https://staging.yourmoca.com/castingcalls");
    }

    @AfterMethod
    public void quitDriver() {

        driver.quit();


    }

}
