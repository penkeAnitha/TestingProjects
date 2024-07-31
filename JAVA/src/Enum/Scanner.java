package Enum;
import java.util.Scanner;
  class Num {
     public static void main(String[] args) {
         Scanner obj1 = new Scanner(System.in);
         String name = obj1.nextLine();
         int num = obj1.nextInt();
         double salary = obj1.nextDouble();

         System.out.println("name" + name);
         System.out.println("Salary:" + salary);
         System.out.println("num:" + num);
     }
 }

 /*import java.util.Scanner;
 class input{
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("input number");
        int input=in.nextInt();
        if(input>0)
        {
            System.out.println("positive number");
        }
        else if(input<0)
        {
            System.out.println("negative number");
        }
        else
        {
            System.out.println("number is negative");
        }

    }
}

  */


