package Practiceclass;

public class Dog extends Pet {
    String favoritetoy;

    public Dog(String name, int age, String favoritetoy) {
        super(name, "dog", age);//here constructor call superclass.
        this.favoritetoy = favoritetoy;
    }

    public void printdetails() {
        super.printdetails();
        System.out.println("favorite:" + favoritetoy);
    }
    public int calculateHumanAge() {
        if (species.equals("Dog")) {
            return age;
        } else {
            // Assuming bird's age in human years is the same as actual age
            return age;
        }
    }
}

