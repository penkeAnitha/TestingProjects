package JAVA;
import java.util.Scanner;
public class Exercise1 {
 public static void main(String[]args){
 Scanner scanner=new Scanner(System.in);
 System.out.println("input first number:");
 double y=scanner.nextDouble();
 System.out.println("input second number:");
 double x=scanner.nextDouble();
 System.out.println("input third number:");
 double z= scanner.nextDouble();
 if(y<x && y<z) {
     System.out.println("increasing order");
 }
 else if(y>x&&y>z){
  System.out.println("Decreasing order");
 }
 else{
System.out.println("either increasing order or Decreasing order");
 }

 }
}
