package JavaOOP;

public class Javaconstructor {
    String sound;

    public Javaconstructor(String voice) {
    };
        public static void main (String[]args){
            Javaconstructor cat = new Javaconstructor("meow meow");//classname objectname =new keyword and construtorname
            System.out.println(cat.sound);
            Javaconstructor dog = new Javaconstructor("bark bark");
            System.out.println(dog.sound);
        }
    }

