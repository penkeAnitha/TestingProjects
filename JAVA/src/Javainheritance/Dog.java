package Javainheritance;

public class Dog extends AnimalIn{
    String name1 = "Dog";
    public void soundmakes(){
        System.out.println("Sound makes ");
    }


    public static void main(String[]args){
        Dog myDog=new Dog();
        myDog.sound();
        System.out.println(myDog.name);
    }

}