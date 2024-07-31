package Practiceclass;
//write a java program to crete a class name"Pet" with attributes species,name,age.create subclass called dog ,bird that add specific attributed like "favoritetoy"and
// "wingspan"and implements method to printdetails() of both "dog"and "bird"and calculate pets age  in human years.//


public class Pet {
    public String name;
    public String species;
    public int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void printdetails() {
        System.out.println("Name:" + name);
        System.out.println("Species:" + species);
        System.out.println("Age:" + age + "years");

    }

}


