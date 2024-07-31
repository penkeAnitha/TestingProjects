package methods.methods;

public class Recursion {
        static int factorial(int n){
            if(n==0||n==1){
                return 1;
            }else {
                return factorial(n - 1);
            }
        }
        public static void main(String[]args){
            int number=10;
            System.out.println(factorial(number));

        }
    }


