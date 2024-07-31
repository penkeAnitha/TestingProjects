package JAVA;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Example2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            {
                System.out.printf("%d x %d = %d", N, i, (N * i));
                System.out.println();

            }
            bufferedReader.close();
        }
    }
}