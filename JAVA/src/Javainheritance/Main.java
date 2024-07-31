package Javainheritance;
public class Main {

    static  class  Animal {
        void sound() {
            System.out.println("Animal sounds heavy");
        }
    }

    static class Dog extends Animal{ //subclass
        void sound() {
            System.out.println("Dog is barking");
        }
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal();//superclass
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();
    }
}


























