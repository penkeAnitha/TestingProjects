package JavaOOP;

public class Nameclass {
    int modelYear;
    String modelName;
    public Nameclass(int year,String name) {
      modelYear =year;
      modelName =name;
    }

    public static void main(String[] args) {
    Nameclass car=new Nameclass(5,"BMW");
    System.out.println("My model year is" + " " + car.modelYear + " " + "My model name is " + car.modelName);

    }
}

