package ForLoop;

public class Strongnumber {
    public class strongnumber {

        public static void main(String[] args) {
            int n = 157;
            int nn=157;
            int rem;

            int res=0;
            while (n > 0 ){
                rem = n % 10;
                res = res * 10 + rem;
                n = n / 10;
            }
            System.out.println(res);

            if(nn == res){
                System.out.println("palindrome");
            } else{
                System.out.println("not palindrome");
            }



        }
    }

}

