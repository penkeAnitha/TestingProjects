package ArrayList;
import java.util.ArrayList;
    public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("toyoto");
        cars.add("mazda");
        cars.set(0, "volvo");//to modify an element use set method.
        cars.clear();//to remove all element in arraylist.
        cars.remove(0);//to remove an elements in arraylist.
        System.out.println(cars.size());//to find out how many elements in arraylist.

    }
}