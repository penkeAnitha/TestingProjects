package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;


public class Brokenlinks  extends Chromedriversetup {
    public static void main(String[] args) throws IOException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println(" URL is empty or Null");
            }else if (!url.startsWith("https://") && !url.startsWith("http://")) {
                System.out.println("Skipping non-http link:" + url);
                continue;
            }

            try {//Check HTTP Status Code
                URL linkurl = new URL(url);//Opens a connection to the URL.
                HttpURLConnection httpURLConnection = (HttpURLConnection) linkurl.openConnection();
                HttpURLConnection httpConn = httpURLConnection;
                httpConn.setRequestMethod("HEAD");//to check status of each link set the request method
                int responseCode = httpConn.getResponseCode();//Retrieves the HTTP response status code.

                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link. Response Code: " + responseCode);
                } else {
                    System.out.println(url + "is a valid link. Response Code: " + responseCode );
                }

            } catch (Exception e) {
                System.out.println(url + " is a broken link.Exception: " + e.getMessage());

            }

        }
        driver.quit();
    }
}


