package Polymorphism;

public class Pig {//method overriding
    void Sound(){
        System.out.println(" wee wee");
    }
    public static void main(String[]args){
        Pig myPig=new Pig();
        myPig.Sound();
    }


}