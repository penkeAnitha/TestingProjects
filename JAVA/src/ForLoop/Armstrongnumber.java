package ForLoop;

public class Armstrongnumber {
        public static void main(String[] args) {
            int number = 407;
            int n =number;
            int rn;
            int rs=0;
            while(number>0){
                rn=number%10;
                rs=rn*rn*rn+rs;
                number=number/10;
            }
            System.out.println(rs);
            if(n==rs){
                System.out.println("armstrong number");
            }else{
                System.out.println("not armstrong number");
            }
        }
    }


