package methods.methods;

public class Smalltask {
  public  static void userdata(String name){
      System.out.println(name);
  }
 static void userdata(String name,int Age){
      System.out.println(name + Age);
  }
  public static void main(String[]args){
      userdata("Anitha");
      userdata("anitha",20);
  }
}
