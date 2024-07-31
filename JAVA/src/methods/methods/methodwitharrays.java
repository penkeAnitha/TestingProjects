
package methods.methods;

public class methodwitharrays {
    public static int findmax(int numbers[]) {
        int findmax = numbers[0];
        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] > findmax) {
                findmax = numbers[i];
            }
        }
        return findmax;

    }
    public static void main(String[] args) {
       int num[] ={ 5,3,9,2,7};
       int maxnumber=findmax(num);
       System.out.println(maxnumber);



    }
}


