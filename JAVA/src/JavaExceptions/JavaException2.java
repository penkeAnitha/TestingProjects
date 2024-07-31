package JavaExceptions;

public class JavaException2 {
    static void Checkage(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access not denied,you are not old enough");
        }
        else{
        System.out.println("Access denied,you are old enough");
        }
    }
    public static void main(String[]args){
        Checkage(20);
    }

}



