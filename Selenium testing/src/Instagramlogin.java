import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlogin {
 public static  void main(String[]args){
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
             WebDriver driver =new ChromeDriver();
             driver.get("https://www.instagram.com");
             String Title = driver.getTitle();
             System.out.println(Title);
             driver.navigate().to("https://www.instagram.com/");











 }
}
