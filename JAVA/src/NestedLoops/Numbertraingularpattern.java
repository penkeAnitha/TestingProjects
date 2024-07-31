package NestedLoops;

public class Numbertraingularpattern {
        public static void main(String[] args) {
            int number = 10;
            for (int x = 1; x <= number; x++) {
                for (int y = 1; y <= number - x; y++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= x; i++) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }


