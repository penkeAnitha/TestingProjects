package JavaOOP;

public class Wildanimals {
    int age;
    String name;
    public Wildanimals() {
        age=5;
        name= "tiger";
    }
    public static void main (String[]args){
        Wildanimals Animal=new Wildanimals();
        System.out.println(" Animal name is " +Animal.name+ " " + "Animal age is"+ " " +Animal.age );


    }
}
