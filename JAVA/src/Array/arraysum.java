package Array;

public class arraysum {
    public static void main(String[]args){
        int sum=0;
        int[] numbers={10,20,30,40,50,60};
        for(int x=0;x<numbers.length;x++){
           sum=sum+numbers[x];
        }
      System.out.println(sum);

    }
}
