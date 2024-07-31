package JavaExceptions;

public class JavaException3 {
 static void CheckEven(int num){
  if(num%2==0){
  throw new ArithmeticException("print even number");
  }
  else{
 System.out.println("print odd number");
  }
 }
 public static void main(String[]args){
  CheckEven(4);
 }

}
