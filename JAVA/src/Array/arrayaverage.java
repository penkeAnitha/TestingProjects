package Array;

import java.lang.reflect.Array;

public class arrayaverage {
    public static void main(String[]args){
      int []numbers=  {10,20,30,40,50,60};
int sum=0;
int average;
    for(int i=0;i<numbers.length;i++){
     sum= sum+numbers[i];
    }
    average=sum/numbers.length;
       System.out.println(average);
        }

    }

