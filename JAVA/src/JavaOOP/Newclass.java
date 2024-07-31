package JavaOOP;

public class Newclass {
    public void fullthrottle(){
        System.out.println("Full throttrlr");
        }
    public void maximumspeed(int speed){
        System.out.println("it should go on this speed" + " " + speed);
    }

    public Newclass() {
    }

    public static void main(String[]args){
        Newclass  bmw =new Newclass();
        Newclass  volvo=new Newclass();
        bmw.fullthrottle();
        volvo.maximumspeed(100);
        bmw.maximumspeed(200);


    }
}
