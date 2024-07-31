package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Notfoundresponsecode extends Chromedriversetup {
    public static void main(String[] args) throws IOException, InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        //404 Not Found Response Code
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://httpbin.org/status/404"))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code: " + response.statusCode());

    }
}
