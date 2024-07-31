package methods.methods;

public class parametersmethods {

        static void userName(String fname,int age) {
            //here fname is called parameter
            System.out.println("My name is" + " "+ fname +" "+ "and my age is" +" "+ age);
        }

        public static void main(String[] args) {
            //here value name is argument
            userName("Prakash",30);
            userName("anitha",40);
            userName("Swathi", 50);

       }
    }

