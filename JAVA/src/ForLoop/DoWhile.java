package ForLoop;

public class DoWhile{
    public static void main(String[] args) {
        int number = 10;
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        } while (i <= number);


    }
}

