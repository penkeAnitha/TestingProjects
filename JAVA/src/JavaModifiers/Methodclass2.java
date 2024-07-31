package JavaModifiers;

public class Methodclass2 {// have to create object while with public and call the method  through object.
    public void Mymethod(){
        System.out.println(" i am going to mall");
    }
    public static void main(String[]args){
        Methodclass2 obj2 =new Methodclass2();
        obj2.Mymethod();
    }
}
