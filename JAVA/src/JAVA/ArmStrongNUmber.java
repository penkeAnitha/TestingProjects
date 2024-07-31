package JAVA;

public class ArmStrongNUmber {
    public static void main(String[] args) {
        int number = 407;
        int n=number;
        int rem;
        int rs = 0;
        while (number > 0) {
            rem= number % 10;
            rs = rem*rem*rem+rs;
            number = number / 10;
        }
        System.out.println(rs);
        if(n==rs){
            System.out.println("Armstrongnumber");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}

