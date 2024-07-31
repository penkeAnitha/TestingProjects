package methods.methods;

public class Practice {
    static int Largestnumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
            if (num3 > max) {

            }
        }
            return max;
        }
        public static void main (String[]args){
            int num1 = 10;
            int num2 = 40;
            int num3 = 20;
            int result = Largestnumber(num1, num2, num3);
            System.out.println(result);

        }
    }


