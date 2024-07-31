package JavaOOP;

public class Vehicel {
    String noise;
    public Vehicel( String heavy){
        noise=heavy;
    }
    public static void main(String[]args){
       Vehicel Herohonda=new Vehicel("pollution");
       System.out.println(Herohonda.noise);

    }
}
