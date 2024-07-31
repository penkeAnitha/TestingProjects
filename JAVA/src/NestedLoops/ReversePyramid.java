package NestedLoops;

public class ReversePyramid{
        public static void main(String[] args) {
            int row=3;
            for(int j =row;j>=1;j--) {
                for (int y = row; y >= j; y--) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= 2 * j - 1; x++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }
    }

