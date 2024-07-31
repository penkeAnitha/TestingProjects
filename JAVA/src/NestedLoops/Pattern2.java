package NestedLoops;

public class Pattern2 {
        public static void main(String[]args){
            int row=4;
            for(int y=1;y<=row;y++){
                for(int x=row;x>=y;x--){
                    System.out.print(" ");
                }
                for(int i=1;i<=2*y-1;i++){
                    if(i%2!=0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

        }
    }



