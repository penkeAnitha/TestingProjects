package NestedLoops;

public class Pyramidpattern {
        public static void main(String[] args) {
            int rows = 4;
            for (int i = 1; i <= rows; i++) {
                for (int j = rows; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= 2 * i - 1; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }





