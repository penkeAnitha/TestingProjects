package NestedLoops;

public class Numberchangingtriangle {
        public static void main(String[]args){
            int number=1;
            for(int j=1;j<=4;j++){
                for(int x=1;x<=j;x++){
                    System.out.print(number);
                    number++;
                }
                System.out.println();
            }

        }
    }


