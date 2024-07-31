package ArrayList;
import java.util.ArrayList;
public class ArraylistExample {
public static void main(String[]args) {
 ArrayList<String> cars = new ArrayList<String>();
 cars.add("volvo");//we can loop through Arraylist with for loop
 cars.add("bmw");
 cars.add("toyota");
 cars.add("suzuki");
 for (int j = 0; j < cars.size(); j++) {
  System.out.println(cars.get(j));
 }
}
}
