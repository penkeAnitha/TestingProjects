package Polymorphism;

public class Bird extends Animal{
     public void sound(){
        System.out.println(" kuu kuu");
    }
    public static void main(String[]args){
        Bird myBird=new Bird();
        myBird.sound();
    }
}
