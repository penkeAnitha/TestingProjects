package JavaExceptions;

public class Javaexceptionexample {
    public static void main(String[] args) {
//int[]mynumbers={1,5,8};
//System.out.println(mynumbers[10]);
        try {
            int[] numbers = {4, 10, 20};
            System.out.println((numbers[20]));
        } catch (Exception e) {
         System.out.println("error problem");
        }
    }
}