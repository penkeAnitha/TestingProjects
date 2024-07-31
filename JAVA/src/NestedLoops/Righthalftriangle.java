package NestedLoops;

public class Righthalftriangle {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int y = N; y >= i; y--) {
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




