package JAVA;

public class AndOrNOtoperator {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        boolean result = (x < 20) && (y < 30);
        System.out.println(result);//returns true if both are true;

        int i = 3;
        int j = 10;
        boolean output = (i < 20) || (j > 50);
        System.out.println(output);//return false or true if one of  statement is true;

        int r = 40;
        int b = 50;
        boolean input = !((r < 30) && (b > 60));
        System.out.println(input);//reverse the result ;


    }
}
