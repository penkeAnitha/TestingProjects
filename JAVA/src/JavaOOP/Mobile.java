package JavaOOP;

public class Mobile {
      int Storage;
      int Ram;
      int Gb;
      public Mobile(int Storage, int Ram, int Gb) {
            this.Storage = Storage;
           this. Ram = Ram;
           this. Gb = Gb;
      }
      public void Printdetails() {
            System.out.println("Storage:" + this.Storage);
            System.out.println("Ram:" + this.Ram);
            System.out.println("Gb:" + this.Gb);
            }
            public static void main(String[]args){
            Mobile Vivo=new Mobile(128,6,4);
                  Vivo.Printdetails();
            }


}





