package NestedLoops;

public class Pattern1{
        public static void main(String[]args){
            int row=3;
            for(int i=1;i<=row;i++){
                for(int x=row;x>=i;x--) {
                    System.out.print(" ");
                }
                for(int y=1;y<=2*i-1;y++){
                    System.out.print("*");

                }
                System.out.println();
            }

        }
    }


