package Wrapperclass;

import java.util.Scanner;

public class WrapperclassExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("oijnkihukj");
        Integer num1;
        try {
           num1 = sc.nextInt();
        }catch (Exception e){
          // System.out.println( e.getMessage());
            e.printStackTrace();
        }
        Integer num2 = 70;
         Integer num3=20;
      System.out.println(num2);

//        Integer myint =20;
//        String myString=myint.toString();
//        System.out.println(myString.length());
//        System.out.println(myint);



    }
}


