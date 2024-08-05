package APITESTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ManualAPITesting {
    public static void main(String[] args) throws IOException {
        //Define API edn point
        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
        URL url = new URL(endpoint);
        //to get openconnection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
       // connection.set//
        //to get response code
        int responsecode = connection.getResponseCode();
        System.out.println(" Response code:" + responsecode);
        //this line Bufferreader get response from server and inputstream convert them to byte stream into getinputstream
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputline;

        StringBuilder response = new StringBuilder();

        while ((inputline = in.readLine()) != null) {
            response.append(inputline);

            System.out.println(" Response code" + response.toString());

        }
        in.close();

    }
}
