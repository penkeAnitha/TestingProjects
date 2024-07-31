package ForLoop;

public class Primenumber {
        public static void main(String[] args) {
            int number=7;
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number% i == 0) {
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime number");
            }

        }
    }

