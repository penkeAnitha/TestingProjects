package methods.methods;

public class methodAverage {
    public static int Average(int numbers[]) {
        int sum = 0;
        int Average = 0;
        for (int x = 1; x < numbers.length; x++) {
            sum=Average/numbers[x];

        }
        return Average;
    }
    public static void main(String[]args){
        int number[]={10,30,40,50,};
        int input=Average(number);
        System.out.println(input);

    }
}
