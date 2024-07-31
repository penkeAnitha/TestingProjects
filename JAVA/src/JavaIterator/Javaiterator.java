package JavaIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class Javaiterator {
    public static void main(String[] args) {
        ArrayList<String> Car = new ArrayList<String>();
        Car.add("suzuki");
        Car.add("volvo");
        Car.add("bmw");
        Car.add("toyota");
      System.out.println(Car);

        Iterator<String> it = Car.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if(s.equals("bmw")){
               it.remove();

            }

        }
        System.out.println(Car);

    }
}