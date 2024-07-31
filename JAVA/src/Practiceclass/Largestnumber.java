
 //Write a Java program that takes three numbers from the user and prints the greatest number//
package Practiceclass;
import java.util.Scanner;
public class Largestnumber{
public static void main(String[]args) {
Scanner scanner=new Scanner(System.in);

System.out.println("input the first number is num1");
    int num1=scanner.nextInt();
    System.out.println("input the second number is num2");
    int num2=scanner.nextInt();
    System.out.println("input the third number is num3");
    int num3=scanner.nextInt();
    if(num1>num2) {
    } if(num1>num3) {
        System.out.println("the greatest :" + num1);
    }if(num2>num1) {
    }if(num2>num3) {
        System.out.println("the greatest:" + num2);
    }if(num3>num1) {
    }if(num3>num2) {
        System.out.println("the greatest:" + num3);
    }
}
}
