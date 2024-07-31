package methods.methods;

public class methodsoverloading {
    static int plusmethod(int x,int y){
        int Z=x+y;
        return Z;
        }
    static double plusmethod(double x,double y){
        double Z=x+y;
        return Z;
    }
    public static void main(String[]args){
      int a=plusmethod(20,50);
      double b=plusmethod(20,50);
      System.out.println(a);
      System.out.println(b);

    }

}
