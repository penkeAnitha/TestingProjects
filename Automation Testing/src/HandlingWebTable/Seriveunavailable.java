package HandlingWebTable;

import DriverSetup.Chromedriversetup;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Seriveunavailable extends Chromedriversetup {
    public static void main(String[] args) throws IOException, InterruptedException {
        Chromedriversetup.Chromedriversetup();
        WebDriver driver = getdriver();
        //503 Serivce Unavailable response code
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://httpbin.org/status/503")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status Code: " + response.statusCode());


    }
}
