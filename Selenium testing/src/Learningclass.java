import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Learningclass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//it opens the chrome browser
        // driver.navigate().to("https://dev.yourmoca.com/mocalogin");
        driver.manage().window().maximize();
        driver.get("https://dev.yourmoca.com/mocalogin");
        Thread.sleep(30000);
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("anithapenke1432@gmail.com");
        driver.findElement(By.xpath(" //input[@type=\"password\"]")).sendKeys("Krify@123");
        driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class=\"jss1\" and @href=\"/allcategories\"]")).click();
        Thread.sleep(9000);
        String Categories[]={"Artist","Crew","Vendor","Wedding filmaker"};
        for (int CategoryIndex = 0; CategoryIndex < Categories.length; CategoryIndex++){
            String Category = Categories[CategoryIndex];
            String CategoryXPath =Categories[0].formatted(Category);
            System.out.println(CategoryXPath);
            driver.findElement(By.xpath(CategoryXPath)).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            if(CategoryIndex==0){
                CategoryXPath="//div[text()=\"Artists\"]";
            }else{
                CategoryXPath="//div[text()=\"Crew\"]";
            }
            String subcategoryXPath =" ";
            Thread.sleep(20000);
            if(CategoryIndex==0){
             subcategoryXPath="//span[@class=\"jss33\"]";
            }else{
             subcategoryXPath="//span [@class=\"jss28\"]";
            }
            List<WebElement> listsubcategories = driver.findElements(By.xpath(subcategoryXPath));
            System.out.println("Number of categories under " + Category + ":" + listsubcategories.size());
            for (int subcategoryIndex = 0; subcategoryIndex < listsubcategories.size(); subcategoryIndex++) {
                WebElement subcategory = listsubcategories.get(subcategoryIndex);
                String subcategoryName = subcategory.getText();
                System.out.println((subcategoryIndex + 1) + " " + subcategoryName);
                driver.navigate().back();
                driver.close();

            }

        }
    }
}


