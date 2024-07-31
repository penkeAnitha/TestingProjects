package JAVA;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N >= 1 && N <= 100) {
            if (N % 2 != 0) {
                System.out.print("Weird");
            } else {
                if (N >= 2 && N <= 5) {
                    System.out.print("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.print("Weird");
                } else {
                    System.out.print("Not Weird");
                }
            }
            scanner.close();
        }
    }
}
