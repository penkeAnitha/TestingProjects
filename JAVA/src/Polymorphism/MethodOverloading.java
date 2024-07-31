package Polymorphism;

public class MethodOverloading {
    int Add(int x,int y,int z){
      return x+y+z;

    }
    double Add(double x, double y){
        return x+y;
    }
    int Add(int x,int y){
        return x+y;
    }
    String Add(String x){
        return x;
    }

    public static void main(String[]args){
        MethodOverloading s = new MethodOverloading();
        String res= s.Add("anitha");
        System.out.println(res);
    }


}
