package Practiceclass;

public class Largestelement {
    public static void main(String[] args) {
        int[] array = {10, 30, 50, 70, 100};
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
       System.out.println("the largest element:"+max);
    }
}
