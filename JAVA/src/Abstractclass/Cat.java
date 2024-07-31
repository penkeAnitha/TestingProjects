package Abstractclass;

public class Cat extends Abstract1 {
public void sound(){
    System.out.println("Meow Meow");
}
public static void main(String[]args){
      Cat myCat=new Cat() {
      };
      myCat.sound();

    }

    }


