
import jdk.jfr.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;

import javax.lang.model.util.Elements;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
    public class Exercise1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();//it opens the chrome browser
            // driver.navigate().to("https://dev.yourmoca.com/mocalogin");
            driver.manage().window().maximize();
            driver.get("https://dev.yourmoca.com/mocalogin");
            String title = driver.getTitle();
            System.out.println(title);
            Thread.sleep(20000);
            driver.findElement(By.xpath("//input[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"]")).sendKeys("anithapenke1432@gmail.com");
            driver.findElement(By.xpath("//input[@type=\"password\"or@name=\"password\"]")).sendKeys("Krify@123");
            driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@class=\"jss1\" and @href=\"/allcategories\"]")).click();
            Thread.sleep(20000);
        /*driver.findElement(By.xpath("//div [@class=\"MuiGrid-root MuiGrid-item jss31 css-1wxaqej\"]")).click(); //to click artist
        Thread.sleep(20000);
        List<WebElement> list = driver.findElements(By.xpath("//span[@class=\"jss33\"]"));  //  artist sub-categories;*/

            List<WebElement> categoriesList = driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item jss31 css-1wxaqej\"]"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            for(WebElement element : categoriesList){
                String category =  wait.until(ExpectedConditions.visibilityOf(element)).getText();

                if(category.equalsIgnoreCase("Artists")){

                    WebElement element1 =driver.findElement(By.xpath("//div [@class=\"MuiGrid-root MuiGrid-item jss31 css-1wxaqej\"]"));
                    WebElement cat = wait.until(ExpectedConditions.elementToBeClickable(element1));
                    List<WebElement> list = driver.findElements(By.xpath("//span[@class=\"jss33\"]"));

                    cat.click();
                    for(WebElement ele : list){
                        System.out.println(ele.getText()) ;
                    }
                } else if(category.equalsIgnoreCase("crew")){
                    driver.findElement(By.xpath("//div[text()=\"Crew\"]")).click();
                } else if (category.equalsIgnoreCase("vendor")) {
                    driver.findElement(By.xpath("//div[text()=\"vendor\"]")).click();
                }else{
                    driver.findElement(By.xpath("//div[text()=\"Wedding FilmMakers\"]")).click();
                }
                driver.navigate().back();
            }



       /* System.out.println("Number of categories under Artist:" + list.size());
        int y=1;
        for (WebElement element : list) {
            String listnames = element.getText();
            System.out.println(y +" "+ listnames);
            y++;
        }
        driver.navigate().back();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//div[text()=\"Crew\"]")).click();//to click crew
        Thread.sleep(20000);
        List<WebElement> list1 = driver.findElements(By.xpath("//span [@class=\"jss28\"]"));//all categories
        System.out.println("Number of categories under crew:" + list1.size());
        int x=1;
        for (WebElement element : list1) {
            String names = element.getText();
            System.out.println( x +" "+ names);
            x++;
        }
        driver.navigate().back();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//div[text()=\"vendor\"]")).click();//vendor click
        Thread.sleep(20000);
        List<WebElement> list2 = driver.findElements(By.xpath("//span [@class=\"jss28\"]"));
        System.out.println("Number of categories under vendor:" + list2.size());
        int j=1;
        for (WebElement element : list2) {
            String names1 = element.getText();
            System.out.println(j +" "+ names1);
           j++;
        }
        driver.navigate().back();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//div[text()=\"Wedding FilmMakers\"]")).click();
        Thread.sleep(9000);
        List<WebElement> list3=driver.findElements(By.xpath("//span [@class=\"jss28\"]"));
        System.out.println("Number of categories under Wedding filmmaker:"+list3.size());
        int i=1;
        for(WebElement element:list3){
            String name2=element.getText();
            System.out.println(i + " " +name2);
            i++;

        }
        driver.navigate().back();
        driver.quit();

        */

        }
    }






