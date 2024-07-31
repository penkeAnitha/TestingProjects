package NestedLoops;

public class Outerloopandinnerloop {
        public static void main (String[]args){
            int number=5;
            for(int x=1;x<=number;x++){
                for(int j=1;j<=x;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }


