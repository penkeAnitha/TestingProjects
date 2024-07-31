import org.p
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceclass2 {
public static void main(String[]args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//it opens the chrome browser
    driver.manage().window().maximize();
    driver.navigate().to("https://dev.yourmoca.com/home");
    Thread.sleep(20000);
    driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]")).click();
    driver.findElement(By.xpath("//p[text()=\"film\"]")).click();
    driver.navigate().to("https://dev.yourmoca.com/home");




}
}
