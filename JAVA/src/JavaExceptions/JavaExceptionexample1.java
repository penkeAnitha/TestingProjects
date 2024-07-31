package JavaExceptions;

public class JavaExceptionexample1 {
    public static void main(String[] args) {
        try {
            int[] num = {3, 7, 9};
            System.out.println(num);
        } catch (Exception e) {
            System.out.println(" error");
        } finally {
            System.out.println("try catch is finished ");
        }

    }
}


