package NestedLoops;
public class Leftagletraingle{
    public static void main(String[]args){
        for(int row=1;row<=4;row++) {
            for (int column = row; column >= 1; column--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


