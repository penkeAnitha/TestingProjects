package methods.methods;

/*  public class methodsum {
      public static int sum(int numbers[]) {
          int sum = 0;
          for (int x = 0; x < numbers.length; x++) {
              sum = sum + numbers[x];
          }
          return sum;
      }

      public static void main(String[] args) {
          int numbers[] = {3, 5, 9, 10, 20};
          int output = sum(numbers);
          System.out.println(output);

      }

  }
  */

 class Methodsum {
    static int Sum(int x,int y){
        int Sum=0;
        return x+y;
    }
    public static void main(String[]args){
        int result=Sum(50,100);
        System.out.println(result);
    }
}

