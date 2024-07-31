package JavaExceptions;

public class JavaException4 {
public static void main(String[]args){
try{
throw new IllegalAccessException (" error occured ");
}catch(Exception a){
 System.out.println("Exception occured"+ a.getMessage());
}
}
}
