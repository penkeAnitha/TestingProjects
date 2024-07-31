package Practiceclass;

import java.util.Scanner;
//Write a Java program that takes a number from the user and generates an integer between 1 and 7.
// It displays the weekday name.//
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int day = scanner.nextInt();
        System.out.println(getDayName(day));
    }

    public static String getDayName(int   day){
     String Day=" ";
     switch (day){
         case 1:
             Day="monday";
     break;
         case 2:
          Day="tuesday";
     break;
         case 3:
         Day="wednesday";
      break;
         case 4:Day="thursday";
       break;
         case 5:
             Day="friday";
        break;
         case 6:
             Day="saturday";
        break;
         case 7:
             Day ="sunday";
         break;
         default:
        }
        return Day;

    }
}




