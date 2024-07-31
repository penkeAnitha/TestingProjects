package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Responsecode3 extends Chromedriversetup {
    public static void main(String[] args) throws IOException, InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        //400 Bad Request response code
        HttpClient httpClientclient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://httpbin.org/status/400")).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code: " + response.statusCode());
    }
}

